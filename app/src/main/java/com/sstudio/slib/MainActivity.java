package com.sstudio.slib;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.sstudio.slibe.TinyDB;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TinyDB tinyDB=new TinyDB(this);
    }
}
