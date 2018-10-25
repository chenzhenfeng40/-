package com.example.administrator.buttonchangeczf;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private ImageButton button1;
    private ImageButton button2;
    private ImageButton button3;
    private ImageButton button4;

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = findViewById(R.id.home);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button1.setImageDrawable(getResources().getDrawable(R.drawable.tab_item_home_normal));
                button2.setImageDrawable(getResources().getDrawable(R.drawable.tab_item_category_focus));
                button3.setImageDrawable(getResources().getDrawable(R.drawable.tab_item_cart_focus));
                button4.setImageDrawable(getResources().getDrawable(R.drawable.tab_item_personal_focus));
            }
        });


        button2 = findViewById(R.id.category);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button1.setImageDrawable(getResources().getDrawable(R.drawable.tab_item_home_focus));
                button2.setImageDrawable(getResources().getDrawable(R.drawable.tab_item_category_normal));
                button3.setImageDrawable(getResources().getDrawable(R.drawable.tab_item_cart_focus));
                button4.setImageDrawable(getResources().getDrawable(R.drawable.tab_item_personal_focus));
            }
        });

        button3 = findViewById(R.id.cart);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button1.setImageDrawable(getResources().getDrawable(R.drawable.tab_item_home_focus));
                button2.setImageDrawable(getResources().getDrawable(R.drawable.tab_item_category_focus));
                button3.setImageDrawable(getResources().getDrawable(R.drawable.tab_item_cart_normal));
                button4.setImageDrawable(getResources().getDrawable(R.drawable.tab_item_personal_focus));
            }
        });


        button4 = findViewById(R.id.personal);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button1.setImageDrawable(getResources().getDrawable(R.drawable.tab_item_home_focus));
                button2.setImageDrawable(getResources().getDrawable(R.drawable.tab_item_category_focus));
                button3.setImageDrawable(getResources().getDrawable(R.drawable.tab_item_cart_focus));
                button4.setImageDrawable(getResources().getDrawable(R.drawable.tab_item_personal_normal));
            }
        });


    }





}
