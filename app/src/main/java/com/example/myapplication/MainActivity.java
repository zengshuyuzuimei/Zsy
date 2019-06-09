package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //添加标题
        setTitle("曾淑雨");
        //添加控件
        EditText editText = new EditText(this, null);
        //添加控件
        RatingBar ratingBar = new RatingBar(this, null);
    }
}
