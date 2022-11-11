package com.example.familysong.L.L0;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.familysong.N.N0.N0_1Activity;
import com.example.familysong.N.N0.N0_2Activity;
import com.example.familysong.R;

public class L0Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_l0);
    }
    public void myclickf0_1(View view) {
        Intent intent=new Intent(this, L0_1Activity.class);
        startActivity(intent);
    }



    public void myclickf0_2(View view) {
        Intent intent=new Intent(this, L0_2Activity.class);
        startActivity(intent);
    }

    public void myclickf0_3(View view) {
        Intent intent=new Intent(this, L0_3Activity.class);
        startActivity(intent);
    }
}