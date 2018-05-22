package com.example.raulrcg.javaanimation;

import android.animation.Animator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    boolean state=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView) findViewById(R.id.img);

        findViewById(R.id.btnRun).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animator(1,1,0,180,0,400,1000);
            }
        });
        findViewById(R.id.btnRun2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animator(2,2,360,180,0,0,1000);
            }
        });
        findViewById(R.id.btnRun3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animator(1,1,0,-180,0,-400,1000);
            }
        });
    }

    public void animator(float sx,float sy,float rx,float ry,float tx,float ty,long d){
        imageView.animate()
                .scaleX(sx)
                .scaleY(sy)
                .rotationX(rx)
                .rotationY(ry)
                .translationX(tx)
                .translationY(ty)
                .setDuration(d)
                .setListener(new Animator.AnimatorListener() {
                    @Override
                    public void onAnimationStart(Animator animation) {
                        Log.i("Animation", "onAnimationStart");
                    }

                    @Override
                    public void onAnimationEnd(Animator animation) {
                        Log.i("Animation", "onAnimationEnd");
                    }

                    @Override
                    public void onAnimationCancel(Animator animation) {

                    }

                    @Override
                    public void onAnimationRepeat(Animator animation) {

                    }
                });
    }

}
