package com.diamond.diamond.quanlyship.adapter;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.diamond.diamond.quanlyship.fragment.DrinkFragment;
import com.diamond.diamond.quanlyship.fragment.FoodFragment;
import com.diamond.diamond.quanlyship.fragment.OtherFragment;

public class TabpagerAdapter extends FragmentStatePagerAdapter {
String[] tabarray = new String[]{"Food","Drink","Other"};
Integer tabnumber =3;
    public TabpagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return tabarray[position];
    }

    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0:
                FoodFragment foodFragment= new FoodFragment();
                return foodFragment;
            case 1:
                DrinkFragment drinkFragment= new DrinkFragment();
                return drinkFragment;
            case 2:
                OtherFragment otherFragment= new OtherFragment();
                return otherFragment;
        }
        return null;
    }

    @Override
    public int getCount() {
        return tabnumber;
    }
}
