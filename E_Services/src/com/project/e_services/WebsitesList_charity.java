package com.project.e_services;

import java.util.ArrayList;
import java.util.List;

import android.app.ActionBar;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.Toast;

import com.parse.ParseException;
import com.parse.ParseFile;
import com.parse.ParseObject;
import com.parse.ParseQuery;

public class WebsitesList_charity extends Activity {
	// Declare Variables
	ListView listview;
	List<ParseObject> ob;
	ProgressDialog mProgressDialog;
	WebsitesListViewAdapter_charity adapter;
	private List<Websites> websiteslist = null;


	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// Get the view from listview_main.xml
		setContentView(R.layout.listview_main);
		ActionBar actionBar = getActionBar();
		actionBar.setDisplayHomeAsUpEnabled(true);

		// Execute RemoteDataTask AsyncTask
		new RemoteDataTask().execute();

	}

	// RemoteDataTask AsyncTask
	private class RemoteDataTask extends AsyncTask<Void, Void, Void> {
		@Override
		protected void onPreExecute() {
			super.onPreExecute();
			// Create a progressdialog
			mProgressDialog = new ProgressDialog(WebsitesList_charity.this);
			// Set progressdialog title
			mProgressDialog.setTitle("الرجاء الانتظار");
			// Set progressdialog message
			mProgressDialog.setMessage("جاري تحميل البيانات...");
			mProgressDialog.setIndeterminate(false);
			// Show progressdialog
			mProgressDialog.show();
		}

		@Override
		protected Void doInBackground(Void... params) {
			// Create the array
			websiteslist = new ArrayList<Websites>();
			try {
				// Locate the class table named "Country" in Parse.com
				ParseQuery<ParseObject> query = new ParseQuery<ParseObject>("Charity_Websites");
				// by ascending
				query.orderByAscending("order");
				ob = query.find();
				for (ParseObject restaurants : ob) {
					// Locate images in image column
					ParseFile image = (ParseFile) restaurants.get("img");

					Websites map = new Websites();

					map.setTitle((String) restaurants.get("title"));
					map.setLink((String) restaurants.get("link"));

					map.setImage(image.getUrl());

					websiteslist.add(map);
				}
			} catch (ParseException e) {
				Log.e("Error", e.getMessage());
				e.printStackTrace();
			}
			return null;
		}

		@Override
		protected void onPostExecute(Void result) {
			// Locate the listview in listview_main.xml
			listview = (ListView) findViewById(R.id.listview);
			// Pass the results into ListViewAdapter.java
			adapter = new WebsitesListViewAdapter_charity(WebsitesList_charity.this,websiteslist);
			// Binds the Adapter to the ListView
			listview.setAdapter(adapter);

			// Close the progressdialog
			mProgressDialog.dismiss();
		}
	}
	
	// ====Menu=====
		@Override
		public boolean onCreateOptionsMenu(Menu menu) {
			// Inflate the menu; this adds items to the action bar if it is present.
			getMenuInflater().inflate(R.menu.listview_menu, menu);
			return true;
		}
	
		@Override
		public boolean onOptionsItemSelected(MenuItem item) {
		    super.onBackPressed();

			int itemId = item.getItemId();
	
			if (itemId == R.id.refresh) {
					Toast.makeText(getBaseContext(), "جاري التحديث...",
					Toast.LENGTH_SHORT).show();
			Intent i = new Intent(getApplicationContext(),
					WebsitesList_charity.class);
			startActivity(i);
			}
	
			return super.onOptionsItemSelected(item);
		}
	
	}
