package com.example.familysong.L;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.familysong.L.L0.L0Activity;
import com.example.familysong.L.L1.L1Activity;
import com.example.familysong.L.L1.L1_2Activity;
import com.example.familysong.L.L2.L2Activity;
import com.example.familysong.L.L3.L3Activity;
import com.example.familysong.L.L5.L5_1Activity;
import com.example.familysong.N.N0.N0Activity;
import com.example.familysong.N.N1.N1Activity;
import com.example.familysong.N.N1.N1_2Activity;
import com.example.familysong.N.N2.N2Activity;
import com.example.familysong.N.N3.N3Activity;
import com.example.familysong.N.N5.N5_1Activity;
import com.example.familysong.R;

public class LActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lactivity);
    }
    public void myclickf0(View view) {
        //显式意图的使用方法实现页面的跳转
        Intent intent=new Intent(this, L0Activity.class);
        //执行意图
        startActivity(intent);
    }

    public void myclickf1(View view) {
        Intent intent=new Intent(this, L1Activity.class);
        //执行意图
        startActivity(intent);
    }

    public void myclickf2(View view) {
        Intent intent=new Intent(this, L2Activity.class);
        //执行意图
        startActivity(intent);
    }

    public void myclickf5(View view) {
        Intent intent=new Intent(this, L5_1Activity.class);
        //执行意图
        startActivity(intent);
    }

    public void myclickf4(View view) {
        Intent intent=new Intent(this, L1_2Activity.class);
        //执行意图
        startActivity(intent);
    }

    public void myclickf3(View view) {
        Intent intent=new Intent(this, L3Activity.class);
        //执行意图
        startActivity(intent);
    }
}