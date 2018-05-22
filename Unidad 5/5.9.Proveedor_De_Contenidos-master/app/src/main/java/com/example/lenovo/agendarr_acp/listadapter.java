package com.example.lenovo.agendarr_acp;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.Random;


public class listadapter extends BaseAdapter {
    Context context;
    String nom[];
    String  tel[];
    String ini[];
    LayoutInflater inflater;

    public listadapter(Context context,String nom[],String tel[]){
        this.context=context;
        this.nom=nom;
        this.tel=tel;


    }



    @Override
    public int getCount() {
        return nom.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        // Declare Variables
        TextView txtNombre;
        TextView txtTelefono;


        //http://developer.android.com/intl/es/reference/android/view/LayoutInflater.html
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View itemView = inflater.inflate(R.layout.list_item, viewGroup, false);

        // Locate the TextViews in listview_item.xml
        txtNombre = (TextView) itemView.findViewById(R.id.nom);
        txtTelefono = (TextView) itemView.findViewById(R.id.tel);


        // Capture position and set to the TextViews
        txtNombre.setText(nom[i]);
        txtTelefono.setText(tel[i]);


        return itemView;
    }


    }

