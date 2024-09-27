package com.example.constraintlayoutapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class SnapChatActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snap_chat);

        getSupportActionBar().hide();
    }
}