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
 
public class WebsitesListViewAdapter_gov extends BaseAdapter {
 
    // Declare Variables
    Context context;
    LayoutInflater inflater;
	zz_ImageLoader imageLoader;
	ProgressDialog mProgressDialog;


    private List<Websites> websiteslist = null;
    private ArrayList<Websites> arraylist;
    
	
 
    public WebsitesListViewAdapter_gov(Context context, List<Websites> websiteslist) {
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
				
				///=======0
				 if (((Button) v).isClickable() && position == 0) {				
					 Toast.makeText(v.getContext(), "تم اضافة"+" "+websiteslist.get(0).getTitle()+" "+"الى المفضلة", Toast.LENGTH_SHORT).show();						 
					 SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
					 SharedPreferences.Editor editor = prefs.edit();
					 editor.putString("title0_gov", (websiteslist.get(position).getTitle())); //InputString: from the EditText
					 editor.putString("link0_gov", (websiteslist.get(position).getLink())); //InputString: from the EditText
					 editor.putString("num0_gov","0"); //InputString: from the EditText
					 editor.commit();	
				 } 	
				 ///=======1	 
				 if (((Button) v).isClickable() && position == 1) {				
					 Toast.makeText(v.getContext(), "تم اضافة"+" "+websiteslist.get(1).getTitle()+" "+"الى المفضلة", Toast.LENGTH_SHORT).show();						 
					 SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
					 SharedPreferences.Editor editor = prefs.edit();
					 editor.putString("title1_gov", (websiteslist.get(position).getTitle())); //InputString: from the EditText
					 editor.putString("link1_gov", (websiteslist.get(position).getLink())); //InputString: from the EditText
					 editor.putString("num1_gov","1"); //InputString: from the EditText

					 editor.commit();			
				}
				 ///=======2 
				 if (((Button) v).isClickable() && position == 2) {				
					 Toast.makeText(v.getContext(), "تم اضافة"+" "+websiteslist.get(2).getTitle()+" "+"الى المفضلة", Toast.LENGTH_SHORT).show();						 
					 SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
					 SharedPreferences.Editor editor = prefs.edit();
					 editor.putString("title2_gov", (websiteslist.get(position).getTitle())); //InputString: from the EditText
					 editor.putString("link2_gov", (websiteslist.get(position).getLink())); //InputString: from the EditText	
					 editor.commit();	
				}
				 ///=======3 
				 if (((Button) v).isClickable() && position == 3) {				
					 Toast.makeText(v.getContext(), "تم اضافة"+" "+websiteslist.get(3).getTitle()+" "+"الى المفضلة", Toast.LENGTH_SHORT).show();						 
					 SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
					 SharedPreferences.Editor editor = prefs.edit();
					 editor.putString("title3_gov", (websiteslist.get(position).getTitle())); //InputString: from the EditText
					 editor.putString("link3_gov", (websiteslist.get(position).getLink())); //InputString: from the EditText	
					 editor.commit();		
				}
				 
				 ///=======4
				 if (((Button) v).isClickable() && position == 4) {				
					 Toast.makeText(v.getContext(), "تم اضافة"+" "+websiteslist.get(4).getTitle()+" "+"الى المفضلة", Toast.LENGTH_SHORT).show();						 
					 SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
					 SharedPreferences.Editor editor = prefs.edit();
					 editor.putString("title4_gov", (websiteslist.get(position).getTitle())); //InputString: from the EditText
					 editor.putString("link4_gov", (websiteslist.get(position).getLink())); //InputString: from the EditText	
					 editor.commit();		
				}
				 
				 ///=======5
				 if (((Button) v).isClickable() && position == 5) {				
					 Toast.makeText(v.getContext(), "تم اضافة"+" "+websiteslist.get(5).getTitle()+" "+"الى المفضلة", Toast.LENGTH_SHORT).show();						 
					 SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
					 SharedPreferences.Editor editor = prefs.edit();
					 editor.putString("title5_gov", (websiteslist.get(position).getTitle())); //InputString: from the EditText
					 editor.putString("link5_gov", (websiteslist.get(position).getLink())); //InputString: from the EditText	
					 editor.commit();		
				}
				 ///=======6
				 if (((Button) v).isClickable() && position == 6) {				
					 Toast.makeText(v.getContext(), "تم اضافة"+" "+websiteslist.get(6).getTitle()+" "+"الى المفضلة", Toast.LENGTH_SHORT).show();						 
					 SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
					 SharedPreferences.Editor editor = prefs.edit();
					 editor.putString("title6_gov", (websiteslist.get(position).getTitle())); //InputString: from the EditText
					 editor.putString("link6_gov", (websiteslist.get(position).getLink())); //InputString: from the EditText	
					 editor.commit();		
				}
				 ///=======7
				 if (((Button) v).isClickable() && position == 7) {				
					 Toast.makeText(v.getContext(), "تم اضافة"+" "+websiteslist.get(7).getTitle()+" "+"الى المفضلة", Toast.LENGTH_SHORT).show();						 
					 SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
					 SharedPreferences.Editor editor = prefs.edit();
					 editor.putString("title7_gov", (websiteslist.get(position).getTitle())); //InputString: from the EditText
					 editor.putString("link7_gov", (websiteslist.get(position).getLink())); //InputString: from the EditText	
					 editor.commit();		
				}
				 ///=======8
				 if (((Button) v).isClickable() && position == 8) {				
					 Toast.makeText(v.getContext(), "تم اضافة"+" "+websiteslist.get(8).getTitle()+" "+"الى المفضلة", Toast.LENGTH_SHORT).show();						 
					 SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
					 SharedPreferences.Editor editor = prefs.edit();
					 editor.putString("title8_gov", (websiteslist.get(position).getTitle())); //InputString: from the EditText
					 editor.putString("link8_gov", (websiteslist.get(position).getLink())); //InputString: from the EditText	
					 editor.commit();		
				}
				 
				 ///=======9
				 if (((Button) v).isClickable() && position == 9) {				
					 Toast.makeText(v.getContext(), "تم اضافة"+" "+websiteslist.get(9).getTitle()+" "+"الى المفضلة", Toast.LENGTH_SHORT).show();						 
					 SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
					 SharedPreferences.Editor editor = prefs.edit();
					 editor.putString("title9_gov", (websiteslist.get(position).getTitle())); //InputString: from the EditText
					 editor.putString("link9_gov", (websiteslist.get(position).getLink())); //InputString: from the EditText	
					 editor.commit();		
				}
				 
				///=======10
				 if (((Button) v).isClickable() && position == 10) {				
					 Toast.makeText(v.getContext(), "تم اضافة"+" "+websiteslist.get(10).getTitle()+" "+"الى المفضلة", Toast.LENGTH_SHORT).show();						 
					 SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
					 SharedPreferences.Editor editor = prefs.edit();
					 editor.putString("title9_gov", (websiteslist.get(position).getTitle())); //InputString: from the EditText
					 editor.putString("link9_gov", (websiteslist.get(position).getLink())); //InputString: from the EditText	
					 editor.commit();		
				}
				 
				 ///=======11
				 if (((Button) v).isClickable() && position == 11) {				
					 Toast.makeText(v.getContext(), "تم اضافة"+" "+websiteslist.get(11).getTitle()+" "+"الى المفضلة", Toast.LENGTH_SHORT).show();						 
					 SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
					 SharedPreferences.Editor editor = prefs.edit();
					 editor.putString("title11_gov", (websiteslist.get(position).getTitle())); //InputString: from the EditText
					 editor.putString("link11_gov", (websiteslist.get(position).getLink())); //InputString: from the EditText	
					 editor.commit();		
				}
				 
				 ///=======12
				 if (((Button) v).isClickable() && position == 12) {				
					 Toast.makeText(v.getContext(), "تم اضافة"+" "+websiteslist.get(12).getTitle()+" "+"الى المفضلة", Toast.LENGTH_SHORT).show();						 
					 SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
					 SharedPreferences.Editor editor = prefs.edit();
					 editor.putString("title12_gov", (websiteslist.get(position).getTitle())); //InputString: from the EditText
					 editor.putString("link12_gov", (websiteslist.get(position).getLink())); //InputString: from the EditText	
					 editor.commit();		
				}
				 
				 //========13
				 if (((Button) v).isClickable() && position == 13) {				
					 Toast.makeText(v.getContext(), "تم اضافة"+" "+websiteslist.get(13).getTitle()+" "+"الى المفضلة", Toast.LENGTH_SHORT).show();						 
					 SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
					 SharedPreferences.Editor editor = prefs.edit();
					 editor.putString("title13_gov", (websiteslist.get(position).getTitle())); //InputString: from the EditText
					 editor.putString("link13_gov", (websiteslist.get(position).getLink())); //InputString: from the EditText	
					 editor.commit();		
				}
				 
				 //========14
				 if (((Button) v).isClickable() && position == 14) {				
					 Toast.makeText(v.getContext(), "تم اضافة"+" "+websiteslist.get(14).getTitle()+" "+"الى المفضلة", Toast.LENGTH_SHORT).show();						 
					 SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
					 SharedPreferences.Editor editor = prefs.edit();
					 editor.putString("title14_gov", (websiteslist.get(position).getTitle())); //InputString: from the EditText
					 editor.putString("link14_gov", (websiteslist.get(position).getLink())); //InputString: from the EditText	
					 editor.commit();		
				}
				 
				 //========15
				 if (((Button) v).isClickable() && position == 15) {				
					 Toast.makeText(v.getContext(), "تم اضافة"+" "+websiteslist.get(15).getTitle()+" "+"الى المفضلة", Toast.LENGTH_SHORT).show();						 
					 SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
					 SharedPreferences.Editor editor = prefs.edit();
					 editor.putString("title15_gov", (websiteslist.get(position).getTitle())); //InputString: from the EditText
					 editor.putString("link15_gov", (websiteslist.get(position).getLink())); //InputString: from the EditText	
					 editor.commit();		
				}
				 
				 //========16
				 if (((Button) v).isClickable() && position == 16) {				
					 Toast.makeText(v.getContext(), "تم اضافة"+" "+websiteslist.get(16).getTitle()+" "+"الى المفضلة", Toast.LENGTH_SHORT).show();						 
					 SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
					 SharedPreferences.Editor editor = prefs.edit();
					 editor.putString("title16_gov", (websiteslist.get(position).getTitle())); //InputString: from the EditText
					 editor.putString("link16_gov", (websiteslist.get(position).getLink())); //InputString: from the EditText	
					 editor.commit();		
				}
				 
				 //========17
				 if (((Button) v).isClickable() && position == 17) {				
					 Toast.makeText(v.getContext(), "تم اضافة"+" "+websiteslist.get(17).getTitle()+" "+"الى المفضلة", Toast.LENGTH_SHORT).show();						 
					 SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
					 SharedPreferences.Editor editor = prefs.edit();
					 editor.putString("title17_gov", (websiteslist.get(position).getTitle())); //InputString: from the EditText
					 editor.putString("link17_gov", (websiteslist.get(position).getLink())); //InputString: from the EditText	
					 editor.commit();		
				}
				 
				 //========18
				 if (((Button) v).isClickable() && position == 18) {				
					 Toast.makeText(v.getContext(), "تم اضافة"+" "+websiteslist.get(18).getTitle()+" "+"الى المفضلة", Toast.LENGTH_SHORT).show();						 
					 SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
					 SharedPreferences.Editor editor = prefs.edit();
					 editor.putString("title18_gov", (websiteslist.get(position).getTitle())); //InputString: from the EditText
					 editor.putString("link18_gov", (websiteslist.get(position).getLink())); //InputString: from the EditText	
					 editor.commit();		
				}
				 
				 //========19
				 if (((Button) v).isClickable() && position == 19) {				
					 Toast.makeText(v.getContext(), "تم اضافة"+" "+websiteslist.get(19).getTitle()+" "+"الى المفضلة", Toast.LENGTH_SHORT).show();						 
					 SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
					 SharedPreferences.Editor editor = prefs.edit();
					 editor.putString("title19_gov", (websiteslist.get(position).getTitle())); //InputString: from the EditText
					 editor.putString("link19_gov", (websiteslist.get(position).getLink())); //InputString: from the EditText	
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
				   editor.remove("title0_gov");
				   editor.remove("link0_gov");
				   editor.commit();
			   }
				 ///=======1   
			   if (((Button) v).isClickable() && position == 1) {
				   Toast.makeText(v.getContext(), "تم حذف"+" "+websiteslist.get(1).getTitle()+" "+"من المفضلة", Toast.LENGTH_SHORT).show();						  
				   SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
				   SharedPreferences.Editor editor = prefs.edit();
				   editor.remove("title1_gov");
				   editor.remove("link1_gov");
				   editor.commit();
				}  
				 ///=======2 
			   if (((Button) v).isClickable() && position == 2) {
				   Toast.makeText(v.getContext(), "تم حذف"+" "+websiteslist.get(2).getTitle()+" "+"من المفضلة", Toast.LENGTH_SHORT).show();						 
				   SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
				   SharedPreferences.Editor editor = prefs.edit();
				   editor.remove("title2_gov");
				   editor.remove("link2_gov");
				   editor.commit();
				}  
				 ///=======3  
			   if (((Button) v).isClickable() && position == 3) {
				   Toast.makeText(v.getContext(), "تم حذف"+" "+websiteslist.get(3).getTitle()+" "+"من المفضلة", Toast.LENGTH_SHORT).show();						 
				   SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
				   SharedPreferences.Editor editor = prefs.edit();
				   editor.remove("title3_gov");
				   editor.remove("link3_gov");
				   editor.commit();
				}  
			   
			   ///=======4  
			   if (((Button) v).isClickable() && position == 4) {
				   Toast.makeText(v.getContext(), "تم حذف"+" "+websiteslist.get(4).getTitle()+" "+"من المفضلة", Toast.LENGTH_SHORT).show();						 
				   SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
				   SharedPreferences.Editor editor = prefs.edit();
				   editor.remove("title4_gov");
				   editor.remove("link4_gov");
				   editor.commit();
				}  
			   ///=======5  
			   if (((Button) v).isClickable() && position == 5) {
				   Toast.makeText(v.getContext(), "تم حذف"+" "+websiteslist.get(5).getTitle()+" "+"من المفضلة", Toast.LENGTH_SHORT).show();						 
				   SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
				   SharedPreferences.Editor editor = prefs.edit();
				   editor.remove("title5_gov");
				   editor.remove("link5_gov");
				   editor.commit();
				}  
			   ///=======6  
			   if (((Button) v).isClickable() && position == 6) {
				   Toast.makeText(v.getContext(), "تم حذف"+" "+websiteslist.get(6).getTitle()+" "+"من المفضلة", Toast.LENGTH_SHORT).show();						 
				   SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
				   SharedPreferences.Editor editor = prefs.edit();
				   editor.remove("title6_gov");
				   editor.remove("link6_gov");
				   editor.commit();
				}  
			   ///=======7  
			   if (((Button) v).isClickable() && position == 7) {
				   Toast.makeText(v.getContext(), "تم حذف"+" "+websiteslist.get(7).getTitle()+" "+"من المفضلة", Toast.LENGTH_SHORT).show();						 
				   SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
				   SharedPreferences.Editor editor = prefs.edit();
				   editor.remove("title7_gov");
				   editor.remove("link7_gov");
				   editor.commit();
				}  
			   ///=======8 
			   if (((Button) v).isClickable() && position == 8) {
				   Toast.makeText(v.getContext(), "تم حذف"+" "+websiteslist.get(8).getTitle()+" "+"من المفضلة", Toast.LENGTH_SHORT).show();						 
				   SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
				   SharedPreferences.Editor editor = prefs.edit();
				   editor.remove("title8_gov");
				   editor.remove("link8_gov");
				   editor.commit();
				}  
			   ///=======9  
			   if (((Button) v).isClickable() && position == 9) {
				   Toast.makeText(v.getContext(), "تم حذف"+" "+websiteslist.get(9).getTitle()+" "+"من المفضلة", Toast.LENGTH_SHORT).show();						 
				   SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
				   SharedPreferences.Editor editor = prefs.edit();
				   editor.remove("title9_gov");
				   editor.remove("link9_gov");
				   editor.commit();
				}
			   
				 ///=======10 
			   if (((Button) v).isClickable() && position == 10) {
				   Toast.makeText(v.getContext(), "تم حذف"+" "+websiteslist.get(10).getTitle()+" "+"من المفضلة", Toast.LENGTH_SHORT).show();						 
				   SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
				   SharedPreferences.Editor editor = prefs.edit();
				   editor.remove("title10_gov");
				   editor.remove("link10_gov");
				   editor.commit();
				}  
			   
			 ///=======11
			   if (((Button) v).isClickable() && position == 11) {
				   Toast.makeText(v.getContext(), "تم حذف"+" "+websiteslist.get(11).getTitle()+" "+"من المفضلة", Toast.LENGTH_SHORT).show();						 
				   SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
				   SharedPreferences.Editor editor = prefs.edit();
				   editor.remove("title11_gov");
				   editor.remove("link11_gov");
				   editor.commit();
				}  
			   
			 ///=======12 
			   if (((Button) v).isClickable() && position == 12) {
				   Toast.makeText(v.getContext(), "تم حذف"+" "+websiteslist.get(12).getTitle()+" "+"من المفضلة", Toast.LENGTH_SHORT).show();						 
				   SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
				   SharedPreferences.Editor editor = prefs.edit();
				   editor.remove("title12_gov");
				   editor.remove("link12_gov");
				   editor.commit();
				}  
			   
			 ///=======13 
			   if (((Button) v).isClickable() && position == 13) {
				   Toast.makeText(v.getContext(), "تم حذف"+" "+websiteslist.get(13).getTitle()+" "+"من المفضلة", Toast.LENGTH_SHORT).show();						 
				   SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
				   SharedPreferences.Editor editor = prefs.edit();
				   editor.remove("title13_gov");
				   editor.remove("link13_gov");
				   editor.commit();
				}  
			   
			 ///=======14
			   if (((Button) v).isClickable() && position == 14) {
				   Toast.makeText(v.getContext(), "تم حذف"+" "+websiteslist.get(14).getTitle()+" "+"من المفضلة", Toast.LENGTH_SHORT).show();						 
				   SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
				   SharedPreferences.Editor editor = prefs.edit();
				   editor.remove("title14_gov");
				   editor.remove("link14_gov");
				   editor.commit();
				}  
			   
			 ///=======15
			   if (((Button) v).isClickable() && position == 15) {
				   Toast.makeText(v.getContext(), "تم حذف"+" "+websiteslist.get(15).getTitle()+" "+"من المفضلة", Toast.LENGTH_SHORT).show();						 
				   SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
				   SharedPreferences.Editor editor = prefs.edit();
				   editor.remove("title15_gov");
				   editor.remove("link15_gov");
				   editor.commit();
				}  
			   
			 ///=======16
			   if (((Button) v).isClickable() && position == 16) {
				   Toast.makeText(v.getContext(), "تم حذف"+" "+websiteslist.get(16).getTitle()+" "+"من المفضلة", Toast.LENGTH_SHORT).show();						 
				   SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
				   SharedPreferences.Editor editor = prefs.edit();
				   editor.remove("title16_gov");
				   editor.remove("link16_gov");
				   editor.commit();
				}  
			   
			 ///=======17
			   if (((Button) v).isClickable() && position == 17) {
				   Toast.makeText(v.getContext(), "تم حذف"+" "+websiteslist.get(17).getTitle()+" "+"من المفضلة", Toast.LENGTH_SHORT).show();						 
				   SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
				   SharedPreferences.Editor editor = prefs.edit();
				   editor.remove("title17_gov");
				   editor.remove("link17_gov");
				   editor.commit();
				}  
			   
			 ///=======18
			   if (((Button) v).isClickable() && position == 18) {
				   Toast.makeText(v.getContext(), "تم حذف"+" "+websiteslist.get(18).getTitle()+" "+"من المفضلة", Toast.LENGTH_SHORT).show();						 
				   SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
				   SharedPreferences.Editor editor = prefs.edit();
				   editor.remove("title18_gov");
				   editor.remove("link18_gov");
				   editor.commit();
				}  
			 ///=======19
			   if (((Button) v).isClickable() && position == 19) {
				   Toast.makeText(v.getContext(), "تم حذف"+" "+websiteslist.get(19).getTitle()+" "+"من المفضلة", Toast.LENGTH_SHORT).show();						 
				   SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
				   SharedPreferences.Editor editor = prefs.edit();
				   editor.remove("title19_gov");
				   editor.remove("link19_gov");
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