package com.example.familysong.F;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.familysong.B.B2.B2Activity;
import com.example.familysong.B.B3.B3Activity;
import com.example.familysong.B.B4.B4_1Activity;
import com.example.familysong.B.B5.B5Activity;
import com.example.familysong.F.F0.F0Activity;
import com.example.familysong.F.F1.F1Activity;
import com.example.familysong.F.F1.F1_2Activity;
import com.example.familysong.F.F2.F2Activity;
import com.example.familysong.F.F3.F3Activity;
import com.example.familysong.F.F5.F5_1Activity;
import com.example.familysong.R;

public class FActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factivity);
    }
    public void myclickf0(View view) {
        //显式意图的使用方法实现页面的跳转
        Intent intent=new Intent(FActivity.this, F0Activity.class);
        //执行意图
        startActivity(intent);
    }

    public void myclickf1(View view) {
        Intent intent=new Intent(FActivity.this, F1Activity.class);
        //执行意图
        startActivity(intent);
    }

    public void myclickf2(View view) {
        Intent intent=new Intent(FActivity.this, F2Activity.class);
        //执行意图
        startActivity(intent);
    }

    public void myclickf5(View view) {
        Intent intent=new Intent(FActivity.this, F5_1Activity.class);
        //执行意图
        startActivity(intent);
    }

    public void myclickf4(View view) {
        Intent intent=new Intent(FActivity.this, F1_2Activity.class);
        //执行意图
        startActivity(intent);
    }

    public void myclickf3(View view) {
        Intent intent=new Intent(FActivity.this, F3Activity.class);
        //执行意图
        startActivity(intent);
    }
}