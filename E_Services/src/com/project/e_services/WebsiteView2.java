package com.project.e_services;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class WebsiteView2 extends Activity {

	// Declare Variables
	WebView webview;
	String link;
	int position;


	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// Prepare the progress bar
		requestWindowFeature(Window.FEATURE_PROGRESS);
		// Get the view from webview.xml
		setContentView(R.layout.webview);
		ActionBar actionBar = getActionBar();
		actionBar.setDisplayHomeAsUpEnabled(true);
		
		
			
		Intent i = getIntent();
		// Get the result of link
		
		link = i.getStringExtra("Link");
		

		position = i.getExtras().getInt("position");

				
		// Locate the WebView in webview.xml
		webview = (WebView) findViewById(R.id.webview);

		// Enable Javascript to run in WebView
		webview.getSettings().setJavaScriptEnabled(true);

		// Allow Zoom in/out controls
		webview.getSettings().setBuiltInZoomControls(true);

		// Zoom out the best fit your screen
		webview.getSettings().setLoadWithOverviewMode(true);
		webview.getSettings().setUseWideViewPort(true);

		// Load URL
		webview.loadUrl(link);

		// Show the progress bar
		webview.setWebChromeClient(new WebChromeClient() {
			public void onProgressChanged(WebView view, int progress) {
				setProgress(progress * 100);
			}
		});
		// ------------------------------------------------------
		// Call private class InsideWebViewClient
		// webview.setWebViewClient(new InsideWebViewClient());
		// to open pdf
		webview.setWebViewClient(new WebViewClient() {
			public boolean shouldOverrideUrlLoading(WebView view, String url) {
				if (url.endsWith(".pdf")) {
					startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(url)));
					// if want to download pdf manually create AsyncTask here
					// and download file
					return true;
				}
				return false;
			}
		});
		// -------------------------------------------------------------

	}
	// =====================Share Menu ======================
		@Override
		public boolean onCreateOptionsMenu(Menu menu) {
			// Inflate the menu; this adds items to the action bar if it is present.
			getMenuInflater().inflate(R.menu.webview_menu, menu);
			return true;
		}

		@Override
		public boolean onOptionsItemSelected(MenuItem item) {

			int itemId = item.getItemId();

			
			if (itemId == R.id.action_share) {
				sharePost();
			}
			
			 else if  (itemId == R.id.refresh) {
				webview.reload();
				Toast.makeText(getBaseContext(), "جاري التحديث...",Toast.LENGTH_SHORT).show();

				}
			
			
			else{
			    super.onBackPressed();

			}

			return super.onOptionsItemSelected(item);
		}

		private void sharePost() {
			Intent shareIntent = new Intent(Intent.ACTION_SEND);
			shareIntent.setType("text/plain");
			shareIntent.putExtra(Intent.EXTRA_TEXT, webview.getUrl()+System.getProperty("line.separator")+"تم مشاركة هذا الرابط عن طريق تطبيق خدماتي." );
			startActivity(Intent.createChooser(shareIntent, getString(R.string.share_chooser_title)));
			
		}
	// =======================================================================================================

	private class InsideWebViewClient extends WebViewClient {
		@Override
		// Force links to be opened inside WebView and not in Default Browser
		public boolean shouldOverrideUrlLoading(WebView view, String url) {
			view.loadUrl(url);
			return true;

		}

	}

	// to handle back btn
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		if (event.getAction() == KeyEvent.ACTION_DOWN) {
			switch (keyCode) {
			case KeyEvent.KEYCODE_BACK:
				if (webview.canGoBack() == true) {
					webview.goBack();
				} else {
					finish();
				}
				return true;
			}

		}
		return super.onKeyDown(keyCode, event);
	}


}
