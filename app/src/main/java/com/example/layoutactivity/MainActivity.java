package com.example.layoutactivity ;

import android.app.Activity;
import android.os.Bundle;

import com.example.layoutactivity.R;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);
    }
}
