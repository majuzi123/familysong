package com.example.familysong.B.B1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.familysong.B.B5.B5Activity;
import com.example.familysong.R;

public class B1_startActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b1start);
    }
    public void myclickb1_1(View view) {
        //显式意图的使用方法实现页面的跳转
        Intent intent=new Intent(B1_startActivity.this, B1_1youdaoActivity.class);
        //执行意图
        startActivity(intent);
    }

    public void myclickb1_2(View view) {
        //显式意图的使用方法实现页面的跳转
        Intent intent=new Intent(B1_startActivity.this, B1_2bijiaoActivity.class);
        //执行意图
        startActivity(intent);
    }

    public void myclickb1_3(View view) {
        //显式意图的使用方法实现页面的跳转
        Intent intent=new Intent(B1_startActivity.this, B1_3pinyinActivity.class);
        //执行意图
        startActivity(intent);
    }

    public void myclickb1_4(View view) {
        //显式意图的使用方法实现页面的跳转
        Intent intent=new Intent(B1_startActivity.this, B1_4nishActivity.class);
        //执行意图
        startActivity(intent);
    }

    public void myclickb1_5(View view) {
        Intent intent=new Intent(B1_startActivity.this, B1_5tgsActivity.class);
        //执行意图
        startActivity(intent);
    }
}