package com.project.e_services;

import java.util.ArrayList;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class FavList extends Activity {

	// Declare Variables
	ListView list;
//	FavListViewAdapter adapter;
	ArrayAdapter<String> adapter;

	ArrayList<String> myStringArrayList = new ArrayList<String>();
	ArrayList<String> linksArrayList = new ArrayList<String>();
	
	TextView tv;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// Get the view from listview_main.xml
		setContentView(R.layout.listview_main2);
		
		ActionBar actionBar = getActionBar();
		actionBar.setDisplayHomeAsUpEnabled(true);
		
		

	
		//Getting the Strings from the SharedPreferences
		SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());

		// Gov
		String	title0_gov = prefs.getString("title0_gov", ""); //no id: default value
		String	title1_gov = prefs.getString("title1_gov", ""); //no id: default value
		String	title2_gov = prefs.getString("title2_gov", ""); //no id: default value
		String	title3_gov = prefs.getString("title3_gov", ""); //no id: default value
		String	title4_gov = prefs.getString("title4_gov", ""); //no id: default value
		String	title5_gov = prefs.getString("title5_gov", ""); //no id: default value
		String	title6_gov = prefs.getString("title6_gov", ""); //no id: default value
		String	title7_gov = prefs.getString("title7_gov", ""); //no id: default value
		String	title8_gov = prefs.getString("title8_gov", ""); //no id: default value
		String  title9_gov = prefs.getString("title9_gov", ""); //no id: default value
		String	title10_gov = prefs.getString("title10_gov", ""); //no id: default value
		String  title11_gov = prefs.getString("title11_gov", ""); //no id: default value
		String	title12_gov = prefs.getString("title12_gov", ""); //no id: default value
		String  title13_gov = prefs.getString("title13_gov", ""); //no id: default value
		String  title14_gov = prefs.getString("title14_gov", ""); //no id: default value
		String  title15_gov = prefs.getString("title15_gov", ""); //no id: default value
		String  title16_gov = prefs.getString("title16_gov", ""); //no id: default value
		String  title17_gov = prefs.getString("title17_gov", ""); //no id: default value
		String  title18_gov = prefs.getString("title18_gov", ""); //no id: default value
		String  title19_gov = prefs.getString("title19_gov", ""); //no id: default value
	
		String link0_gov = prefs.getString("link0_gov", ""); //no id: default value
		String link1_gov = prefs.getString("link1_gov", ""); //no id: default value
		String link2_gov = prefs.getString("link2_gov", ""); //no id: default value
		String link3_gov = prefs.getString("link3_gov", ""); //no id: default value
		String link4_gov = prefs.getString("link4_gov", ""); //no id: default value
		String link5_gov = prefs.getString("link5_gov", ""); //no id: default value
		String link6_gov = prefs.getString("link6_gov", ""); //no id: default value
		String link7_gov = prefs.getString("link7_gov", ""); //no id: default value
		String link8_gov = prefs.getString("link8_gov", ""); //no id: default value
		String link9_gov = prefs.getString("link9_gov", ""); //no id: default value
		String link10_gov = prefs.getString("link10_gov", ""); //no id: default value
		String link11_gov = prefs.getString("link11_gov", ""); //no id: default value
		String link12_gov = prefs.getString("link12_gov", ""); //no id: default value
		String link13_gov = prefs.getString("link13_gov", ""); //no id: default value
		String link14_gov = prefs.getString("link14_gov", ""); //no id: default value
		String link15_gov = prefs.getString("link15_gov", ""); //no id: default value
		String link16_gov = prefs.getString("link16_gov", ""); //no id: default value
		String link17_gov = prefs.getString("link17_gov", ""); //no id: default value
		String link18_gov = prefs.getString("link18_gov", ""); //no id: default value
		String link19_gov = prefs.getString("link19_gov", ""); //no id: default value

//		// Univ
		String	title0_univ = prefs.getString("title0_univ", ""); //no id: default value
		String	title1_univ = prefs.getString("title1_univ", ""); //no id: default value
		String	title2_univ = prefs.getString("title2_univ", ""); //no id: default value
		String	title3_univ = prefs.getString("title3_univ", ""); //no id: default value
		String	title4_univ = prefs.getString("title4_univ", ""); //no id: default value
		String	title5_univ = prefs.getString("title5_univ", ""); //no id: default value
		String	title6_univ = prefs.getString("title6_univ", ""); //no id: default value
		String	title7_univ = prefs.getString("title7_univ", ""); //no id: default value
		String	title8_univ = prefs.getString("title8_univ", ""); //no id: default value
		String  title9_univ = prefs.getString("title9_univ", ""); //no id: default value
		String	title10_univ = prefs.getString("title10_univ", ""); //no id: default value
		String  title11_univ = prefs.getString("title11_univ", ""); //no id: default value
		String	title12_univ = prefs.getString("title12_univ", ""); //no id: default value
		String  title13_univ = prefs.getString("title13_univ", ""); //no id: default value
		String  title14_univ = prefs.getString("title14_univ", ""); //no id: default value
		String  title15_univ = prefs.getString("title15_univ", ""); //no id: default value
		String  title16_univ = prefs.getString("title16_univ", ""); //no id: default value
		String  title17_univ = prefs.getString("title17_univ", ""); //no id: default value
		String  title18_univ = prefs.getString("title18_univ", ""); //no id: default value
		String  title19_univ = prefs.getString("title19_univ", ""); //no id: default value
	
		String link0_univ = prefs.getString("link0_univ", ""); //no id: default value
		String link1_univ = prefs.getString("link1_univ", ""); //no id: default value
		String link2_univ = prefs.getString("link2_univ", ""); //no id: default value
		String link3_univ = prefs.getString("link3_univ", ""); //no id: default value
		String link4_univ = prefs.getString("link4_univ", ""); //no id: default value
		String link5_univ = prefs.getString("link5_univ", ""); //no id: default value
		String link6_univ = prefs.getString("link6_univ", ""); //no id: default value
		String link7_univ = prefs.getString("link7_univ", ""); //no id: default value
		String link8_univ = prefs.getString("link8_univ", ""); //no id: default value
		String link9_univ = prefs.getString("link9_univ", ""); //no id: default value
		String link10_univ = prefs.getString("link10_univ", ""); //no id: default value
		String link11_univ = prefs.getString("link11_univ", ""); //no id: default value
		String link12_univ = prefs.getString("link12_univ", ""); //no id: default value
		String link13_univ = prefs.getString("link13_univ", ""); //no id: default value
		String link14_univ = prefs.getString("link14_univ", ""); //no id: default value
		String link15_univ = prefs.getString("link15_univ", ""); //no id: default value
		String link16_univ = prefs.getString("link16_univ", ""); //no id: default value
		String link17_univ = prefs.getString("link17_univ", ""); //no id: default value
		String link18_univ = prefs.getString("link18_univ", ""); //no id: default value
		String link19_univ = prefs.getString("link19_univ", ""); //no id: default value
		
