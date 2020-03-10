package com.bryanrr.fragments;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.bryanrr.fragments.fragments.BlankFragment;

public class FindingFragmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finding_fragment);

        BlankFragment bFirst =  (BlankFragment) getSupportFragmentManager().findFragmentById(R.id.fm_first);
        if(bFirst != null ) bFirst.changeHeaderText("Primer Fragment");

        BlankFragment bSecond =  (BlankFragment) getSupportFragmentManager().findFragmentById(R.id.fm_second);
        if(bSecond != null ) bSecond.changeHeaderText("Segundo Fragment");
    }
}
