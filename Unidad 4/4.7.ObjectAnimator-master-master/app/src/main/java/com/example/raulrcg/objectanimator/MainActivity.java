package com.example.raulrcg.objectanimator;

import android.animation.ObjectAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.CycleInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;
    private RelativeLayout canvas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView) findViewById(R.id.faceIcon);
        canvas = (RelativeLayout) findViewById(R.id.animationCanvas);
    }

    public void onButtonClick(View v) {

        int screenHeight = canvas.getHeight();
        int targetY = screenHeight - imageView.getHeight();

//        ObjectAnimator animator = ObjectAnimator.ofFloat(imageView, "y", 0, targetY).setDuration(1000);
        ObjectAnimator animator = ObjectAnimator.ofFloat(imageView, "y", targetY,2).setDuration(1000);
        animator.setInterpolator(new BounceInterpolator());
        animator.start();
    }

    public void onButtonClick1(View v) {

        int screenHeight = canvas.getHeight();
        int targetY = screenHeight - imageView.getHeight();

//        ObjectAnimator animator = ObjectAnimator.ofFloat(imageView, "y", 0, targetY).setDuration(1000);
        ObjectAnimator animator = ObjectAnimator.ofFloat(imageView, "y", targetY,2).setDuration(1000);
        //animator.setInterpolator(new BounceInterpolator());
        animator.setInterpolator(new AccelerateInterpolator());
        animator.start();
    }

    public void onButtonClick2(View v) {

        int screenHeight = canvas.getHeight();
        int targetY = screenHeight - imageView.getHeight();

//        ObjectAnimator animator = ObjectAnimator.ofFloat(imageView, "y", 0, targetY).setDuration(1000);
        ObjectAnimator animator = ObjectAnimator.ofFloat(imageView, "y", targetY,2).setDuration(3000);
        //animator.setInterpolator(new BounceInterpolator());
        animator.setInterpolator(new CycleInterpolator(3));
        animator.start();
    }
    public void onButtonClick3(View v) {

        int screenHeight = canvas.getHeight();
        int targetY = screenHeight - imageView.getHeight();

//        ObjectAnimator animator = ObjectAnimator.ofFloat(imageView, "y", 0, targetY).setDuration(1000);
        ObjectAnimator animator = ObjectAnimator.ofFloat(imageView, "y", targetY,1).setDuration(1000);
        //animator.setInterpolator(new BounceInterpolator());
        animator.setInterpolator(new AccelerateDecelerateInterpolator());
        animator.start();
    }
}
