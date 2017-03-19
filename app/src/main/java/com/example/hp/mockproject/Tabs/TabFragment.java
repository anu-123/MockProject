package com.example.hp.mockproject.Tabs;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hp.mockproject.Adapters.ViewpagerAdapter;
import com.example.hp.mockproject.R;


public class TabFragment extends Fragment {
    private RecyclerView category_recyclerview;
    private ViewPager viewpager;
    private TabLayout tabLayout;
    private ViewpagerAdapter viewpagerAdapter;

    public static TabFragment newInstance() {
        TabFragment fragment = new TabFragment();
        return fragment;
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_tab, container, false);
        category_recyclerview=(RecyclerView)view.findViewById(R.id.recycler_cat);
        viewpager=(ViewPager)view.findViewById(R.id.viewpager);
        tabLayout=(TabLayout)view.findViewById(R.id.tab_frag);
        viewpagerAdapter=new ViewpagerAdapter(getChildFragmentManager());
        viewpager.setAdapter(viewpagerAdapter);
        tabLayout.setupWithViewPager(viewpager);
        return view;
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

    }

    @Override
    public void onDetach() {
        super.onDetach();

    }



}
