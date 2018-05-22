package com.example.napstyle.a12_tablanumero;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import android.widget.TextView;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {

    private TextView et2;

SeekBar sk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sk = (SeekBar) findViewById(R.id.sk);
        sk.setMax(10);

        et2 = (TextView) findViewById(R.id.et2);
    }

    public void ImpTabla(View v){
        int numero1 = ((SeekBar)findViewById(R.id.sk)).getProgress();
        int numero2 = numero1;
        String result2 = "";
        for(int i = 1; i <= 30; i++){
            int result1 = i * numero2;
            result2 += i+ " x " + numero1 + " = " + String.valueOf(result1) + '\n';
        }
        et2.setText(result2);
    }



}
