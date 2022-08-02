package com.example.familysong.B.B2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.familysong.R;

public class B2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b2);
    }

    public void myclickb2_1(View view) {
        //显式意图的使用方法实现页面的跳转
        Intent intent=new Intent(B2Activity.this, B2_1mygActivity.class);
        //执行意图
        startActivity(intent);
    }

    public void myclickb2_2(View view) {
        Intent intent=new Intent(B2Activity.this, B2_2cyjlActivity.class);
        //执行意图
        startActivity(intent);
    }
}