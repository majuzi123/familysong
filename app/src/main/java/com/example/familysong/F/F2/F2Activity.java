package com.example.familysong.F.F2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.familysong.B.B2.B2Activity;
import com.example.familysong.B.B2.B2_1mygActivity;
import com.example.familysong.B.B2.B2_2cyjlActivity;
import com.example.familysong.R;

public class F2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_f2);
    }
    public void myclickf2_1(View view) {
        //显式意图的使用方法实现页面的跳转
        Intent intent=new Intent(this, F2_1Activity.class);
        //执行意图
        startActivity(intent);
    }

    public void myclickf2_2(View view) {
        Intent intent=new Intent(this, F2_2Activity.class);
        //执行意图
        startActivity(intent);
    }
}