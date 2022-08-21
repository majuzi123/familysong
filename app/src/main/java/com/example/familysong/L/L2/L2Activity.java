package com.example.familysong.L.L2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.familysong.N.N2.N2_1Activity;
import com.example.familysong.N.N2.N2_2Activity;
import com.example.familysong.N.N2.N2_3Activity;
import com.example.familysong.R;

public class L2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_l2);
    }
    public void myclickf2_1(View view) {
        //显式意图的使用方法实现页面的跳转
        Intent intent=new Intent(this, L2_1Activity.class);
        //执行意图
        startActivity(intent);
    }

    public void myclickf2_2(View view) {
        Intent intent=new Intent(this, L2_2Activity.class);
        //执行意图
        startActivity(intent);
    }

    public void myclickf2_3(View view) {
        Intent intent=new Intent(this, L2_3Activity.class);
        //执行意图
        startActivity(intent);
    }
}