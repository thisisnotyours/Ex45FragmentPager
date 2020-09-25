package com.suek.ex45fragmentpager;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class MyAdopter extends FragmentPagerAdapter {


    Fragment[] fragments= new Fragment[3];

    //생성자
    public MyAdopter(@NonNull FragmentManager fm) {

        super(fm);

        fragments[0]= new page1Fragment();
        fragments[1]= new page2Fragment();
        fragments[2]= new page3Fragment();
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        return fragments[position];
    }

    @Override
    public int getCount() {     //니가 만들 페이지의 개수
        return fragments.length;
    }
}