//		// Banks
		String	title0_bank = prefs.getString("title0_bank", ""); //no id: default value
		String	title1_bank = prefs.getString("title1_bank", ""); //no id: default value
		String	title2_bank = prefs.getString("title2_bank", ""); //no id: default value
		String	title3_bank = prefs.getString("title3_bank", ""); //no id: default value
		String	title4_bank = prefs.getString("title4_bank", ""); //no id: default value
		String	title5_bank = prefs.getString("title5_bank", ""); //no id: default value
		String	title6_bank = prefs.getString("title6_bank", ""); //no id: default value
		String	title7_bank = prefs.getString("title7_bank", ""); //no id: default value
		String	title8_bank = prefs.getString("title8_bank", ""); //no id: default value
		String  title9_bank = prefs.getString("title9_bank", ""); //no id: default value
		String	title10_bank = prefs.getString("title10_bank", ""); //no id: default value
		String  title11_bank = prefs.getString("title11_bank", ""); //no id: default value
		String	title12_bank = prefs.getString("title12_bank", ""); //no id: default value
		String  title13_bank = prefs.getString("title13_bank", ""); //no id: default value
		String  title14_bank = prefs.getString("title14_bank", ""); //no id: default value
		String  title15_bank = prefs.getString("title15_bank", ""); //no id: default value
		String  title16_bank = prefs.getString("title16_bank", ""); //no id: default value
		String  title17_bank = prefs.getString("title17_bank", ""); //no id: default value
		String  title18_bank = prefs.getString("title18_bank", ""); //no id: default value
		String  title19_bank = prefs.getString("title19_bank", ""); //no id: default value
	
		String link0_bank = prefs.getString("link0_bank", ""); //no id: default value
		String link1_bank = prefs.getString("link1_bank", ""); //no id: default value
		String link2_bank = prefs.getString("link2_bank", ""); //no id: default value
		String link3_bank = prefs.getString("link3_bank", ""); //no id: default value
		String link4_bank = prefs.getString("link4_bank", ""); //no id: default value
		String link5_bank = prefs.getString("link5_bank", ""); //no id: default value
		String link6_bank = prefs.getString("link6_bank", ""); //no id: default value
		String link7_bank = prefs.getString("link7_bank", ""); //no id: default value
		String link8_bank = prefs.getString("link8_bank", ""); //no id: default value
		String link9_bank = prefs.getString("link9_bank", ""); //no id: default value
		String link10_bank = prefs.getString("link10_bank", ""); //no id: default value
		String link11_bank = prefs.getString("link11_bank", ""); //no id: default value
		String link12_bank = prefs.getString("link12_bank", ""); //no id: default value
		String link13_bank = prefs.getString("link13_bank", ""); //no id: default value
		String link14_bank = prefs.getString("link14_bank", ""); //no id: default value
		String link15_bank = prefs.getString("link15_bank", ""); //no id: default value
		String link16_bank = prefs.getString("link16_bank", ""); //no id: default value
		String link17_bank = prefs.getString("link17_bank", ""); //no id: default value
		String link18_bank = prefs.getString("link18_bank", ""); //no id: default value
		String link19_bank = prefs.getString("link19_bank", ""); //no id: default value
		
