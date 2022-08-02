package com.example.familysong.B.B3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.familysong.B.B2.B2Activity;
import com.example.familysong.B.BActivity;
import com.example.familysong.R;

public class B3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b3);
    }

    public void myclickb3_1(View view) {
        Intent intent=new Intent(B3Activity.this, B3_skl1Activity.class);
        //执行意图
        startActivity(intent);
    }

    public void myclickb3_2(View view) {
        Intent intent=new Intent(B3Activity.this, B3_qjgActivity.class);
        //执行意图
        startActivity(intent);
    }
}