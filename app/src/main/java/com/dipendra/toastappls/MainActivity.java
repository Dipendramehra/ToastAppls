package com.dipendra.toastappls;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.dipendra.toasty.Toaster;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toaster.simpletoast(this,"simple toast");
    }
}