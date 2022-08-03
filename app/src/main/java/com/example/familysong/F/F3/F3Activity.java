package com.example.familysong.F.F3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.familysong.B.B3.B3Activity;
import com.example.familysong.B.B3.B3_qjgActivity;
import com.example.familysong.B.B3.B3_skl1Activity;
import com.example.familysong.R;

public class F3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_f3);
    }
    public void myclickf3_1(View view) {
        Intent intent=new Intent(this, F3_skl1Activity.class);
        //执行意图
        startActivity(intent);
    }

    public void myclickf3_2(View view) {
        Intent intent=new Intent(this, F3_qjgActivity.class);
        //执行意图
        startActivity(intent);
    }
}