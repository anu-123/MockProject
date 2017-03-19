package com.example.hp.mockproject.Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.hp.mockproject.Tabs.TabOne;

/**
 * Created by HP on 3/19/2017.
 */
public class ViewpagerAdapter extends FragmentStatePagerAdapter {
    public ViewpagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return TabOne.newInstance();
    }

    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return "Tab"+position;
    }
}