//		//Fly
		String	title0_fly = prefs.getString("title0_fly", ""); //no id: default value
		String	title1_fly = prefs.getString("title1_fly", ""); //no id: default value
		String	title2_fly = prefs.getString("title2_fly", ""); //no id: default value
		String	title3_fly = prefs.getString("title3_fly", ""); //no id: default value
		String	title4_fly = prefs.getString("title4_fly", ""); //no id: default value
		String	title5_fly = prefs.getString("title5_fly", ""); //no id: default value
		String	title6_fly = prefs.getString("title6_fly", ""); //no id: default value
		String	title7_fly = prefs.getString("title7_fly", ""); //no id: default value
		String	title8_fly = prefs.getString("title8_fly", ""); //no id: default value
		String  title9_fly = prefs.getString("title9_fly", ""); //no id: default value
	
		String link0_fly = prefs.getString("link0_fly", ""); //no id: default value
		String link1_fly = prefs.getString("link1_fly", ""); //no id: default value
		String link2_fly = prefs.getString("link2_fly", ""); //no id: default value
		String link3_fly = prefs.getString("link3_fly", ""); //no id: default value
		String link4_fly = prefs.getString("link4_fly", ""); //no id: default value
		String link5_fly = prefs.getString("link5_fly", ""); //no id: default value
		String link6_fly = prefs.getString("link6_fly", ""); //no id: default value
		String link7_fly = prefs.getString("link7_fly", ""); //no id: default value
		String link8_fly = prefs.getString("link8_fly", ""); //no id: default value
		String link9_fly = prefs.getString("link9_fly", ""); //no id: default value
		
		//Charity	
		String	title0_charity = prefs.getString("title0_charity", ""); //no id: default value
		String	title1_charity = prefs.getString("title1_charity", ""); //no id: default value
		String	title2_charity = prefs.getString("title2_charity", ""); //no id: default value
		String	title3_charity = prefs.getString("title3_charity", ""); //no id: default value
		String	title4_charity = prefs.getString("title4_charity", ""); //no id: default value
		String	title5_charity = prefs.getString("title5_charity", ""); //no id: default value
		String	title6_charity = prefs.getString("title6_charity", ""); //no id: default value
		String	title7_charity = prefs.getString("title7_charity", ""); //no id: default value
		String	title8_charity = prefs.getString("title8_charity", ""); //no id: default value
		String  title9_charity = prefs.getString("title9_charity", ""); //no id: default value
		String	title10_charity = prefs.getString("title10_charity", ""); //no id: default value
		String  title11_charity = prefs.getString("title11_charity", ""); //no id: default value
		String	title12_charity = prefs.getString("title12_charity", ""); //no id: default value
		String  title13_charity = prefs.getString("title13_charity", ""); //no id: default value
		String  title14_charity = prefs.getString("title14_charity", ""); //no id: default value
		String  title15_charity = prefs.getString("title15_charity", ""); //no id: default value
		String  title16_charity = prefs.getString("title16_charity", ""); //no id: default value
		String  title17_charity = prefs.getString("title17_charity", ""); //no id: default value
		String  title18_charity = prefs.getString("title18_charity", ""); //no id: default value
		String  title19_charity = prefs.getString("title19_charity", ""); //no id: default value
	
		String link0_charity = prefs.getString("link0_charity", ""); //no id: default value
		String link1_charity = prefs.getString("link1_charity", ""); //no id: default value
		String link2_charity = prefs.getString("link2_charity", ""); //no id: default value
		String link3_charity = prefs.getString("link3_charity", ""); //no id: default value
		String link4_charity = prefs.getString("link4_charity", ""); //no id: default value
		String link5_charity = prefs.getString("link5_charity", ""); //no id: default value
		String link6_charity = prefs.getString("link6_charity", ""); //no id: default value
		String link7_charity = prefs.getString("link7_charity", ""); //no id: default value
		String link8_charity = prefs.getString("link8_charity", ""); //no id: default value
		String link9_charity = prefs.getString("link9_charity", ""); //no id: default value
		String link10_charity = prefs.getString("link10_charity", ""); //no id: default value
		String link11_charity = prefs.getString("link11_charity", ""); //no id: default value
		String link12_charity = prefs.getString("link12_charity", ""); //no id: default value
		String link13_charity = prefs.getString("link13_charity", ""); //no id: default value
		String link14_charity = prefs.getString("link14_charity", ""); //no id: default value
		String link15_charity = prefs.getString("link15_charity", ""); //no id: default value
		String link16_charity = prefs.getString("link16_charity", ""); //no id: default value
		String link17_charity = prefs.getString("link17_charity", ""); //no id: default value
		String link18_charity = prefs.getString("link18_charity", ""); //no id: default value
		String link19_charity = prefs.getString("link19_charity", ""); //no id: default value
		
		//News
		String	title0_news = prefs.getString("title0_news", ""); //no id: default value
		String	title1_news = prefs.getString("title1_news", ""); //no id: default value
		String	title2_news = prefs.getString("title2_news", ""); //no id: default value
		String	title3_news = prefs.getString("title3_news", ""); //no id: default value
		String	title4_news = prefs.getString("title4_news", ""); //no id: default value
		String	title5_news = prefs.getString("title5_news", ""); //no id: default value
		String	title6_news = prefs.getString("title6_news", ""); //no id: default value
		String	title7_news = prefs.getString("title7_news", ""); //no id: default value
		String	title8_news = prefs.getString("title8_news", ""); //no id: default value
		String  title9_news = prefs.getString("title9_news", ""); //no id: default value
		String	title10_news = prefs.getString("title10_news", ""); //no id: default value
		String  title11_news = prefs.getString("title11_news", ""); //no id: default value
		String	title12_news = prefs.getString("title12_news", ""); //no id: default value
		String  title13_news = prefs.getString("title13_news", ""); //no id: default value
		String  title14_news = prefs.getString("title14_news", ""); //no id: default value
		String  title15_news = prefs.getString("title15_news", ""); //no id: default value
		String  title16_news = prefs.getString("title16_news", ""); //no id: default value
		String  title17_news = prefs.getString("title17_news", ""); //no id: default value
		String  title18_news = prefs.getString("title18_news", ""); //no id: default value
		String  title19_news = prefs.getString("title19_news", ""); //no id: default value
	
		String link0_news = prefs.getString("link0_news", ""); //no id: default value
		String link1_news = prefs.getString("link1_news", ""); //no id: default value
		String link2_news = prefs.getString("link2_news", ""); //no id: default value
		String link3_news = prefs.getString("link3_news", ""); //no id: default value
		String link4_news = prefs.getString("link4_news", ""); //no id: default value
		String link5_news = prefs.getString("link5_news", ""); //no id: default value
		String link6_news = prefs.getString("link6_news", ""); //no id: default value
		String link7_news = prefs.getString("link7_news", ""); //no id: default value
		String link8_news = prefs.getString("link8_news", ""); //no id: default value
		String link9_news = prefs.getString("link9_news", ""); //no id: default value
		String link10_news = prefs.getString("link10_news", ""); //no id: default value
		String link11_news = prefs.getString("link11_news", ""); //no id: default value
		String link12_news = prefs.getString("link12_news", ""); //no id: default value
		String link13_news = prefs.getString("link13_news", ""); //no id: default value
		String link14_news = prefs.getString("link14_news", ""); //no id: default value
		String link15_news = prefs.getString("link15_news", ""); //no id: default value
		String link16_news = prefs.getString("link16_news", ""); //no id: default value
		String link17_news = prefs.getString("link17_news", ""); //no id: default value
		String link18_news = prefs.getString("link18_news", ""); //no id: default value
		String link19_news = prefs.getString("link19_news", ""); //no id: default value
		
