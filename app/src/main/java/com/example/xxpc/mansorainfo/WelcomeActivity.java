package com.example.xxpc.mansorainfo;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

public class WelcomeActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        int[][] states = new int[][]{
                new int[]{-android.R.attr.state_checked},
                new int[]{android.R.attr.state_checked},
                new int[]{}
        };
        int[] colors = new int[]{
                Color.parseColor(getString(R.string.colorWhite)),
                Color.parseColor(getString(R.string.colorRed)),
                Color.parseColor(getString(R.string.colorWhite)),
        };
        ColorStateList navigationViewColorStateList = new ColorStateList(states, colors);
        navigationView.setItemTextColor(navigationViewColorStateList);
        navigationView.setItemIconTintList(navigationViewColorStateList);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
    Intent intent;
    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            intent=new Intent(WelcomeActivity.this,ForFunActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_gallery) {
            intent=new Intent(WelcomeActivity.this,Medical_List.class);
            startActivity(intent);
        } else if (id == R.id.important_detailsId) {
            intent=new Intent(this,ImportantActivity.class);
            startActivity(intent);
        } else if (id == R.id.aboutId) {
            intent=new Intent(WelcomeActivity.this,AboutActivity.class);
            startActivity(intent);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public void important_details(View view) {
        intent=new Intent(this,ImportantActivity.class);
        startActivity(intent);
    }
}
