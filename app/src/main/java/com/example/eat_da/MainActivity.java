package com.example.eat_da;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;
    private FragmentManager fm;
    private FragmentTransaction ft;
    private frag_chatting frag_chatting;
    private frag_eatfolio frag_eatfolio;
    private frag_matching frag_matching;
    private frag_restaurant frag_restaurant;
    private frag_settings frag_settings;

    private frag_restaurant_details frag_restaurant_details;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        frag_chatting = new frag_chatting();
        frag_eatfolio = new frag_eatfolio();
        frag_matching = new frag_matching();
        frag_restaurant = new frag_restaurant();
        frag_settings = new frag_settings();
        frag_restaurant_details = new frag_restaurant_details();

        setFrag(0);         //첫 프래그먼트 화면 지정

        bottomNavigationView = findViewById(R.id.bottomNavi);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.action_eatfolio:
                        setFrag(0);
                        break;
                    case R.id.action_matching:
                        setFrag(1);
                        break;
                    case R.id.action_chatting:
                        setFrag(2);
                        break;
                    case R.id.action_restaurant:
                        setFrag(3);
                        break;
                    case R.id.action_settings:
                        setFrag(4);
                        break;
                }
                return true;
            }
        });


    }
    //프래그먼트 교체가 일어나는 실행문
    public void setFrag(int n){
        fm = getSupportFragmentManager();
        ft = fm.beginTransaction();
        switch(n){
            case 0:
                ft.replace(R.id.main_frame, frag_eatfolio);
                ft.commit();
                break;
            case 1:
                ft.replace(R.id.main_frame, frag_matching);
                ft.commit();
                break;
            case 2:
                ft.replace(R.id.main_frame, frag_chatting);
                ft.commit();
                break;
            case 3:
                ft.replace(R.id.main_frame, frag_restaurant);
                ft.commit();
                break;
            case 4:
                ft.replace(R.id.main_frame, frag_settings);
                ft.commit();
                break;
            case 5:
                ft.replace(R.id.main_frame, frag_restaurant_details);
                ft.commit();
                break;
        }
    }
}