//		//Adding the string to to the ArrayList
//		//Gov
		myStringArrayList.add(title0_gov);
		myStringArrayList.add(title1_gov);
		myStringArrayList.add(title2_gov);
		myStringArrayList.add(title3_gov);
		myStringArrayList.add(title4_gov);
		myStringArrayList.add(title5_gov);
		myStringArrayList.add(title6_gov);
		myStringArrayList.add(title7_gov);
		myStringArrayList.add(title8_gov);
		myStringArrayList.add(title9_gov);
		myStringArrayList.add(title10_gov);
		myStringArrayList.add(title11_gov);
		myStringArrayList.add(title12_gov);
		myStringArrayList.add(title13_gov);
		myStringArrayList.add(title14_gov);
		myStringArrayList.add(title15_gov);
		myStringArrayList.add(title16_gov);
		myStringArrayList.add(title17_gov);
		myStringArrayList.add(title18_gov);
		myStringArrayList.add(title19_gov);
		
		linksArrayList.add(link0_gov);
		linksArrayList.add(link1_gov);
		linksArrayList.add(link2_gov);
		linksArrayList.add(link3_gov);
		linksArrayList.add(link4_gov);
		linksArrayList.add(link5_gov);
		linksArrayList.add(link6_gov);
		linksArrayList.add(link7_gov);
		linksArrayList.add(link8_gov);
		linksArrayList.add(link9_gov);
		linksArrayList.add(link10_gov);
		linksArrayList.add(link11_gov);
		linksArrayList.add(link12_gov);
		linksArrayList.add(link13_gov);
		linksArrayList.add(link14_gov);
		linksArrayList.add(link15_gov);
		linksArrayList.add(link16_gov);
		linksArrayList.add(link17_gov);
		linksArrayList.add(link18_gov);
		linksArrayList.add(link19_gov);
//		
		//Univ
		myStringArrayList.add(title0_univ);
		myStringArrayList.add(title1_univ);
		myStringArrayList.add(title2_univ);
		myStringArrayList.add(title3_univ);
		myStringArrayList.add(title4_univ);
		myStringArrayList.add(title5_univ);
		myStringArrayList.add(title6_univ);
		myStringArrayList.add(title7_univ);
		myStringArrayList.add(title8_univ);
		myStringArrayList.add(title9_univ);
		myStringArrayList.add(title10_univ);
		myStringArrayList.add(title11_univ);
		myStringArrayList.add(title12_univ);
		myStringArrayList.add(title13_univ);
		myStringArrayList.add(title14_univ);
		myStringArrayList.add(title15_univ);
		myStringArrayList.add(title16_univ);
		myStringArrayList.add(title17_univ);
		myStringArrayList.add(title18_univ);
		myStringArrayList.add(title19_univ);
		
		linksArrayList.add(link0_univ);
		linksArrayList.add(link1_univ);
		linksArrayList.add(link2_univ);
		linksArrayList.add(link3_univ);
		linksArrayList.add(link4_univ);
		linksArrayList.add(link5_univ);
		linksArrayList.add(link6_univ);
		linksArrayList.add(link7_univ);
		linksArrayList.add(link8_univ);
		linksArrayList.add(link9_univ);
		linksArrayList.add(link10_univ);
		linksArrayList.add(link11_univ);
		linksArrayList.add(link12_univ);
		linksArrayList.add(link13_univ);
		linksArrayList.add(link14_univ);
		linksArrayList.add(link15_univ);
		linksArrayList.add(link16_univ);
		linksArrayList.add(link17_univ);
		linksArrayList.add(link18_univ);
		linksArrayList.add(link19_univ);
		
//		//Bank
		myStringArrayList.add(title0_bank);
		myStringArrayList.add(title1_bank);
		myStringArrayList.add(title2_bank);
		myStringArrayList.add(title3_bank);
		myStringArrayList.add(title4_bank);
		myStringArrayList.add(title5_bank);
		myStringArrayList.add(title6_bank);
		myStringArrayList.add(title7_bank);
		myStringArrayList.add(title8_bank);
		myStringArrayList.add(title9_bank);
		myStringArrayList.add(title10_bank);
		myStringArrayList.add(title11_bank);
		myStringArrayList.add(title12_bank);
		myStringArrayList.add(title13_bank);
		myStringArrayList.add(title14_bank);
		myStringArrayList.add(title15_bank);
		myStringArrayList.add(title16_bank);
		myStringArrayList.add(title17_bank);
		myStringArrayList.add(title18_bank);
		myStringArrayList.add(title19_bank);
		
		linksArrayList.add(link0_bank);
		linksArrayList.add(link1_bank);
		linksArrayList.add(link2_bank);
		linksArrayList.add(link3_bank);
		linksArrayList.add(link4_bank);
		linksArrayList.add(link5_bank);
		linksArrayList.add(link6_bank);
		linksArrayList.add(link7_bank);
		linksArrayList.add(link8_bank);
		linksArrayList.add(link9_bank);
		linksArrayList.add(link10_bank);
		linksArrayList.add(link11_bank);
		linksArrayList.add(link12_bank);
		linksArrayList.add(link13_bank);
		linksArrayList.add(link14_bank);
		linksArrayList.add(link15_bank);
		linksArrayList.add(link16_bank);
		linksArrayList.add(link17_bank);
		linksArrayList.add(link18_bank);
		linksArrayList.add(link19_bank);
