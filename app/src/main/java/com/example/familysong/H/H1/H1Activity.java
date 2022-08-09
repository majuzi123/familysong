package com.example.familysong.H.H1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.familysong.F.F1.F1_1youdaoActivity;
import com.example.familysong.F.F1.F1_2Activity;
import com.example.familysong.F.F1.F1_3Activity;
import com.example.familysong.F.F1.F1_4Activity;
import com.example.familysong.F.F1.F1_5Activity;
import com.example.familysong.R;

public class H1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_h1);
    }
    public void myclickf1_1(View view) {
        //显式意图的使用方法实现页面的跳转
        Intent intent=new Intent(this, H1_1Activity.class);
        //执行意图
        startActivity(intent);
    }

    public void myclickf1_2(View view) {
        //显式意图的使用方法实现页面的跳转
        Intent intent=new Intent(this, H1_2Activity.class);
        //执行意图
        startActivity(intent);
    }

    public void myclickf1_3(View view) {
        //显式意图的使用方法实现页面的跳转
        Intent intent=new Intent(this, H1_3Activity.class);
        //执行意图
        startActivity(intent);
    }

    public void myclickf1_4(View view) {
        //显式意图的使用方法实现页面的跳转
        Intent intent=new Intent(this, H1_4Activity.class);
        //执行意图
        startActivity(intent);
    }

    public void myclickf1_5(View view) {
        Intent intent=new Intent(this, H1_5Activity.class);
        //执行意图
        startActivity(intent);
    }
}