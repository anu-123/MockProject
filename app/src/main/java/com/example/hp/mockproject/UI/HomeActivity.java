package com.example.hp.mockproject.UI;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.hp.mockproject.Presenter.HomePresenter;
import com.example.hp.mockproject.R;
import com.example.hp.mockproject.Tabs.TabFragment;
import com.example.hp.mockproject.View.IHomeView;

public class HomeActivity extends AppCompatActivity implements IHomeView {
    private Toolbar home_toolbar;
    private NavigationView navigationView;
    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle actionBarDrawerToggle;
    private HomePresenter homePresenter;
    private FragmentManager fragmentManager;
    private FragmentTransaction transaction;
    private TabFragment tabFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        initialise();
        setNavigationDrawer();
        setNavigationMenuItems();
        if(savedInstanceState==null)
        {
            add_fragmnet();
        }
    }

    private void add_fragmnet() {
        fragmentManager=getSupportFragmentManager();
        transaction=fragmentManager.beginTransaction();
        transaction.add(R.id.frag_container,tabFragment,"tabMainFrag").commit();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                drawerLayout.openDrawer(Gravity.RIGHT);
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    private void setNavigationMenuItems() {

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.item_home:
                        break;
                    case R.id.item_profile:
                        break;
                }
                return false;
            }
        });
    }

    private void setNavigationDrawer() {
        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, home_toolbar, R.string.app_name, R.string.app_name) {
            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
            }

            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);
            }
        };
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();
    }

    private void initialise() {
        home_toolbar = (Toolbar) findViewById(R.id.toolbar_home);
        setSupportActionBar(home_toolbar);
        getSupportActionBar().setTitle("HomePage");
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_action_name);
        navigationView = (NavigationView) findViewById(R.id.nav_view);
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        homePresenter = new HomePresenter();
        homePresenter.attachView(this);
        tabFragment=TabFragment.newInstance();

    }

    @Override
    public void onClick(View view) {

    }
}