//		
//		//Fly
		myStringArrayList.add(title0_fly);
		myStringArrayList.add(title1_fly);
		myStringArrayList.add(title2_fly);
		myStringArrayList.add(title3_fly);
		myStringArrayList.add(title4_fly);
		myStringArrayList.add(title5_fly);
		myStringArrayList.add(title6_fly);
		myStringArrayList.add(title7_fly);
		myStringArrayList.add(title8_fly);
		myStringArrayList.add(title9_fly);
	
		linksArrayList.add(link0_fly);
		linksArrayList.add(link1_fly);
		linksArrayList.add(link2_fly);
		linksArrayList.add(link3_fly);
		linksArrayList.add(link4_fly);
		linksArrayList.add(link5_fly);
		linksArrayList.add(link6_fly);
		linksArrayList.add(link7_fly);
		linksArrayList.add(link8_fly);
		linksArrayList.add(link9_fly);
		
//		//Charity
		myStringArrayList.add(title0_charity);
		myStringArrayList.add(title1_charity);
		myStringArrayList.add(title2_charity);
		myStringArrayList.add(title3_charity);
		myStringArrayList.add(title4_charity);
		myStringArrayList.add(title5_charity);
		myStringArrayList.add(title6_charity);
		myStringArrayList.add(title7_charity);
		myStringArrayList.add(title8_charity);
		myStringArrayList.add(title9_charity);
		myStringArrayList.add(title10_charity);
		myStringArrayList.add(title11_charity);
		myStringArrayList.add(title12_charity);
		myStringArrayList.add(title13_charity);
		myStringArrayList.add(title14_charity);
		myStringArrayList.add(title15_charity);
		myStringArrayList.add(title16_charity);
		myStringArrayList.add(title17_charity);
		myStringArrayList.add(title18_charity);
		myStringArrayList.add(title19_charity);
		
		linksArrayList.add(link0_charity);
		linksArrayList.add(link1_charity);
		linksArrayList.add(link2_charity);
		linksArrayList.add(link3_charity);
		linksArrayList.add(link4_charity);
		linksArrayList.add(link5_charity);
		linksArrayList.add(link6_charity);
		linksArrayList.add(link7_charity);
		linksArrayList.add(link8_charity);
		linksArrayList.add(link9_charity);
		linksArrayList.add(link10_charity);
		linksArrayList.add(link11_charity);
		linksArrayList.add(link12_charity);
		linksArrayList.add(link13_charity);
		linksArrayList.add(link14_charity);
		linksArrayList.add(link15_charity);
		linksArrayList.add(link16_charity);
		linksArrayList.add(link17_charity);
		linksArrayList.add(link18_charity);
		linksArrayList.add(link19_charity);
		
