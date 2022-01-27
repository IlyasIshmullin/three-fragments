package com.example.fragments.fragments;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.fragment.app.Fragment;

import com.example.fragments.R;

public class BackGroundFragment extends Fragment {
    static int changing = 0;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_background, container, false);
        view.findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(changing == 4) changing = 0;
                else changing++;

                switch (changing) {
                    case 0:
                        view.findViewById(R.id.fragment_change_background).setBackgroundColor(R.color.black);
                        break;
                    case 1:
                        view.findViewById(R.id.fragment_change_background).setBackgroundColor(R.color.purple_200);
                        break;
                    case 2:
                        view.findViewById(R.id.fragment_change_background).setBackgroundColor(R.color.teal_200);
                        break;
                    case 3:
                        view.findViewById(R.id.fragment_change_background).setBackgroundColor(R.color.black);
                        break;
                }
            }
        });
        return view;
    }

}
