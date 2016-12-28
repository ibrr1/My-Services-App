package com.project.e_services;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Startup_Dialog {
	// Insert your Application Title

	// Insert your Application Package Name

	// Day until the Rate Us Dialog Prompt(fDefault 2 Days)
	private final static int DAYS_UNTIL_PROMPT = 0;

	// App launches until Rate Us Dialog Prompt(Default 5 Launches)
	private final static int LAUNCHES_UNTIL_PROMPT = 1;

	public static void app_launched(Context mContext) {
		SharedPreferences prefs = mContext.getSharedPreferences("rateus", 0);
		if (prefs.getBoolean("dontshowagain", false)) {
			return;
		}

		SharedPreferences.Editor editor = prefs.edit();

		// Increment launch counter
		long launch_count = prefs.getLong("launch_count", 0) + 1;
		editor.putLong("launch_count", launch_count);

		// Get date of first launch
		Long date_firstLaunch = prefs.getLong("date_firstlaunch", 0);
		if (date_firstLaunch == 0) {
			date_firstLaunch = System.currentTimeMillis();
			editor.putLong("date_firstlaunch", date_firstLaunch);
		}

		// Wait at least n days before opening
		if (launch_count >= LAUNCHES_UNTIL_PROMPT) {
			if (System.currentTimeMillis() >= date_firstLaunch
					+ (DAYS_UNTIL_PROMPT * 24 * 60 * 60 * 1000)) {
				showRateDialog(mContext, editor);
			}
		}

		editor.commit();
	}

	public static void showRateDialog(final Context mContext,
			final SharedPreferences.Editor editor) {
		final Dialog dialog = new Dialog(mContext);
		// Set Dialog Title
		dialog.setTitle("هل ترغب في التبرع");

		LinearLayout ll = new LinearLayout(mContext);
		ll.setOrientation(LinearLayout.VERTICAL);

		TextView tv = new TextView(mContext);
		tv.setText("عن عقبة بن عامر رضي الله عنه قال: سمعت رسول الله صلى الله عليه وسلم يقول (( كل امرىء في ظل صدقته حتى يقضى بين الناس ))");
		tv.setWidth(540);
		tv.setPadding(30, 30, 20, 10);
		tv.setTextSize(16);
		ll.addView(tv);
		
		
		//Check Box
		final CheckBox ch = new CheckBox(mContext);
		ch.setText("عدم العرض مرة أخرئ");	
		ch.setPadding(30, 30, 30, 40);
		ch.setTextSize(16);	
		ll.addView(ch);



		// First Button
		Button b1 = new Button(mContext);
		b1.setText("موافق");
		
		b1.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				
				if(ch.isChecked() && editor != null ){
					
					editor.putBoolean("dontshowagain", true);
					editor.commit();
					
				}
				
			    Intent myIntent = new Intent(mContext, WebsitesList_charity.class);
			    mContext.startActivity(myIntent);
				
				dialog.dismiss();
			}
		});
		ll.addView(b1);

		// Second Button
		Button b2 = new Button(mContext);
		b2.setText("الغاء");
		b2.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				
				if(ch.isChecked() && editor != null ){
					
					editor.putBoolean("dontshowagain", true);
					editor.commit();
					
				}
				dialog.dismiss();
			}
		});
		ll.addView(b2);
		dialog.setContentView(ll);

		// Show Dialog
		dialog.show();
	}
}