//		//News
		myStringArrayList.add(title0_news);
		myStringArrayList.add(title1_news);
		myStringArrayList.add(title2_news);
		myStringArrayList.add(title3_news);
		myStringArrayList.add(title4_news);
		myStringArrayList.add(title5_news);
		myStringArrayList.add(title6_news);
		myStringArrayList.add(title7_news);
		myStringArrayList.add(title8_news);
		myStringArrayList.add(title9_news);
		myStringArrayList.add(title10_news);
		myStringArrayList.add(title11_news);
		myStringArrayList.add(title12_news);
		myStringArrayList.add(title13_news);
		myStringArrayList.add(title14_news);
		myStringArrayList.add(title15_news);
		myStringArrayList.add(title16_news);
		myStringArrayList.add(title17_news);
		myStringArrayList.add(title18_news);
		myStringArrayList.add(title19_news);
		
		linksArrayList.add(link0_news);
		linksArrayList.add(link1_news);
		linksArrayList.add(link2_news);
		linksArrayList.add(link3_news);
		linksArrayList.add(link4_news);
		linksArrayList.add(link5_news);
		linksArrayList.add(link6_news);
		linksArrayList.add(link7_news);
		linksArrayList.add(link8_news);
		linksArrayList.add(link9_news);
		linksArrayList.add(link10_news);
		linksArrayList.add(link11_news);
		linksArrayList.add(link12_news);
		linksArrayList.add(link13_news);
		linksArrayList.add(link14_news);
		linksArrayList.add(link15_news);
		linksArrayList.add(link16_news);
		linksArrayList.add(link17_news);
		linksArrayList.add(link18_news);
		linksArrayList.add(link19_news);
		
		
		// deleted the title and links if they r empties
		
		//=====Gov
		if(title0_gov.length()==0 || link0_gov.length()==0 ){
			myStringArrayList.remove(title0_gov);
			linksArrayList.remove(link0_gov);}	
		
		if(title1_gov.length()==0 || link1_gov.length()==0){
			myStringArrayList.remove(title1_gov);
			linksArrayList.remove(link1_gov);}
		
		if(title2_gov.length()==0 || link2_gov.length()==0){
			myStringArrayList.remove(title2_gov);
			linksArrayList.remove(link2_gov);}
		
		if(title3_gov.length()==0 || link3_gov.length()==0){
			myStringArrayList.remove(title3_gov);
			linksArrayList.remove(link3_gov);}
		
		if(title4_gov.length()==0 || link4_gov.length()==0){
			myStringArrayList.remove(title4_gov);
			linksArrayList.remove(link4_gov);}
		
		if(title5_gov.length()==0 || link5_gov.length()==0){
			myStringArrayList.remove(title5_gov);
			linksArrayList.remove(link5_gov);}
		
		if(title6_gov.length()==0 || link6_gov.length()==0){
			myStringArrayList.remove(title6_gov);
			linksArrayList.remove(link6_gov);}
	
		if(title7_gov.length()==0 || link7_gov.length()==0){
			myStringArrayList.remove(title7_gov);
			linksArrayList.remove(link7_gov);}
		
		if(title8_gov.length()==0 || link8_gov.length()==0){
			myStringArrayList.remove(title8_gov);
			linksArrayList.remove(link8_gov);}
		
		if(title9_gov.length()==0 || link9_gov.length()==0){
			myStringArrayList.remove(title9_gov);
			linksArrayList.remove(link9_gov);}
		
		if(title10_gov.length()==0 || link10_gov.length()==0){
			myStringArrayList.remove(title10_gov);
			linksArrayList.remove(link10_gov);}
		
		if(title11_gov.length()==0 || link11_gov.length()==0){
			myStringArrayList.remove(title11_gov);
			linksArrayList.remove(link11_gov);}
		
		if(title12_gov.length()==0 || link12_gov.length()==0){
			myStringArrayList.remove(title12_gov);
			linksArrayList.remove(link12_gov);}
		
		if(title13_gov.length()==0 || link13_gov.length()==0){
			myStringArrayList.remove(title13_gov);
			linksArrayList.remove(link13_gov);}
		
		if(title14_gov.length()==0 || link14_gov.length()==0){
			myStringArrayList.remove(title14_gov);
			linksArrayList.remove(link14_gov);}
		
		if(title15_gov.length()==0 || link15_gov.length()==0){
			myStringArrayList.remove(title15_gov);
			linksArrayList.remove(link15_gov);}
		
		if(title16_gov.length()==0 || link16_gov.length()==0){
			myStringArrayList.remove(title16_gov);
			linksArrayList.remove(link16_gov);}
		
		if(title17_gov.length()==0 || link17_gov.length()==0){
			myStringArrayList.remove(title17_gov);
			linksArrayList.remove(link17_gov);}
		
		if(title18_gov.length()==0 || link18_gov.length()==0){
			myStringArrayList.remove(title18_gov);
			linksArrayList.remove(link18_gov);}
		
		if(title19_gov.length()==0 || link19_gov.length()==0){
			myStringArrayList.remove(title19_gov);
			linksArrayList.remove(link19_gov);}
		
		//=====Univ
		if(title0_univ.length()==0 || link0_univ.length()==0 ){
			myStringArrayList.remove(title0_univ);
			linksArrayList.remove(link0_univ);}	
		
		if(title1_univ.length()==0 || link1_univ.length()==0){
			myStringArrayList.remove(title1_univ);
			linksArrayList.remove(link1_univ);}
		
		if(title2_univ.length()==0 || link2_univ.length()==0){
			myStringArrayList.remove(title2_univ);
			linksArrayList.remove(link2_univ);}
		
		if(title3_univ.length()==0 || link3_univ.length()==0){
			myStringArrayList.remove(title3_univ);
			linksArrayList.remove(link3_univ);}
		
		if(title4_univ.length()==0 || link4_univ.length()==0){
			myStringArrayList.remove(title4_univ);
			linksArrayList.remove(link4_univ);}
		
		if(title5_univ.length()==0 || link5_univ.length()==0){
			myStringArrayList.remove(title5_univ);
			linksArrayList.remove(link5_univ);}
		
		if(title6_univ.length()==0 || link6_univ.length()==0){
			myStringArrayList.remove(title6_univ);
			linksArrayList.remove(link6_univ);}
	
		if(title7_univ.length()==0 || link7_univ.length()==0){
			myStringArrayList.remove(title7_univ);
			linksArrayList.remove(link7_univ);}
		
		if(title8_univ.length()==0 || link8_univ.length()==0){
			myStringArrayList.remove(title8_univ);
			linksArrayList.remove(link8_univ);}
		
		if(title9_univ.length()==0 || link9_univ.length()==0){
			myStringArrayList.remove(title9_univ);
			linksArrayList.remove(link9_univ);}
		
		if(title10_univ.length()==0 || link10_univ.length()==0){
			myStringArrayList.remove(title10_univ);
			linksArrayList.remove(link10_univ);}
		
		if(title11_univ.length()==0 || link11_univ.length()==0){
			myStringArrayList.remove(title11_univ);
			linksArrayList.remove(link11_univ);}
		
		if(title12_univ.length()==0 || link12_univ.length()==0){
			myStringArrayList.remove(title12_univ);
			linksArrayList.remove(link12_univ);}
		
		if(title13_univ.length()==0 || link13_univ.length()==0){
			myStringArrayList.remove(title13_univ);
			linksArrayList.remove(link13_univ);}
		
		if(title14_univ.length()==0 || link14_univ.length()==0){
			myStringArrayList.remove(title14_univ);
			linksArrayList.remove(link14_univ);}
		
		if(title15_univ.length()==0 || link15_univ.length()==0){
			myStringArrayList.remove(title15_univ);
			linksArrayList.remove(link15_univ);}
		
		if(title16_univ.length()==0 || link16_univ.length()==0){
			myStringArrayList.remove(title16_univ);
			linksArrayList.remove(link16_univ);}
		
		if(title17_univ.length()==0 || link17_univ.length()==0){
			myStringArrayList.remove(title17_univ);
			linksArrayList.remove(link17_univ);}
		
		if(title18_univ.length()==0 || link18_univ.length()==0){
			myStringArrayList.remove(title18_univ);
			linksArrayList.remove(link18_univ);}
		
		if(title19_univ.length()==0 || link19_univ.length()==0){
			myStringArrayList.remove(title19_univ);
			linksArrayList.remove(link19_univ);}
		
		//=====Bank
		if(title0_bank.length()==0 || link0_bank.length()==0 ){
			myStringArrayList.remove(title0_bank);
			linksArrayList.remove(link0_bank);}	
		
		if(title1_bank.length()==0 || link1_bank.length()==0){
			myStringArrayList.remove(title1_bank);
			linksArrayList.remove(link1_bank);}
		
		if(title2_bank.length()==0 || link2_bank.length()==0){
			myStringArrayList.remove(title2_bank);
			linksArrayList.remove(link2_bank);}
		
		if(title3_bank.length()==0 || link3_bank.length()==0){
			myStringArrayList.remove(title3_bank);
			linksArrayList.remove(link3_bank);}
		
		if(title4_bank.length()==0 || link4_bank.length()==0){
			myStringArrayList.remove(title4_bank);
			linksArrayList.remove(link4_bank);}
		
		if(title5_bank.length()==0 || link5_bank.length()==0){
			myStringArrayList.remove(title5_bank);
			linksArrayList.remove(link5_bank);}
		
		if(title6_bank.length()==0 || link6_bank.length()==0){
			myStringArrayList.remove(title6_bank);
			linksArrayList.remove(link6_bank);}
	
		if(title7_bank.length()==0 || link7_bank.length()==0){
			myStringArrayList.remove(title7_bank);
			linksArrayList.remove(link7_bank);}
		
		if(title8_bank.length()==0 || link8_bank.length()==0){
			myStringArrayList.remove(title8_bank);
			linksArrayList.remove(link8_bank);}
		
		if(title9_bank.length()==0 || link9_bank.length()==0){
			myStringArrayList.remove(title9_bank);
			linksArrayList.remove(link9_bank);}
		
		if(title10_bank.length()==0 || link10_bank.length()==0){
			myStringArrayList.remove(title10_bank);
			linksArrayList.remove(link10_bank);}
		
		if(title11_bank.length()==0 || link11_bank.length()==0){
			myStringArrayList.remove(title11_bank);
			linksArrayList.remove(link11_bank);}
		
		if(title12_bank.length()==0 || link12_bank.length()==0){
			myStringArrayList.remove(title12_bank);
			linksArrayList.remove(link12_bank);}
		
		if(title13_bank.length()==0 || link13_bank.length()==0){
			myStringArrayList.remove(title13_bank);
			linksArrayList.remove(link13_bank);}
		
		if(title14_bank.length()==0 || link14_bank.length()==0){
			myStringArrayList.remove(title14_bank);
			linksArrayList.remove(link14_bank);}
		
		if(title15_bank.length()==0 || link15_bank.length()==0){
			myStringArrayList.remove(title15_bank);
			linksArrayList.remove(link15_bank);}
		
		if(title16_bank.length()==0 || link16_bank.length()==0){
			myStringArrayList.remove(title16_bank);
			linksArrayList.remove(link16_bank);}
		
		if(title17_bank.length()==0 || link17_bank.length()==0){
			myStringArrayList.remove(title17_bank);
			linksArrayList.remove(link17_bank);}
		
		if(title18_bank.length()==0 || link18_bank.length()==0){
			myStringArrayList.remove(title18_bank);
			linksArrayList.remove(link18_bank);}
		
		if(title19_bank.length()==0 || link19_bank.length()==0){
			myStringArrayList.remove(title19_bank);
			linksArrayList.remove(link19_bank);}
		//=====Fly
		
		if(title0_fly.length()==0 || link0_fly.length()==0 ){
			myStringArrayList.remove(title0_fly);
			linksArrayList.remove(link0_fly);}	
		
		if(title1_fly.length()==0 || link1_fly.length()==0){
			myStringArrayList.remove(title1_fly);
			linksArrayList.remove(link1_fly);}
		
		if(title2_fly.length()==0 || link2_fly.length()==0){
			myStringArrayList.remove(title2_fly);
			linksArrayList.remove(link2_fly);}
		
		if(title3_fly.length()==0 || link3_fly.length()==0){
			myStringArrayList.remove(title3_fly);
			linksArrayList.remove(link3_fly);}
		
		if(title4_fly.length()==0 || link4_fly.length()==0){
			myStringArrayList.remove(title4_fly);
			linksArrayList.remove(link4_fly);}
		
		if(title5_fly.length()==0 || link5_fly.length()==0){
			myStringArrayList.remove(title5_fly);
			linksArrayList.remove(link5_fly);}
		
		if(title6_fly.length()==0 || link6_fly.length()==0){
			myStringArrayList.remove(title6_fly);
			linksArrayList.remove(link6_fly);}
	
		if(title7_fly.length()==0 || link7_fly.length()==0){
			myStringArrayList.remove(title7_fly);
			linksArrayList.remove(link7_fly);}
		
		if(title8_fly.length()==0 || link8_fly.length()==0){
			myStringArrayList.remove(title8_fly);
			linksArrayList.remove(link8_fly);}
		
		if(title9_fly.length()==0 || link9_fly.length()==0){
			myStringArrayList.remove(title9_fly);
			linksArrayList.remove(link9_fly);}
		//=====Charity
		if(title0_charity.length()==0 || link0_charity.length()==0 ){
			myStringArrayList.remove(title0_charity);
			linksArrayList.remove(link0_charity);}	
		
		if(title1_charity.length()==0 || link1_charity.length()==0){
			myStringArrayList.remove(title1_charity);
			linksArrayList.remove(link1_charity);}
		
		if(title2_charity.length()==0 || link2_charity.length()==0){
			myStringArrayList.remove(title2_charity);
			linksArrayList.remove(link2_charity);}
		
		if(title3_charity.length()==0 || link3_charity.length()==0){
			myStringArrayList.remove(title3_charity);
			linksArrayList.remove(link3_charity);}
		
		if(title4_charity.length()==0 || link4_charity.length()==0){
			myStringArrayList.remove(title4_charity);
			linksArrayList.remove(link4_charity);}
		
		if(title5_charity.length()==0 || link5_charity.length()==0){
			myStringArrayList.remove(title5_charity);
			linksArrayList.remove(link5_charity);}
		
		if(title6_charity.length()==0 || link6_charity.length()==0){
			myStringArrayList.remove(title6_charity);
			linksArrayList.remove(link6_charity);}
	
		if(title7_charity.length()==0 || link7_charity.length()==0){
			myStringArrayList.remove(title7_charity);
			linksArrayList.remove(link7_charity);}
		
		if(title8_charity.length()==0 || link8_charity.length()==0){
			myStringArrayList.remove(title8_charity);
			linksArrayList.remove(link8_charity);}
		
		if(title9_charity.length()==0 || link9_charity.length()==0){
			myStringArrayList.remove(title9_charity);
			linksArrayList.remove(link9_charity);}
		
		if(title10_charity.length()==0 || link10_charity.length()==0){
			myStringArrayList.remove(title10_charity);
			linksArrayList.remove(link10_charity);}
		
		if(title11_charity.length()==0 || link11_charity.length()==0){
			myStringArrayList.remove(title11_charity);
			linksArrayList.remove(link11_charity);}
		
		if(title12_charity.length()==0 || link12_charity.length()==0){
			myStringArrayList.remove(title12_charity);
			linksArrayList.remove(link12_charity);}
		
		if(title13_charity.length()==0 || link13_charity.length()==0){
			myStringArrayList.remove(title13_charity);
			linksArrayList.remove(link13_charity);}
		
		if(title14_charity.length()==0 || link14_charity.length()==0){
			myStringArrayList.remove(title14_charity);
			linksArrayList.remove(link14_charity);}
		
		if(title15_charity.length()==0 || link15_charity.length()==0){
			myStringArrayList.remove(title15_charity);
			linksArrayList.remove(link15_charity);}
		
		if(title16_charity.length()==0 || link16_charity.length()==0){
			myStringArrayList.remove(title16_charity);
			linksArrayList.remove(link16_charity);}
		
		if(title17_charity.length()==0 || link17_charity.length()==0){
			myStringArrayList.remove(title17_charity);
			linksArrayList.remove(link17_charity);}
		
		if(title18_charity.length()==0 || link18_charity.length()==0){
			myStringArrayList.remove(title18_charity);
			linksArrayList.remove(link18_charity);}
		
		if(title19_charity.length()==0 || link19_charity.length()==0){
			myStringArrayList.remove(title19_charity);
			linksArrayList.remove(link19_charity);}

		//=====News
		if(title0_news.length()==0 || link0_news.length()==0 ){
			myStringArrayList.remove(title0_news);
			linksArrayList.remove(link0_news);}	
		
		if(title1_news.length()==0 || link1_news.length()==0){
			myStringArrayList.remove(title1_news);
			linksArrayList.remove(link1_news);}
		
		if(title2_news.length()==0 || link2_news.length()==0){
			myStringArrayList.remove(title2_news);
			linksArrayList.remove(link2_news);}
		
		if(title3_news.length()==0 || link3_news.length()==0){
			myStringArrayList.remove(title3_news);
			linksArrayList.remove(link3_news);}
		
		if(title4_news.length()==0 || link4_news.length()==0){
			myStringArrayList.remove(title4_news);
			linksArrayList.remove(link4_news);}
		
		if(title5_news.length()==0 || link5_news.length()==0){
			myStringArrayList.remove(title5_news);
			linksArrayList.remove(link5_news);}
		
		if(title6_news.length()==0 || link6_news.length()==0){
			myStringArrayList.remove(title6_news);
			linksArrayList.remove(link6_news);}
	
		if(title7_news.length()==0 || link7_news.length()==0){
			myStringArrayList.remove(title7_news);
			linksArrayList.remove(link7_news);}
		
		if(title8_news.length()==0 || link8_news.length()==0){
			myStringArrayList.remove(title8_news);
			linksArrayList.remove(link8_news);}
		
		if(title9_news.length()==0 || link9_news.length()==0){
			myStringArrayList.remove(title9_news);
			linksArrayList.remove(link9_news);}
		
		if(title10_news.length()==0 || link10_news.length()==0){
			myStringArrayList.remove(title10_news);
			linksArrayList.remove(link10_news);}
		
		if(title11_news.length()==0 || link11_news.length()==0){
			myStringArrayList.remove(title11_news);
			linksArrayList.remove(link11_news);}
		
		if(title12_news.length()==0 || link12_news.length()==0){
			myStringArrayList.remove(title12_news);
			linksArrayList.remove(link12_news);}
		
		if(title13_news.length()==0 || link13_news.length()==0){
			myStringArrayList.remove(title13_news);
			linksArrayList.remove(link13_news);}
		
		if(title14_news.length()==0 || link14_news.length()==0){
			myStringArrayList.remove(title14_news);
			linksArrayList.remove(link14_news);}
		
		if(title15_news.length()==0 || link15_news.length()==0){
			myStringArrayList.remove(title15_news);
			linksArrayList.remove(link15_news);}
		
		if(title16_news.length()==0 || link16_news.length()==0){
			myStringArrayList.remove(title16_news);
			linksArrayList.remove(link16_news);}
		
		if(title17_news.length()==0 || link17_news.length()==0){
			myStringArrayList.remove(title17_news);
			linksArrayList.remove(link17_news);}
		
		if(title18_news.length()==0 || link18_news.length()==0){
			myStringArrayList.remove(title18_news);
			linksArrayList.remove(link18_news);}
		
		if(title19_news.length()==0 || link19_news.length()==0){
			myStringArrayList.remove(title19_news);
			linksArrayList.remove(link19_news);}
	//===================================================	
		
		
		// Locate the ListView in listview_main.xml
		list = (ListView) findViewById(R.id.listview);
	
		
		 ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.listview_item2,  R.id.text, myStringArrayList  );
		 list.setAdapter(arrayAdapter); 
		 
		tv = (TextView) findViewById(R.id.tv1);
		if(myStringArrayList.isEmpty()){
			 
			 tv.setText("لم يتم اضافة اي عنصر لقائمة المفضلة");
		 }
		else{
			 tv.setText("");
		}
		 
		 
		// Capture ListView item click
		list.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
				Intent i = new Intent(FavList.this, WebsiteView.class);
				// Pass link to WebsiteView Activity
				 String link=linksArrayList.get(position);
				 String tit =myStringArrayList.get(position); 
				 //Toast.makeText(getApplicationContext(),tit+"  "+ link, Toast.LENGTH_SHORT).show();		
				 i.putExtra("Link", link);
				startActivity(i);
			}

		});
		
		
	}
	
	// ===================== Menu ======================
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.fav_and_locations_menu, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
	    super.onBackPressed();
		
		return super.onOptionsItemSelected(item);
	}

}
