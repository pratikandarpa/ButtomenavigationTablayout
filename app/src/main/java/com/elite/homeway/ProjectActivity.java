package com.elite.homeway;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.elite.homeway.Project.FragmentCompletedProjects;
import com.elite.homeway.Project.FragmentNewLaunches;
import com.elite.homeway.Project.FragmentRunningProject;
import com.elite.homeway.Project.ViewPagerAdapter;

public class ProjectActivity extends AppCompatActivity {

    private ViewPagerAdapter adapter;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project);

        viewPager = (ViewPager) findViewById(R.id.viewPager);
        tabLayout = (TabLayout) findViewById(R.id.id_tab);
        adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new FragmentNewLaunches(), "New Launches");
        adapter.addFragment(new FragmentRunningProject(), "Running Project");
        adapter.addFragment(new FragmentCompletedProjects(), "Completed Projects");
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
