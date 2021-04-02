package com.nabilla.goapp;

import android.app.ListActivity;
import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class RSAulia extends ListActivity {
    protected void onCreate (Bundle icircle){
        super.onCreate(icircle);
        String[] ListAct = new String[] {"Call Center","SMS Center", "Driving Direction","Website","Info di google","Exit"};
        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,ListAct));
    }

    protected void onListItemClick (ListView l, View v, int position, long id){
        super.onListItemClick(l, v, position, id);
        Object o = this.getListAdapter().getItem(position);
        String pilihan = o.toString();
        tampilkanpilihan(pilihan);
    }

    private void tampilkanpilihan(String pilihan) {
        try {
            Intent a = null;
            if (pilihan.equals("Call Center")){
               String nomortel = "tel:(0761) 670001";
               a = new Intent(Intent.ACTION_DIAL, Uri.parse(nomortel));

            } else if (pilihan.equals("SMS Center"))
            {
                String sms="Nabilla Saumi Putri";
                a = new Intent(Intent.ACTION_VIEW);
                a.setData(Uri.parse("sms:08975108124"));
                a.putExtra("sms_body", sms);


            } else if (pilihan.equals("Driving Direction"))
            {
                String lokasirs = "google.navigation:q=0.5243869,101.4602455";
                a = new Intent(Intent.ACTION_VIEW, Uri.parse(lokasirs));
            } else if (pilihan.equals("Website"))
            {
                String website = "https://rsaulia.com/";
                a = new Intent(Intent.ACTION_VIEW, Uri.parse(website));
            } else if (pilihan.equals("Info di google"))
            {
                a = new Intent(Intent.ACTION_WEB_SEARCH);
                a.putExtra(SearchManager.QUERY, "Rumah Sakit Aulia");
            }
            startActivity(a);


        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}


