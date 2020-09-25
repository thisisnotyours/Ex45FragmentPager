package com.suek.ex45fragmentpager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    ViewPager pager;
    MyAdopter adopter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pager= findViewById(R.id.pager);
        adopter= new MyAdopter(getSupportFragmentManager());   //생성자에서 부르기?
        pager.setAdapter(adopter);
    }
}
