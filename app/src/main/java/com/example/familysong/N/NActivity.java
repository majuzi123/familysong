package com.example.familysong.N;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.familysong.H.H0.H0Activity;
import com.example.familysong.H.H1.H1Activity;
import com.example.familysong.H.H1.H1_2Activity;
import com.example.familysong.H.H2.H2Activity;
import com.example.familysong.H.H3.H3Activity;
import com.example.familysong.H.H5.H5_1Activity;
import com.example.familysong.N.N0.N0Activity;
import com.example.familysong.N.N1.N1Activity;
import com.example.familysong.N.N1.N1_2Activity;
import com.example.familysong.N.N2.N2Activity;
import com.example.familysong.N.N3.N3Activity;
import com.example.familysong.N.N5.N5_1Activity;
import com.example.familysong.R;

public class NActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nactivity);
    }
        public void myclickf0(View view) {
            //显式意图的使用方法实现页面的跳转
            Intent intent=new Intent(this, N0Activity.class);
            //执行意图
            startActivity(intent);
        }

        public void myclickf1(View view) {
            Intent intent=new Intent(this, N1Activity.class);
            //执行意图
            startActivity(intent);
        }

        public void myclickf2(View view) {
            Intent intent=new Intent(this, N2Activity.class);
            //执行意图
            startActivity(intent);
        }

        public void myclickf5(View view) {
            Intent intent=new Intent(this, N5_1Activity.class);
            //执行意图
            startActivity(intent);
        }

        public void myclickf4(View view) {
            Intent intent=new Intent(this, N1_2Activity.class);
            //执行意图
            startActivity(intent);
        }

        public void myclickf3(View view) {
            Intent intent=new Intent(this, N3Activity.class);
            //执行意图
            startActivity(intent);
        }
    }