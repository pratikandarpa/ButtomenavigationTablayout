package com.elite.homeway.ButtomNavSelected;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.elite.homeway.Project.FragmentCompletedProjects;
import com.elite.homeway.Project.FragmentNewLaunches;
import com.elite.homeway.Project.FragmentRunningProject;
import com.elite.homeway.Project.ViewPagerAdapter;
import com.elite.homeway.R;

public class ButtomNavProject extends Fragment {

    View view;
    private ViewPagerAdapter adapter;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.buttom_nav_project, container, false);
        viewPager = (ViewPager) view.findViewById(R.id.viewPager);
        tabLayout = (TabLayout) view.findViewById(R.id.id_tab);
        adapter = new ViewPagerAdapter(getActivity().getSupportFragmentManager());
        adapter.addFragment(new FragmentNewLaunches(), "New Launches");
        adapter.addFragment(new FragmentRunningProject(), "Running Project");
        adapter.addFragment(new FragmentCompletedProjects(), "Completed Projects");
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
        return view;
    }

}
