package com.example.familysong;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ShiyongActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shiyong);
    }

    public void myclick4(View view) {
        //显式意图的使用方法实现页面的跳转
        Intent intent=new Intent(ShiyongActivity.this,yinActivity.class);
        //执行意图
        startActivity(intent);
    }

    public void myclick5(View view) {
        Intent intent=new Intent(ShiyongActivity.this,lianxiwomenActivity.class);
        //执行意图
        startActivity(intent);
    }

    public void myclick6(View view) {
        Intent intent=new Intent(ShiyongActivity.this,qianxuzhiActivity2.class);
        //执行意图
        startActivity(intent);
    }
}