package com.amati.animationcontriol;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
 Button btnFIn, btnFOut, btnCross, btnBlink, btnZin, btnZOut, btnRotate, btnBounce, btnSlide,btnMove;
   TextView Aman;

 @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Aman = findViewById(R.id.aman);

        btnFIn = findViewById(R.id.btnFIn);
        btnFOut = findViewById(R.id.btnFOut);
        btnCross = findViewById(R.id.btnCF);
        btnBlink = findViewById(R.id.btnBlink);
        btnZin = findViewById(R.id.btnZIn);
        btnZOut = findViewById(R.id.btnZOut);
        btnRotate = findViewById(R.id.btnRotate);
        btnBounce = findViewById(R.id.btnBounce);
        btnSlide = findViewById(R.id.btnSlide);
        btnMove = findViewById(R.id.btnMove);

        btnFIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in);
                Aman.startAnimation(animation);

            }
        });

        btnFOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_out);
                Aman.startAnimation(animation);

            }
        });

        btnCross.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.cross_fade);
                Aman.startAnimation(animation);

            }
        });

        btnZin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom_in);
                Aman.startAnimation(animation);

            }
        });

        btnZOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom_out);
                Aman.startAnimation(animation);

            }
        });

        btnRotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate);
                Aman.startAnimation(animation);

            }
        });

        btnMove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.move);
                Aman.startAnimation(animation);

            }
        });

        btnBlink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.blink);
                Aman.startAnimation(animation);

            }
        });

        btnBounce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.bounce);
                Aman.startAnimation(animation);

            }
        });

        btnSlide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide);
                Aman.startAnimation(animation);

            }
        });
    }
}