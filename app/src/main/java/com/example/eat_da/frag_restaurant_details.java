package com.example.eat_da;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class frag_restaurant_details extends Fragment {
    private View view;

    ImageButton bt_back_details;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.restaurant_details, container, false);

        bt_back_details = view.findViewById(R.id.bt_back_details);

        bt_back_details = view.findViewById(R.id.bt_back_details);
        bt_back_details.setOnClickListener(v ->{
            ((MainActivity)getActivity()).setFrag(3);
        });
        return view;
    }
}
