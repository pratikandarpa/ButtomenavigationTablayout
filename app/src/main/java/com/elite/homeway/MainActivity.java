package com.elite.homeway;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.elite.homeway.ButtomNavSelected.ButtomNavHome;
import com.elite.homeway.ButtomNavSelected.ButtomNavNotification;
import com.elite.homeway.ButtomNavSelected.ButtomNavProject;
import com.elite.homeway.ButtomNavSelected.ButtomNavUser;
import com.elite.homeway.Project.FragmentCompletedProjects;
import com.elite.homeway.Project.FragmentNewLaunches;
import com.elite.homeway.Project.FragmentRunningProject;
import com.elite.homeway.Project.ViewPagerAdapter;

public class MainActivity extends AppCompatActivity {

    private ButtomNavHome buttomNavHome;
    private ButtomNavProject buttomNavProject;
    private ButtomNavNotification buttomNavNotification;
    private ButtomNavUser buttomNavUser;

    private BottomNavigationView mbottomNavigationView;
    private FrameLayout mframeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttomNavHome = new ButtomNavHome();
        buttomNavProject = new ButtomNavProject();
        buttomNavNotification = new ButtomNavNotification();
        buttomNavUser = new ButtomNavUser();

        setFragment(buttomNavHome);
        mframeLayout = (FrameLayout) findViewById(R.id.id_framelayout);
        mbottomNavigationView = (BottomNavigationView) findViewById(R.id.id_buttom_navigation);

        setFragment(buttomNavHome);
        mbottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.id_home:
                        setFragment(buttomNavHome);
                        return true;

                    case R.id.id_project:
                        setFragment(buttomNavProject);
                        return true;

                    case R.id.id_notification:
                        setFragment(buttomNavNotification);
                        return true;

                    case R.id.id_user:
                        setFragment(buttomNavUser);
                        return true;

                    default:
                        return false;
                }
            }
        });
    }

    private void setFragment(Fragment fragment) {

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.id_framelayout, fragment);
        fragmentTransaction.commit();
    }
}
