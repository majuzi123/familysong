package com.example.familysong.N.N3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.familysong.H.H3.H3_qjgActivity;
import com.example.familysong.H.H3.H3_skl1Activity;
import com.example.familysong.R;

public class N3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_n3);
    }
    public void myclickf3_1(View view) {
        Intent intent=new Intent(this, N3_skl1Activity.class);
        //执行意图
        startActivity(intent);
    }

    public void myclickf3_2(View view) {
        Intent intent=new Intent(this, N3_qjgActivity.class);
        //执行意图
        startActivity(intent);
    }

    public void myclickf3_3(View view) {
        Intent intent=new Intent(this, N3_mbyActivity.class);
        //执行意图
        startActivity(intent);
    }
}