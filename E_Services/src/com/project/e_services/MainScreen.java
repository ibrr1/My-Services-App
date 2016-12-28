package com.project.e_services;

import java.lang.reflect.Field;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.ColorDrawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewConfiguration;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.EditText;
import android.widget.Toast;

import com.parse.ParseException;
import com.parse.ParseInstallation;
import com.parse.ParseObject;
import com.parse.ParseUser;
import com.parse.PushService;
import com.parse.SaveCallback;

public class MainScreen extends Activity {

	final Context context = this;

	// Declare the Buttons 
	Button govBtn, univBtn, banksBtn, flyBtn, charityBtn, newsBtn, browserBtn, favBtn, locationBtn;
	
	// Declare Boolean value 
	boolean notification_off;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//link the activity with the main_screen.xml layout
		setContentView(R.layout.main_screen);

		// to call the Startup_Dialog Activity every time.
		Startup_Dialog.app_launched(this);
		

		//To links the buttons with the main_screen.xml layout
		govBtn = (Button) findViewById(R.id.govBtn);
		univBtn = (Button) findViewById(R.id.univBtn);
		banksBtn = (Button) findViewById(R.id.banksBtn);
		flyBtn = (Button) findViewById(R.id.flyBtn);
		charityBtn = (Button) findViewById(R.id.charityBtn);
		newsBtn = (Button) findViewById(R.id.newsBtn);
		browserBtn = (Button) findViewById(R.id.browserBtn);
		favBtn = (Button) findViewById(R.id.favBtn);
		locationBtn = (Button) findViewById(R.id.locationBtn);

		// To remove the app icon from the actionbar
		getActionBar().setIcon(new ColorDrawable(getResources().getColor(android.R.color.transparent)));

