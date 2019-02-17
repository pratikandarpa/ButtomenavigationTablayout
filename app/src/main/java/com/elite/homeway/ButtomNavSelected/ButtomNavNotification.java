package com.elite.homeway.ButtomNavSelected;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.elite.homeway.R;

public class ButtomNavNotification extends Fragment {

    View view;
    public ButtomNavNotification() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.buttom_nav_notification,container,false);
        TextView textView = view.findViewById(R.id.id_textview_home);
        return view;
    }
}
