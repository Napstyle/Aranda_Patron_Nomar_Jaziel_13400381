package com.example.raulrcg.sensordetection;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by raulrcg on 13/11/17.
 */

public class ListAdapter extends BaseAdapter {

    Context context;
    String arr[];
    LayoutInflater inflater;

    public ListAdapter(Context context,String arr[]){
        this.context=context;
        this.arr=arr;
    }

    @Override
    public int getCount() {
        return arr.length;
    }

    @Override
    public Object getItem(int i) {
        return arr[i];
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        // Declare Variables
        TextView nom;
        TextView mar;
        TextView ver;
        TextView ran;
        TextView del;
        TextView pow;
        //http://developer.android.com/intl/es/reference/android/view/LayoutInflater.html
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View itemView = inflater.inflate(R.layout.list_adapter, viewGroup, false);

        // Locate the TextViews in listview_item.xml
        nom = (TextView) itemView.findViewById(R.id.nombre);
        mar = (TextView) itemView.findViewById(R.id.marca);
        ver = (TextView) itemView.findViewById(R.id.version);
        ran = (TextView) itemView.findViewById(R.id.rangomax);
        del = (TextView) itemView.findViewById(R.id.delay);
        pow = (TextView) itemView.findViewById(R.id.power);

        // Capture position and set to the TextViews
        String irt[]=arr[i].split("/");
        nom.append(irt[0]);
        mar.append(irt[1]);
        ver.append(irt[2]);
        ran.append(irt[3]);
        del.append(irt[4]);
        pow.append(irt[5]);

        return itemView;
    }
}
