package com.example.familysong.H;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.familysong.F.F0.F0Activity;
import com.example.familysong.F.F1.F1Activity;
import com.example.familysong.F.F1.F1_2Activity;
import com.example.familysong.F.F2.F2Activity;
import com.example.familysong.F.F3.F3Activity;
import com.example.familysong.F.F5.F5_1Activity;
import com.example.familysong.F.FActivity;
import com.example.familysong.H.H0.H0Activity;
import com.example.familysong.H.H1.H1Activity;
import com.example.familysong.H.H1.H1_2Activity;
import com.example.familysong.H.H2.H2Activity;
import com.example.familysong.H.H3.H3Activity;
import com.example.familysong.H.H5.H5_1Activity;
import com.example.familysong.R;

public class HActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hactivity);
    }
    public void myclickf0(View view) {
        //显式意图的使用方法实现页面的跳转
        Intent intent=new Intent(this, H0Activity.class);
        //执行意图
        startActivity(intent);
    }

    public void myclickf1(View view) {
        Intent intent=new Intent(this, H1Activity.class);
        //执行意图
        startActivity(intent);
    }

    public void myclickf2(View view) {
        Intent intent=new Intent(this, H2Activity.class);
        //执行意图
        startActivity(intent);
    }

    public void myclickf5(View view) {
        Intent intent=new Intent(this, H5_1Activity.class);
        //执行意图
        startActivity(intent);
    }

    public void myclickf4(View view) {
        Intent intent=new Intent(this, H1_2Activity.class);
        //执行意图
        startActivity(intent);
    }

    public void myclickf3(View view) {
        Intent intent=new Intent(this, H3Activity.class);
        //执行意图
        startActivity(intent);
    }
}