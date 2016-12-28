package com.project.e_services;
 
import java.util.ArrayList;
import java.util.List;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
 
public class WebsitesListViewAdapter_charity extends BaseAdapter {
 
    // Declare Variables
    Context context;
    LayoutInflater inflater;
	zz_ImageLoader imageLoader;
	ProgressDialog mProgressDialog;


    private List<Websites> websiteslist = null;
    private ArrayList<Websites> arraylist;
 
    public WebsitesListViewAdapter_charity(Context context, List<Websites> websiteslist) {
        this.context = context;
        this.websiteslist = websiteslist;
        inflater = LayoutInflater.from(context);
        this.arraylist = new ArrayList<Websites>();
        this.arraylist.addAll(websiteslist);
		imageLoader = new zz_ImageLoader(context);

    }
 
    public class ViewHolder {
        TextView title;
		ImageView image;   
		
		Button addToFav;
		Button removeFavBtn;


    }
 
    @Override
    public int getCount() {
        return websiteslist.size();
    }
 
    @Override
    public Websites getItem(int position) {
        return websiteslist.get(position);
    }
 
    @Override
    public long getItemId(int position) {
        return position;
    }
 
    public View getView(final int position, View view, ViewGroup parent) {
        final ViewHolder holder;
        if (view == null) {
            holder = new ViewHolder();
            view = inflater.inflate(R.layout.listview_item, null);
            // Locate the TextViews in listview_item.xml
            holder.title = (TextView) view.findViewById(R.id.title);
         // Locate the ImageView in listview_item.xml
         	holder.image = (ImageView) view.findViewById(R.id.image);
            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();
        }
                   
        // Set the results into TextViews
        holder.title.setText(websiteslist.get(position).getTitle());
     // Set the results into ImageView
        imageLoader.DisplayImage(websiteslist.get(position).getImage(),holder.image);
        
        
        //---- add to fav ------
		holder.addToFav = (Button) view.findViewById(R.id.addToFavBtn);
		
		holder.addToFav.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {	
				
				///=======1
				 if (((Button) v).isClickable() && position == 0) {				
					 Toast.makeText(v.getContext(), "تم اضافة"+" "+websiteslist.get(0).getTitle()+" "+"الى المفضلة", Toast.LENGTH_SHORT).show();						 
					 SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
					 SharedPreferences.Editor editor = prefs.edit();
					 editor.putString("title0_charity", (websiteslist.get(position).getTitle())); //InputString: from the EditText
					 editor.putString("link0_charity", (websiteslist.get(position).getLink())); //InputString: from the EditText
					 editor.commit();	
				 } 	
				 ///=======1	 
				 if (((Button) v).isClickable() && position == 1) {				
					 Toast.makeText(v.getContext(), "تم اضافة"+" "+websiteslist.get(1).getTitle()+" "+"الى المفضلة", Toast.LENGTH_SHORT).show();						 
					 SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
					 SharedPreferences.Editor editor = prefs.edit();
					 editor.putString("title1_charity", (websiteslist.get(position).getTitle())); //InputString: from the EditText
					 editor.putString("link1_charity", (websiteslist.get(position).getLink())); //InputString: from the EditText	
					 editor.commit();			
				}
				 ///=======2 
				 if (((Button) v).isClickable() && position == 2) {				
					 Toast.makeText(v.getContext(), "تم اضافة"+" "+websiteslist.get(2).getTitle()+" "+"الى المفضلة", Toast.LENGTH_SHORT).show();						 
					 SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
					 SharedPreferences.Editor editor = prefs.edit();
					 editor.putString("title2_charity", (websiteslist.get(position).getTitle())); //InputString: from the EditText
					 editor.putString("link2_charity", (websiteslist.get(position).getLink())); //InputString: from the EditText	
					 editor.commit();	
				}
				 ///=======3 
				 if (((Button) v).isClickable() && position == 3) {				
					 Toast.makeText(v.getContext(), "تم اضافة"+" "+websiteslist.get(3).getTitle()+" "+"الى المفضلة", Toast.LENGTH_SHORT).show();						 
					 SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
					 SharedPreferences.Editor editor = prefs.edit();
					 editor.putString("title3_charity", (websiteslist.get(position).getTitle())); //InputString: from the EditText
					 editor.putString("link3_charity", (websiteslist.get(position).getLink())); //InputString: from the EditText	
					 editor.commit();		
				}
				 
				 ///=======4
				 if (((Button) v).isClickable() && position == 4) {				
					 Toast.makeText(v.getContext(), "تم اضافة"+" "+websiteslist.get(4).getTitle()+" "+"الى المفضلة", Toast.LENGTH_SHORT).show();						 
					 SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
					 SharedPreferences.Editor editor = prefs.edit();
					 editor.putString("title4_charity", (websiteslist.get(position).getTitle())); //InputString: from the EditText
					 editor.putString("link4_charity", (websiteslist.get(position).getLink())); //InputString: from the EditText	
					 editor.commit();		
				}
				 
				 ///=======5
				 if (((Button) v).isClickable() && position == 5) {				
					 Toast.makeText(v.getContext(), "تم اضافة"+" "+websiteslist.get(5).getTitle()+" "+"الى المفضلة", Toast.LENGTH_SHORT).show();						 
					 SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
					 SharedPreferences.Editor editor = prefs.edit();
					 editor.putString("title5_charity", (websiteslist.get(position).getTitle())); //InputString: from the EditText
					 editor.putString("link5_charity", (websiteslist.get(position).getLink())); //InputString: from the EditText	
					 editor.commit();		
				}
				 ///=======6
				 if (((Button) v).isClickable() && position == 6) {				
					 Toast.makeText(v.getContext(), "تم اضافة"+" "+websiteslist.get(6).getTitle()+" "+"الى المفضلة", Toast.LENGTH_SHORT).show();						 
					 SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
					 SharedPreferences.Editor editor = prefs.edit();
					 editor.putString("title6_charity", (websiteslist.get(position).getTitle())); //InputString: from the EditText
					 editor.putString("link6_charity", (websiteslist.get(position).getLink())); //InputString: from the EditText	
					 editor.commit();		
				}
				 ///=======7
				 if (((Button) v).isClickable() && position == 7) {				
					 Toast.makeText(v.getContext(), "تم اضافة"+" "+websiteslist.get(7).getTitle()+" "+"الى المفضلة", Toast.LENGTH_SHORT).show();						 
					 SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
					 SharedPreferences.Editor editor = prefs.edit();
					 editor.putString("title7_charity", (websiteslist.get(position).getTitle())); //InputString: from the EditText
					 editor.putString("link7_charity", (websiteslist.get(position).getLink())); //InputString: from the EditText	
					 editor.commit();		
				}
				 ///=======8
				 if (((Button) v).isClickable() && position == 8) {				
					 Toast.makeText(v.getContext(), "تم اضافة"+" "+websiteslist.get(8).getTitle()+" "+"الى المفضلة", Toast.LENGTH_SHORT).show();						 
					 SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
					 SharedPreferences.Editor editor = prefs.edit();
					 editor.putString("title8_charity", (websiteslist.get(position).getTitle())); //InputString: from the EditText
					 editor.putString("link8_charity", (websiteslist.get(position).getLink())); //InputString: from the EditText	
					 editor.commit();		
				}
				 
				 ///=======9
				 if (((Button) v).isClickable() && position == 9) {				
					 Toast.makeText(v.getContext(), "تم اضافة"+" "+websiteslist.get(9).getTitle()+" "+"الى المفضلة", Toast.LENGTH_SHORT).show();						 
					 SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
					 SharedPreferences.Editor editor = prefs.edit();
					 editor.putString("title9_charity", (websiteslist.get(position).getTitle())); //InputString: from the EditText
					 editor.putString("link9_charity", (websiteslist.get(position).getLink())); //InputString: from the EditText	
					 editor.commit();		
				}
				 
				 ///=======10
				 if (((Button) v).isClickable() && position == 10) {				
					 Toast.makeText(v.getContext(), "تم اضافة"+" "+websiteslist.get(10).getTitle()+" "+"الى المفضلة", Toast.LENGTH_SHORT).show();						 
					 SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
					 SharedPreferences.Editor editor = prefs.edit();
					 editor.putString("title9_charity", (websiteslist.get(position).getTitle())); //InputString: from the EditText
					 editor.putString("link9_charity", (websiteslist.get(position).getLink())); //InputString: from the EditText	
					 editor.commit();		
				}
				 
				 ///=======11
				 if (((Button) v).isClickable() && position == 11) {				
					 Toast.makeText(v.getContext(), "تم اضافة"+" "+websiteslist.get(11).getTitle()+" "+"الى المفضلة", Toast.LENGTH_SHORT).show();						 
					 SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
					 SharedPreferences.Editor editor = prefs.edit();
					 editor.putString("title11_charity", (websiteslist.get(position).getTitle())); //InputString: from the EditText
					 editor.putString("link11_charity", (websiteslist.get(position).getLink())); //InputString: from the EditText	
					 editor.commit();		
				}
				 
				 ///=======12
				 if (((Button) v).isClickable() && position == 12) {				
					 Toast.makeText(v.getContext(), "تم اضافة"+" "+websiteslist.get(12).getTitle()+" "+"الى المفضلة", Toast.LENGTH_SHORT).show();						 
					 SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
					 SharedPreferences.Editor editor = prefs.edit();
					 editor.putString("title12_charity", (websiteslist.get(position).getTitle())); //InputString: from the EditText
					 editor.putString("link12_charity", (websiteslist.get(position).getLink())); //InputString: from the EditText	
					 editor.commit();		
				}
				 
				 //========13
				 if (((Button) v).isClickable() && position == 13) {				
					 Toast.makeText(v.getContext(), "تم اضافة"+" "+websiteslist.get(13).getTitle()+" "+"الى المفضلة", Toast.LENGTH_SHORT).show();						 
					 SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
					 SharedPreferences.Editor editor = prefs.edit();
					 editor.putString("title13_charity", (websiteslist.get(position).getTitle())); //InputString: from the EditText
					 editor.putString("link13_charity", (websiteslist.get(position).getLink())); //InputString: from the EditText	
					 editor.commit();		
				}
				 
				 //========14
				 if (((Button) v).isClickable() && position == 14) {				
					 Toast.makeText(v.getContext(), "تم اضافة"+" "+websiteslist.get(14).getTitle()+" "+"الى المفضلة", Toast.LENGTH_SHORT).show();						 
					 SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
					 SharedPreferences.Editor editor = prefs.edit();
					 editor.putString("title14_charity", (websiteslist.get(position).getTitle())); //InputString: from the EditText
					 editor.putString("link14_charity", (websiteslist.get(position).getLink())); //InputString: from the EditText	
					 editor.commit();		
				}
				 
				 //========15
				 if (((Button) v).isClickable() && position == 15) {				
					 Toast.makeText(v.getContext(), "تم اضافة"+" "+websiteslist.get(15).getTitle()+" "+"الى المفضلة", Toast.LENGTH_SHORT).show();						 
					 SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
					 SharedPreferences.Editor editor = prefs.edit();
					 editor.putString("title15_charity", (websiteslist.get(position).getTitle())); //InputString: from the EditText
					 editor.putString("link15_charity", (websiteslist.get(position).getLink())); //InputString: from the EditText	
					 editor.commit();		
				}
				 
				 //========16
				 if (((Button) v).isClickable() && position == 16) {				
					 Toast.makeText(v.getContext(), "تم اضافة"+" "+websiteslist.get(16).getTitle()+" "+"الى المفضلة", Toast.LENGTH_SHORT).show();						 
					 SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
					 SharedPreferences.Editor editor = prefs.edit();
					 editor.putString("title16_charity", (websiteslist.get(position).getTitle())); //InputString: from the EditText
					 editor.putString("link16_charity", (websiteslist.get(position).getLink())); //InputString: from the EditText	
					 editor.commit();		
				}
				 
				 //========17
				 if (((Button) v).isClickable() && position == 17) {				
					 Toast.makeText(v.getContext(), "تم اضافة"+" "+websiteslist.get(17).getTitle()+" "+"الى المفضلة", Toast.LENGTH_SHORT).show();						 
					 SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
					 SharedPreferences.Editor editor = prefs.edit();
					 editor.putString("title17_charity", (websiteslist.get(position).getTitle())); //InputString: from the EditText
					 editor.putString("link17_charity", (websiteslist.get(position).getLink())); //InputString: from the EditText	
					 editor.commit();		
				}
				 
				 //========18
				 if (((Button) v).isClickable() && position == 18) {				
					 Toast.makeText(v.getContext(), "تم اضافة"+" "+websiteslist.get(18).getTitle()+" "+"الى المفضلة", Toast.LENGTH_SHORT).show();						 
					 SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
					 SharedPreferences.Editor editor = prefs.edit();
					 editor.putString("title18_charity", (websiteslist.get(position).getTitle())); //InputString: from the EditText
					 editor.putString("link18_charity", (websiteslist.get(position).getLink())); //InputString: from the EditText	
					 editor.commit();		
				}
				 
				 //========19
				 if (((Button) v).isClickable() && position == 19) {				
					 Toast.makeText(v.getContext(), "تم اضافة"+" "+websiteslist.get(19).getTitle()+" "+"الى المفضلة", Toast.LENGTH_SHORT).show();						 
					 SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
					 SharedPreferences.Editor editor = prefs.edit();
					 editor.putString("title19_charity", (websiteslist.get(position).getTitle())); //InputString: from the EditText
					 editor.putString("link19_charity", (websiteslist.get(position).getLink())); //InputString: from the EditText	
					 editor.commit();		
				}

		}
			
   });

       //---- remove from fav ------
		
		holder.removeFavBtn = (Button) view.findViewById(R.id.removeFavBtn);
		
		holder.removeFavBtn.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				
				 ///=======0 
			   if (((Button) v).isClickable() && position == 0) {
				   Toast.makeText(v.getContext(), "تم حذف"+" "+websiteslist.get(0).getTitle()+" "+"من المفضلة", Toast.LENGTH_SHORT).show();						 
				   SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
				   SharedPreferences.Editor editor = prefs.edit();
				   editor.remove("title0_charity");
				   editor.remove("link0_charity");
				   editor.commit();
			   }
				 ///=======1   
			   if (((Button) v).isClickable() && position == 1) {
				   Toast.makeText(v.getContext(), "تم حذف"+" "+websiteslist.get(1).getTitle()+" "+"من المفضلة", Toast.LENGTH_SHORT).show();						  
				   SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
				   SharedPreferences.Editor editor = prefs.edit();
				   editor.remove("title1_charity");
				   editor.remove("link1_charity");
				   editor.commit();
				}  
				 ///=======2 
			   if (((Button) v).isClickable() && position == 2) {
				   Toast.makeText(v.getContext(), "تم حذف"+" "+websiteslist.get(2).getTitle()+" "+"من المفضلة", Toast.LENGTH_SHORT).show();						 
				   SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
				   SharedPreferences.Editor editor = prefs.edit();
				   editor.remove("title2_charity");
				   editor.remove("link2_charity");
				   editor.commit();
				}  
				 ///=======3  
			   if (((Button) v).isClickable() && position == 3) {
				   Toast.makeText(v.getContext(), "تم حذف"+" "+websiteslist.get(3).getTitle()+" "+"من المفضلة", Toast.LENGTH_SHORT).show();						 
				   SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
				   SharedPreferences.Editor editor = prefs.edit();
				   editor.remove("title3_charity");
				   editor.remove("link3_charity");
				   editor.commit();
				}  
			   
			   ///=======4  
			   if (((Button) v).isClickable() && position == 4) {
				   Toast.makeText(v.getContext(), "تم حذف"+" "+websiteslist.get(4).getTitle()+" "+"من المفضلة", Toast.LENGTH_SHORT).show();						 
				   SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
				   SharedPreferences.Editor editor = prefs.edit();
				   editor.remove("title4_charity");
				   editor.remove("link4_charity");
				   editor.commit();
				}  
			   ///=======5  
			   if (((Button) v).isClickable() && position == 5) {
				   Toast.makeText(v.getContext(), "تم حذف"+" "+websiteslist.get(5).getTitle()+" "+"من المفضلة", Toast.LENGTH_SHORT).show();						 
				   SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
				   SharedPreferences.Editor editor = prefs.edit();
				   editor.remove("title5_charity");
				   editor.remove("link5_charity");
				   editor.commit();
				}  
			   ///=======6  
			   if (((Button) v).isClickable() && position == 6) {
				   Toast.makeText(v.getContext(), "تم حذف"+" "+websiteslist.get(6).getTitle()+" "+"من المفضلة", Toast.LENGTH_SHORT).show();						 
				   SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
				   SharedPreferences.Editor editor = prefs.edit();
				   editor.remove("title6_charity");
				   editor.remove("link6_charity");
				   editor.commit();
				}  
			   ///=======7  
			   if (((Button) v).isClickable() && position == 7) {
				   Toast.makeText(v.getContext(), "تم حذف"+" "+websiteslist.get(7).getTitle()+" "+"من المفضلة", Toast.LENGTH_SHORT).show();						 
				   SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
				   SharedPreferences.Editor editor = prefs.edit();
				   editor.remove("title7_charity");
				   editor.remove("link7_charity");
				   editor.commit();
				}  
			   ///=======8 
			   if (((Button) v).isClickable() && position == 8) {
				   Toast.makeText(v.getContext(), "تم حذف"+" "+websiteslist.get(8).getTitle()+" "+"من المفضلة", Toast.LENGTH_SHORT).show();						 
				   SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
				   SharedPreferences.Editor editor = prefs.edit();
				   editor.remove("title8_charity");
				   editor.remove("link8_charity");
				   editor.commit();
				}  
			   ///=======9  
			   if (((Button) v).isClickable() && position == 9) {
				   Toast.makeText(v.getContext(), "تم حذف"+" "+websiteslist.get(9).getTitle()+" "+"من المفضلة", Toast.LENGTH_SHORT).show();						 
				   SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
				   SharedPreferences.Editor editor = prefs.edit();
				   editor.remove("title9_charity");
				   editor.remove("link9_charity");
				   editor.commit();
				}  
			   
			 ///=======10 
			   if (((Button) v).isClickable() && position == 10) {
				   Toast.makeText(v.getContext(), "تم حذف"+" "+websiteslist.get(10).getTitle()+" "+"من المفضلة", Toast.LENGTH_SHORT).show();						 
				   SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
				   SharedPreferences.Editor editor = prefs.edit();
				   editor.remove("title10_charity");
				   editor.remove("link10_charity");
				   editor.commit();
				}  
			   
			 ///=======11
			   if (((Button) v).isClickable() && position == 11) {
				   Toast.makeText(v.getContext(), "تم حذف"+" "+websiteslist.get(11).getTitle()+" "+"من المفضلة", Toast.LENGTH_SHORT).show();						 
				   SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
				   SharedPreferences.Editor editor = prefs.edit();
				   editor.remove("title11_charity");
				   editor.remove("link11_charity");
				   editor.commit();
				}  
			   
			 ///=======12 
			   if (((Button) v).isClickable() && position == 12) {
				   Toast.makeText(v.getContext(), "تم حذف"+" "+websiteslist.get(12).getTitle()+" "+"من المفضلة", Toast.LENGTH_SHORT).show();						 
				   SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
				   SharedPreferences.Editor editor = prefs.edit();
				   editor.remove("title12_charity");
				   editor.remove("link12_charity");
				   editor.commit();
				}  
			   
			 ///=======13 
			   if (((Button) v).isClickable() && position == 13) {
				   Toast.makeText(v.getContext(), "تم حذف"+" "+websiteslist.get(13).getTitle()+" "+"من المفضلة", Toast.LENGTH_SHORT).show();						 
				   SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
				   SharedPreferences.Editor editor = prefs.edit();
				   editor.remove("title13_charity");
				   editor.remove("link13_charity");
				   editor.commit();
				}  
			   
			 ///=======14
			   if (((Button) v).isClickable() && position == 14) {
				   Toast.makeText(v.getContext(), "تم حذف"+" "+websiteslist.get(14).getTitle()+" "+"من المفضلة", Toast.LENGTH_SHORT).show();						 
				   SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
				   SharedPreferences.Editor editor = prefs.edit();
				   editor.remove("title14_charity");
				   editor.remove("link14_charity");
				   editor.commit();
				}  
			   
			 ///=======15
			   if (((Button) v).isClickable() && position == 15) {
				   Toast.makeText(v.getContext(), "تم حذف"+" "+websiteslist.get(15).getTitle()+" "+"من المفضلة", Toast.LENGTH_SHORT).show();						 
				   SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
				   SharedPreferences.Editor editor = prefs.edit();
				   editor.remove("title15_charity");
				   editor.remove("link15_charity");
				   editor.commit();
				}  
			   
			 ///=======16
			   if (((Button) v).isClickable() && position == 16) {
				   Toast.makeText(v.getContext(), "تم حذف"+" "+websiteslist.get(16).getTitle()+" "+"من المفضلة", Toast.LENGTH_SHORT).show();						 
				   SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
				   SharedPreferences.Editor editor = prefs.edit();
				   editor.remove("title16_charity");
				   editor.remove("link16_charity");
				   editor.commit();
				}  
			   
			 ///=======17
			   if (((Button) v).isClickable() && position == 17) {
				   Toast.makeText(v.getContext(), "تم حذف"+" "+websiteslist.get(17).getTitle()+" "+"من المفضلة", Toast.LENGTH_SHORT).show();						 
				   SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
				   SharedPreferences.Editor editor = prefs.edit();
				   editor.remove("title17_charity");
				   editor.remove("link17_charity");
				   editor.commit();
				}  
			   
			 ///=======18
			   if (((Button) v).isClickable() && position == 18) {
				   Toast.makeText(v.getContext(), "تم حذف"+" "+websiteslist.get(18).getTitle()+" "+"من المفضلة", Toast.LENGTH_SHORT).show();						 
				   SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
				   SharedPreferences.Editor editor = prefs.edit();
				   editor.remove("title18_charity");
				   editor.remove("link18_charity");
				   editor.commit();
				}  
			 ///=======19
			   if (((Button) v).isClickable() && position == 19) {
				   Toast.makeText(v.getContext(), "تم حذف"+" "+websiteslist.get(19).getTitle()+" "+"من المفضلة", Toast.LENGTH_SHORT).show();						 
				   SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
				   SharedPreferences.Editor editor = prefs.edit();
				   editor.remove("title19_charity");
				   editor.remove("link19_charity");
				   editor.commit();
				}  
			   
		    }		
	     });
		
        // Listen for ListView Item Click
        view.setOnClickListener(new OnClickListener() {
 
            @Override
            public void onClick(View arg0) {
            	
				Intent intent = new Intent(context, WebsiteView.class);

				intent.putExtra("Link", (websiteslist.get(position).getLink()));
				
				context.startActivity(intent);

                
            }
        });
 
        return view;
    }
    
	// Filter Class
//    public void filter(String charText) {
//        charText = charText.toLowerCase(Locale.getDefault());
//        websiteslist.clear();
//        if (charText.length() == 0) {
//        	websiteslist.addAll(arraylist);
//        } else {
//            for (Websites wp : arraylist) {
//                if (wp.getTitle().toLowerCase(Locale.getDefault())
//                        .contains(charText)) {
//                	websiteslist.add(wp);
//                }
//            }
//        }
//        notifyDataSetChanged();
//    }
}