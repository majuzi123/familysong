package com.example.familysong.F.F1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.familysong.B.B1.B1_1youdaoActivity;
import com.example.familysong.B.B1.B1_2bijiaoActivity;
import com.example.familysong.B.B1.B1_3pinyinActivity;
import com.example.familysong.B.B1.B1_4nishActivity;
import com.example.familysong.B.B1.B1_5tgsActivity;
import com.example.familysong.B.B1.B1_startActivity;
import com.example.familysong.R;

public class F1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_f1);
    }
    public void myclickf1_1(View view) {
        //显式意图的使用方法实现页面的跳转
        Intent intent=new Intent(this, F1_1youdaoActivity.class);
        //执行意图
        startActivity(intent);
    }

    public void myclickf1_2(View view) {
        //显式意图的使用方法实现页面的跳转
        Intent intent=new Intent(this, F1_2Activity.class);
        //执行意图
        startActivity(intent);
    }

    public void myclickf1_3(View view) {
        //显式意图的使用方法实现页面的跳转
        Intent intent=new Intent(this, F1_3Activity.class);
        //执行意图
        startActivity(intent);
    }

    public void myclickf1_4(View view) {
        //显式意图的使用方法实现页面的跳转
        Intent intent=new Intent(this, F1_4Activity.class);
        //执行意图
        startActivity(intent);
    }

    public void myclickf1_5(View view) {
        Intent intent=new Intent(this, F1_5Activity.class);
        //执行意图
        startActivity(intent);
    }
}