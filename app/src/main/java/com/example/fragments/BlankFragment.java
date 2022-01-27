package com.example.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class BlankFragment extends Fragment {
    Button btnBackground;
    Button btnPressedButtons;
    Button btnToast;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_blank, container, false);
        view.findViewById(R.id.btnBackground).setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_blankFragment2_to_backGroundFragment));
        view.findViewById(R.id.btnToast).setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_blankFragment2_to_toastFragment));
        view.findViewById(R.id.btnClickedButtons).setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_blankFragment2_to_pressedButtonsFragment));

        return view;
    }
}