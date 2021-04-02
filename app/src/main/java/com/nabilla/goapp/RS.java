package com.nabilla.goapp;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class RS extends ListActivity {
    protected void onCreate (Bundle icircle){
        super.onCreate(icircle);
        String[] ListRS = new String[] {"Rumah Sakit Aulia", "Rumah Sakit Santa Maria", "Rumah Sakit Eka Hospital"};
        this.setListAdapter(new ArrayAdapter<String> (this, android.R.layout.simple_list_item_1,ListRS));
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
            if (pilihan.equals("Rumah Sakit Aulia")) {
                a = new Intent(this, RSAulia.class);

            } else if (pilihan.equals("Rumah Sakit Santa Maria")) {

            }

            startActivity(a);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
