package com.example.eat_da;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class frag_restaurant extends Fragment {
    private View view;

    Button bt_details;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.restaurant, container, false);

        bt_details = view.findViewById(R.id.bt_details);
        bt_details.setOnClickListener(v->{
            ((MainActivity)getActivity()).setFrag(5);
        });

        return view;
    }
}
