package com.example.xxpc.mansorainfo;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class ForFunActivity extends AppCompatActivity {

    TextView textViewMaps;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_for_fun);
        TabLayout tabLayout=findViewById(R.id.tabId);
        ViewPager pager = findViewById(R.id.pagerId);
        textViewMaps= findViewById(R.id.txtmaps);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        pager.setAdapter(new pagerAdapter(supportFragmentManager));
    }

    class pagerAdapter extends FragmentPagerAdapter {


        Fragment fragment=null;
        public pagerAdapter(FragmentManager fm) {
            super(fm);
        }
        @Override
        public android.support.v4.app.Fragment getItem(int position) {
            switch (position) {
                case 0:
                    fragment = new F_Cofe();
                    break;
                case 2:
                    fragment = new F_public_places();
                    break;
                case 1:
                    fragment = new F_Restrunt();
                    break;
            }
            return fragment;
        }

        @Override
        public int getCount() {
            return 3;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            String title="";
            switch (position){
                case 0:
                    title=getString(R.string.cofee);
                    break;
                case 1:
                    title= getString(R.string.restRunt);
                    break;
                case 2:
                    title= getString(R.string.Public_Places);
                    break;
            }
            return title;
        }
    }
}
