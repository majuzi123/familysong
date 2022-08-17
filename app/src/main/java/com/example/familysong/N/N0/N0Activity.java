package com.example.familysong.N.N0;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.familysong.H.H0.H0_1Activity;
import com.example.familysong.H.H0.H0_2Activity;
import com.example.familysong.R;

public class N0Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_n0);
    }
    public void myclickf0_1(View view) {
        Intent intent=new Intent(this, N0_1Activity.class);
        startActivity(intent);
    }



    public void myclickf0_2(View view) {
        Intent intent=new Intent(this, N0_2Activity.class);
        startActivity(intent);
    }
}