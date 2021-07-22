package com.example.eat_da;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.bumptech.glide.Glide;

public class frag_settings extends Fragment {
    private View view;

    private TextView tv_nickName;
    private ImageView iv_profile;

    private Button bt_security_settings;
    private ImageButton bt_security_more;
    private LinearLayout layout_security_myinfo;
    private LinearLayout layout_security_mypost;
    private Button bt_security_myinfo;
    private Button bt_security_mypost;

    private Button bt_notice_settings;
    private ImageButton bt_notice_more;
    private LinearLayout layout_notice_matching;
    private LinearLayout layout_notice_chatting;
    private LinearLayout layout_notice_review;

    private Button bt_screen_settings;
    private ImageButton bt_screen_more;
    private LinearLayout layout_screen_fontsize;

    private Button bt_service_settings;
    private ImageButton bt_service_more;
    private LinearLayout layout_service_help;
    private LinearLayout layout_service_ask;
    private LinearLayout layout_service_license;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.settings, container, false);

        tv_nickName = view.findViewById(R.id.tv_nickName);
        tv_nickName.setText(((MainActivity)getActivity()).nickName);
        iv_profile = view.findViewById(R.id.iv_profile);
        Glide.with(this).load(((MainActivity)getActivity()).photoUrl).into(iv_profile);

        bt_security_settings = view.findViewById(R.id.bt_security_settings);
        bt_security_more = view.findViewById(R.id.bt_security_more);
        layout_security_myinfo = view.findViewById(R.id.layout_security_myinfo);
        layout_security_mypost = view.findViewById(R.id.layout_security_mypost);

        bt_notice_settings = view.findViewById(R.id.bt_notice_settings);
        bt_notice_more = view.findViewById(R.id.bt_notice_more);
        layout_notice_matching = view.findViewById(R.id.layout_notice_matching);
        layout_notice_chatting = view.findViewById(R.id.layout_notice_chatting);
        layout_notice_review = view.findViewById(R.id.layout_notice_review);

        bt_screen_settings = view.findViewById(R.id.bt_screen_settings);
        bt_screen_more = view.findViewById(R.id.bt_screen_more);
        layout_screen_fontsize = view.findViewById(R.id.layout_screen_fontsize);

        bt_service_settings = view.findViewById(R.id.bt_service_settings);
        bt_service_more = view.findViewById(R.id.bt_service_more);
        layout_service_help = view.findViewById(R.id.layout_service_help);
        layout_service_ask = view.findViewById(R.id.layout_service_ask);
        layout_service_license = view.findViewById(R.id.layout_service_license);

        bt_security_settings.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(layout_security_myinfo.getVisibility()==View.GONE){
                    layout_security_myinfo.setVisibility(View.VISIBLE);
                    layout_security_mypost.setVisibility(View.VISIBLE);
                }
                else if(layout_security_myinfo.getVisibility()==View.VISIBLE){
                    layout_security_myinfo.setVisibility(View.GONE);
                    layout_security_mypost.setVisibility(View.GONE);
                }
            }
        });
        bt_security_more.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(layout_security_myinfo.getVisibility()==View.GONE){
                    layout_security_myinfo.setVisibility(View.VISIBLE);
                    layout_security_mypost.setVisibility(View.VISIBLE);
                }
                else if(layout_security_myinfo.getVisibility()==View.VISIBLE){
                    layout_security_myinfo.setVisibility(View.GONE);
                    layout_security_mypost.setVisibility(View.GONE);
                }
            }
        });
        bt_notice_settings.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(layout_notice_matching.getVisibility()==View.GONE){
                    layout_notice_matching.setVisibility(View.VISIBLE);
                    layout_notice_chatting.setVisibility(View.VISIBLE);
                    layout_notice_review.setVisibility(View.VISIBLE);
                }
                else if(layout_notice_matching.getVisibility()==View.VISIBLE){
                    layout_notice_matching.setVisibility(View.GONE);
                    layout_notice_chatting.setVisibility(View.GONE);
                    layout_notice_review.setVisibility(View.GONE);
                }
            }
        });
        bt_notice_more.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(layout_notice_matching.getVisibility()==View.GONE){
                    layout_notice_matching.setVisibility(View.VISIBLE);
                    layout_notice_chatting.setVisibility(View.VISIBLE);
                    layout_notice_review.setVisibility(View.VISIBLE);
                }
                else if(layout_notice_matching.getVisibility()==View.VISIBLE){
                    layout_notice_matching.setVisibility(View.GONE);
                    layout_notice_chatting.setVisibility(View.GONE);
                    layout_notice_review.setVisibility(View.GONE);
                }
            }
        });
        bt_screen_settings.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(layout_screen_fontsize.getVisibility()==View.GONE){
                    layout_screen_fontsize.setVisibility(View.VISIBLE);
                }
                else if(layout_screen_fontsize.getVisibility()==View.VISIBLE){
                    layout_screen_fontsize.setVisibility(View.GONE);
                }
            }
        });
        bt_screen_more.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(layout_screen_fontsize.getVisibility()==View.GONE){
                    layout_screen_fontsize.setVisibility(View.VISIBLE);
                }
                else if(layout_screen_fontsize.getVisibility()==View.VISIBLE){
                    layout_screen_fontsize.setVisibility(View.GONE);
                }
            }
        });
        bt_service_settings.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(layout_service_help.getVisibility()==View.GONE){
                    layout_service_help.setVisibility(View.VISIBLE);
                    layout_service_ask.setVisibility(View.VISIBLE);
                    layout_service_license.setVisibility(View.VISIBLE);
                }
                else if(layout_service_help.getVisibility()==View.VISIBLE){
                    layout_service_help.setVisibility(View.GONE);
                    layout_service_ask.setVisibility(View.GONE);
                    layout_service_license.setVisibility(View.GONE);
                }
            }
        });
        bt_service_more.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(layout_service_help.getVisibility()==View.GONE){
                    layout_service_help.setVisibility(View.VISIBLE);
                    layout_service_ask.setVisibility(View.VISIBLE);
                    layout_service_license.setVisibility(View.VISIBLE);
                }
                else if(layout_service_help.getVisibility()==View.VISIBLE){
                    layout_service_help.setVisibility(View.GONE);
                    layout_service_ask.setVisibility(View.GONE);
                    layout_service_license.setVisibility(View.GONE);
                }
            }
        });

        return view;
    }
}
