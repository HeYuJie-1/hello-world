package com.example.app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("test","Hello, World, I am develop");
        Log.d("test","develop 第一次修改提交");
        Log.d("test","develop revert后的修改提交");
    }
}
