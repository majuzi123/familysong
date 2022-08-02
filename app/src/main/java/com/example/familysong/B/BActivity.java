package com.example.familysong.B;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.familysong.B.B0.B0Activity;
import com.example.familysong.B.B1.B1_startActivity;
import com.example.familysong.B.B2.B2Activity;
import com.example.familysong.B.B3.B3Activity;
import com.example.familysong.B.B4.B4_1Activity;
import com.example.familysong.B.B5.B5Activity;
import com.example.familysong.R;

public class BActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bactivity);
    }

    public void myclickb0(View view) {
        //显式意图的使用方法实现页面的跳转
        Intent intent=new Intent(BActivity.this, B0Activity.class);
        //执行意图
        startActivity(intent);
    }

    public void myclickb1(View view) {
        Intent intent=new Intent(BActivity.this, B1_startActivity.class);
        //执行意图
        startActivity(intent);
    }

    public void myclickb2(View view) {
        Intent intent=new Intent(BActivity.this, B2Activity.class);
        //执行意图
        startActivity(intent);
    }

    public void myclickb5(View view) {
        Intent intent=new Intent(BActivity.this, B5Activity.class);
        //执行意图
        startActivity(intent);
    }

    public void myclickb4(View view) {
        Intent intent=new Intent(BActivity.this, B4_1Activity.class);
        //执行意图
        startActivity(intent);
    }

    public void myclickb3(View view) {
        Intent intent=new Intent(BActivity.this, B3Activity.class);
        //执行意图
        startActivity(intent);
    }
}