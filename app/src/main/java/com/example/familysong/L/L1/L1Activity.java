package com.example.familysong.L.L1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.familysong.N.N1.N1_1Activity;
import com.example.familysong.N.N1.N1_2Activity;
import com.example.familysong.N.N1.N1_3Activity;
import com.example.familysong.N.N1.N1_4Activity;
import com.example.familysong.N.N1.N1_5Activity;
import com.example.familysong.R;

public class L1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_l1);
    }
    public void myclickf1_1(View view) {
        //显式意图的使用方法实现页面的跳转
        Intent intent=new Intent(this, L1_1Activity.class);
        //执行意图
        startActivity(intent);
    }

    public void myclickf1_2(View view) {
        //显式意图的使用方法实现页面的跳转
        Intent intent=new Intent(this, L1_2Activity.class);
        //执行意图
        startActivity(intent);
    }

    public void myclickf1_3(View view) {
        //显式意图的使用方法实现页面的跳转
        Intent intent=new Intent(this, L1_3Activity.class);
        //执行意图
        startActivity(intent);
    }

    public void myclickf1_4(View view) {
        //显式意图的使用方法实现页面的跳转
        Intent intent=new Intent(this, L1_4Activity.class);
        //执行意图
        startActivity(intent);
    }

    public void myclickf1_5(View view) {
        Intent intent=new Intent(this, L1_5Activity.class);
        //执行意图
        startActivity(intent);
    }
}