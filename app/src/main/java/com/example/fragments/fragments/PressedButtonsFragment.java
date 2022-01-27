package com.example.fragments.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.fragments.R;

public class PressedButtonsFragment extends Fragment {
    private static int pressed = 0;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_pressed_buttons, container, false);
        //((TextView)view.findViewById(R.id.text)).setText(pressed);
        ((TextView)view.findViewById(R.id.text)).setText(String.valueOf(pressed));
        view.findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pressed++;
                ((TextView)view.findViewById(R.id.text)).setText(String.valueOf(pressed));
            }
        });
        return view;
    }
}
