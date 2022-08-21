package com.example.familysong.L.L3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.familysong.N.N3.N3_mbyActivity;
import com.example.familysong.N.N3.N3_qjgActivity;
import com.example.familysong.N.N3.N3_skl1Activity;
import com.example.familysong.R;

public class L3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_l3);
    }
    public void myclickf3_1(View view) {
        Intent intent=new Intent(this, L3_skl1Activity.class);
        //执行意图
        startActivity(intent);
    }

    public void myclickf3_2(View view) {
        Intent intent=new Intent(this, L3_qjgActivity.class);
        //执行意图
        startActivity(intent);
    }

    public void myclickf3_3(View view) {
        Intent intent=new Intent(this, L3_mbyActivity.class);
        //执行意图
        startActivity(intent);
    }
}