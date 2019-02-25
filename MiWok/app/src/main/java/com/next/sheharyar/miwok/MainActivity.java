package com.next.sheharyar.miwok;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.next.sheharyar.miwok.Adapters.CategoryAdapter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_layout_three);


        // Find the view pager that will allow the user to swipe between fragments
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);

        // Create an adapter that knows which fragment should be shown on each page
        CategoryAdapter adapter = new CategoryAdapter(this, getSupportFragmentManager());

        // Set the adapter onto the view pager
        viewPager.setAdapter(adapter);

        // Find the tab layout that shows the tabs
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);

        // Connect the tab layout with the view pager. This will
        //   1. Update the tab layout when the view pager is swiped
        //   2. Update the view pager when a tab is selected
        //   3. Set the tab layout's tab names with the view pager's adapter's titles
        //      by calling onPageTitle()
        tabLayout.setupWithViewPager(viewPager);
    }
//        NumbersClickListener numbersClickListener = new NumbersClickListener();
//
//        // find the views that shows the numbers category
//        TextView numbers = (TextView)findViewById(R.id.numbers);
//        // set a clickListener on that view
////        numbers.setOnClickListener(numbersClickListener);
//        numbers.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                startActivity(new Intent(getApplicationContext(), NumbersActivity.class));
//            }
//        });
//    }
//
//    public void openNumbersList(View view) {
//        startActivity(new Intent(getApplicationContext(), NumbersActivity.class));
//    }
//
//    public void openPhrasesList(View view) {
//        startActivity(new Intent(getApplicationContext(), PhrasesActivity.class));
//    }
//
//    public void openColorsList(View view) {
//        startActivity(new Intent(getApplicationContext(), ColorsActivity.class));
//    }
//
//    public void openFamilyList(View view) {
//        startActivity(new Intent(getApplicationContext(), FamilyMembers.class));
//    }
//
//
//    @Override
//    public boolean onMenuItemClick(MenuItem menuItem) {
//
//        return false;
//    }
//
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.menu, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        int id = item.getItemId();
//
//        if (id == R.id.nav_settings){
//            startActivity(new Intent(getApplicationContext(), MusicPlayerActivity.class));
//        }
//        else if (id == R.id.nav_viewPagerExample){
//            startActivity(new Intent(getApplicationContext(), ViewPagerExample.class));
//        }
//        return true;
//    }
//
//    public void methodViewPagerExample(View view) {
//
//        startActivity(new Intent(getApplicationContext(), ViewPagerExample.class));
//    }
}