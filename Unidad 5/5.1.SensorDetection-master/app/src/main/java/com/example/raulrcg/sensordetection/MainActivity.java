package com.example.raulrcg.sensordetection;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private SensorManager sensorManager;
    //TextView textView=null;

    ListView lv;
    ListAdapter adp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //textView=(TextView)findViewById(R.id.txt);
        lv=(ListView)findViewById(R.id.lista);

        sensorManager = (SensorManager)this.getSystemService(SENSOR_SERVICE);
        List<Sensor> lista=sensorManager.getSensorList(Sensor.TYPE_ALL);

        StringBuilder data = new StringBuilder();
        for (int i=1;i<lista.size();i++){
            data.append(lista.get(i).getName()+"/");
            data.append(lista.get(i).getVendor()+"/");
            data.append(lista.get(i).getVersion()+"/");
            data.append(lista.get(i).getMaximumRange()+"/");
            data.append(lista.get(i).getMinDelay()+"/");
            data.append(lista.get(i).getPower()+"/\n");
        }

        String arr[]=data.toString().split("\n");
        //textView.setText(data);

        adp = new ListAdapter(getApplicationContext(),arr);
        lv.setAdapter(adp);

    }
}