		// This what happen when the user click on government website button. 
		govBtn.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				//check the Internet connection
				if (!isNetworkAvailable()) { 
					//if there is no Internet CheckInternet method will be called and dialog will show to the user
					CheckInternet();

				} else {
					//if the Internet is working the user will move to WebsitesList_gov Activity
					Intent i = new Intent(getApplicationContext(), WebsitesList_gov.class);
					//to start the WebsitesList_gov Activity
					startActivity(i);

				}
			}
		});

		univBtn.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if (!isNetworkAvailable()) { CheckInternet();

				} else {
					Intent i = new Intent(getApplicationContext(), WebsitesList_univ.class);
					startActivity(i);

				}
			}
		});

		banksBtn.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if (!isNetworkAvailable()) { CheckInternet();

				} else {
					Intent i = new Intent(getApplicationContext(), WebsitesList_banks.class);
					startActivity(i);

				}
			}
		});

		flyBtn.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if (!isNetworkAvailable()) { CheckInternet();

				} else {
					Intent i = new Intent(getApplicationContext(), WebsitesList_fly.class);
					startActivity(i);

				}
			}
		});
		
		charityBtn.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if (!isNetworkAvailable()) { CheckInternet();

				} else {
					Intent i = new Intent(getApplicationContext(), WebsitesList_charity.class);
					startActivity(i);

				}
			}
		});

		newsBtn.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if (!isNetworkAvailable()) { CheckInternet();

				} else {
					Intent i = new Intent(getApplicationContext(), WebsitesList_news.class);
					startActivity(i);

				}
			}
		});
		
		browserBtn.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if (!isNetworkAvailable()) { CheckInternet();

				} else {
				    startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse("http://www.google.com")));
				}
			}
		});

		
		favBtn.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if (!isNetworkAvailable()) { CheckInternet();

				} else {
					Intent i = new Intent(getApplicationContext(), FavList.class);
					startActivity(i);

				}
			}
		});
		
		locationBtn.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if (!isNetworkAvailable()) { CheckInternet();

				} else {
					Intent i = new Intent(getApplicationContext(), Nearby_PlacesMainActivity.class);
					startActivity(i);

				}
			}
		});
		


		//
		SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
		notification_off = prefs.getBoolean("notification_off", false); //no id: default value
		
		if(notification_off==true){
			notification_off();

		}
		else{
			notification_on();
		}
					
		// =================================================================================
		
		//calling the getOverflowMenu method to show the menu options
		getOverflowMenu();	

		}

	// =======================================================================================================
	
	// Creating the menu
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		MenuInflater inflater = getMenuInflater();
		//linking the menu to main_screen_menu.xml
		inflater.inflate(R.menu.main_screen_menu, menu);
		return super.onCreateOptionsMenu(menu);
	}


	// ========================================================================================
	
	//Creating  menu options
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {

		super.onOptionsItemSelected(item);

		switch (item.getItemId()) {

		//when the user click on تواصل معنا
		case R.id.feedback:
		//calling feedback method
		feedback();
		break;
			
		//when the user click on اعدادات الاشعارات
		case R.id.notifications_setting:		
		//calling notifications_setting method
		notifications_setting();
		break;
			
		//when the user click on عن التطبيق
		case R.id.about:
		//calling notifications_setting method
		about();
		break;

		}

		return true;

	}

		//==============About Method==============
		public void about() {
					// get prompts_about.xml view
					LayoutInflater li = LayoutInflater.from(context);
					View promptsView = li.inflate(R.layout.prompts_about, null);
					
					//Creating AlertDialog
					AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
					
					//Adding the title
					alertDialogBuilder.setTitle("عن التطبيق");
					
					// set prompts.xml to alertdialog builder
					alertDialogBuilder.setView(promptsView);
					
					// create alert dialog
					AlertDialog alertDialog = alertDialogBuilder.create();
					// Setting Icon to Dialog
					alertDialog.setIcon(R.drawable.icon_about);

					// Setting OK Button
					alertDialog.setButton("الغاء", new DialogInterface.OnClickListener() {
						public void onClick(DialogInterface dialog, int which) {
							// Write your code here to execute after dialog closed
						}
					});

					// show it
					alertDialog.show();
	}

	//===============notifications_setting Method=====================
	public void notifications_setting() {
		// get prompts_notifications_setting.xml view
		LayoutInflater li = LayoutInflater.from(context);
		View promptsView = li.inflate(R.layout.prompts_notifications_setting, null);
		
		//Creating AlertDialog
		AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
		
		//adding the title
		alertDialogBuilder.setTitle("الاشعارات");
		alertDialogBuilder.setIcon(R.drawable.icon_settings);
		
		// set prompts.xml to alertdialog builder
		alertDialogBuilder.setView(promptsView);
		
		// declare and link CheckBox prompts_notifications_setting.xml layout
		final CheckBox cb1 = ((CheckBox) promptsView.findViewById(R.id.cb1));
		
		// if notification_off value is = true then make CheckBox is true 
		if(notification_off==true){
			cb1.setChecked(true);
		}
		// if notification_off value does not = true then make CheckBox is false 	
		else{
			cb1.setChecked(false);
			
		}

		// when the user click on the CheckBox the do the following:
		cb1.setOnCheckedChangeListener(new OnCheckedChangeListener() {

			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				//if the CheckBox is checked 
				if (isChecked) {
					//show message تم ايقاف الاشعارات
					Toast.makeText(getBaseContext(),"تم ايقاف الاشعارات",Toast.LENGTH_SHORT).show();
					
					//create SharedPreferences and then make notification_off value is = true
					 SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
					 SharedPreferences.Editor editor = prefs.edit();
					 editor.putBoolean("notification_off", true);
					 editor.commit();	
					 
					 //Get the notification_off value from the SharedPreferences
					 notification_off = prefs.getBoolean("notification_off", false); //no id: default value
						
					// if the notification_off value is = true call notification_off method
						if(notification_off==true){
							notification_off();

						}
						
					// if the notification_off value does not = true call notification_on method
						else{
							notification_on();
						}		
					 }
				// if the CheckBox is unchecked
				else{
					//create SharedPreferences and then make notification_off value is = false
					 SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
					 Toast.makeText(getBaseContext(),"تم تفعيل الاشعارات",Toast.LENGTH_SHORT).show(); 
					 SharedPreferences.Editor editor = prefs.edit();
					 editor.putBoolean("notification_off", false);
					 editor.commit();	
					 //Get the notification_off value from the SharedPreferences
					 notification_off = prefs.getBoolean("notification_off", false); //no id: default value
					 
					// if the notification_off value is = true call notification_off method	
						if(notification_off==true){
							notification_off();

						}
						// if the notification_off value does not = true call notification_on method
						else{
							notification_on();
						}

				}
			}
		});
				 		
		// create alert dialog
		AlertDialog alertDialog = alertDialogBuilder.create();
		
		// Setting OK Button
				alertDialog.setButton("الغاء", new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog, int which) {
						// Write your code here to execute after dialog closed
					}
				});

		// show the alertDialog
		alertDialog.show();
	}
	
	//notification_on method, which will allow the user to receive notifications
	public void notification_on() {
	//	ParseAnalytics.trackAppOpened(getIntent());
		// inform the Parse Cloud that it is ready for notifications
		PushService.setDefaultPushCallback(this, MainScreen.class);
		
		ParseInstallation.getCurrentInstallation().saveInBackground(new SaveCallback() {
			@Override
			public void done(ParseException e) {
				if (e == null) {				
				} else {
					e.printStackTrace();				
				}
			}
		});
		
	} 	
	//notification_off method, which will stop the user from receiving notifications
	public void notification_off() {
	//	ParseAnalytics.trackAppOpened(getIntent());
		// inform the Parse Cloud that it is ready for notifications
		PushService.setDefaultPushCallback(this, null);
		//ParseInstallation.getCurrentInstallation().saveInBackground();
	} 
	// ========================= for overflow =========================
	
	//getOverflowMenu method to show the 3 dots 
	private void getOverflowMenu() {

		try {
			ViewConfiguration config = ViewConfiguration.get(this);
			Field menuKeyField = ViewConfiguration.class.getDeclaredField("sHasPermanentMenuKey");
			if (menuKeyField != null) {
				menuKeyField.setAccessible(true);
				menuKeyField.setBoolean(config, false);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
   // feedback method to allow the user to send feedback
	public void feedback() {
		// get prompts.xml view
		LayoutInflater li = LayoutInflater.from(context);
		View promptsView = li.inflate(R.layout.prompts_contact_us, null);
				
		AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
		alertDialogBuilder.setIcon(R.drawable.icon_contact_us);

		// set prompts.xml to alertdialog builder
		alertDialogBuilder.setView(promptsView);
		alertDialogBuilder.setTitle("تواصل معنا");

		final EditText userInput = ((EditText) promptsView.findViewById(R.id.editTextDialogUserInput));

		// set dialog message
		alertDialogBuilder.setCancelable(false).setPositiveButton("ارسال", new DialogInterface.OnClickListener() {
							public void onClick(DialogInterface dialog, int id) {
								// When the user clicks "Save," upload the
								// post to Parse
								// Create the Post object
								ParseObject post = new ParseObject("Feedbacks");
								post.put("textContent", userInput.getText().toString());

								// Create an author relationship with the
								// current user
								post.put("author",ParseUser.getCurrentUser());

								// Save the post and return
								post.saveInBackground(new SaveCallback() {

									@Override
									public void done(ParseException e) {
										if (e == null) {
											setResult(RESULT_OK);

										} else {
											Toast.makeText(getApplicationContext(),"Error saving: "+ e.getMessage(),
													Toast.LENGTH_SHORT).show();
										}
									}

								});
								Toast.makeText(getBaseContext(),"تم الارسال",Toast.LENGTH_SHORT).show();
							}
						})
				.setNegativeButton("الغاء",new DialogInterface.OnClickListener() {
							public void onClick(DialogInterface dialog,
									int id) {
								dialog.cancel();
								Toast.makeText(getBaseContext(),"تم الالغاء", Toast.LENGTH_SHORT).show();
							}

						});

		// create alert dialog
		AlertDialog alertDialog = alertDialogBuilder.create();

		// show it
		alertDialog.show();
	}

	//Method for AlertDialog if the Internet is not working
	public void CheckInternet() {

		AlertDialog.Builder builder = new AlertDialog.Builder(context);
		builder.setMessage("الرجاء التاكد من اتصالك بالانترنت")
				.setCancelable(false)
				.setPositiveButton("ok", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface dialog, int which) {
						dialog.dismiss();
					}
				}).create().show();

	}

	// Private class isNetworkAvailable
	private boolean isNetworkAvailable() {
		// Using ConnectivityManager to check for Network Connection
		ConnectivityManager connectivityManager = (ConnectivityManager) getApplicationContext()
				.getSystemService(Context.CONNECTIVITY_SERVICE);
		NetworkInfo activeNetworkInfo = connectivityManager
				.getActiveNetworkInfo();
		return activeNetworkInfo != null;
	}
}