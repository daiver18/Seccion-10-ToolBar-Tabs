package com.example.daiverandresdoria.toolbartabs_seccion10.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.daiverandresdoria.toolbartabs_seccion10.Fragments.FirstFragment;
import com.example.daiverandresdoria.toolbartabs_seccion10.Fragments.SecondFragment;
import com.example.daiverandresdoria.toolbartabs_seccion10.Fragments.ThirdFragment;

public class PageAdapter extends FragmentStatePagerAdapter {

    private int numbfPage;

    public PageAdapter(FragmentManager fm, int numbfPage) {
        super(fm);
        numbfPage = numbfPage;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new FirstFragment();
            case 1:
                return new SecondFragment();
            case 2:
                return new ThirdFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return numbfPage;
    }
}
