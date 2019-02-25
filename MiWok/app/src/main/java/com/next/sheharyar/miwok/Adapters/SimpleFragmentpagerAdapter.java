package com.next.sheharyar.miwok.Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.next.sheharyar.miwok.FridayFragment;
import com.next.sheharyar.miwok.MondayFragment;
import com.next.sheharyar.miwok.TuesdayFragment;

/**
 * Created by sheharyar on 2/13/2019.
 */

public class SimpleFragmentpagerAdapter extends FragmentPagerAdapter {
    public SimpleFragmentpagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
         if (position == 0){
             return new MondayFragment();
         } else if (position == 1){
             return new TuesdayFragment();
         } else
             return new FridayFragment();
    }

    @Override
    public int getCount() {
        return 3;
    }
}
