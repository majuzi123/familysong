package com.example.familysong.H.H0;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.familysong.F.F0.F0Activity;
import com.example.familysong.F.F0.F0_1Activity;
import com.example.familysong.F.F0.F0_2Activity;
import com.example.familysong.R;

public class H0Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_h0);
    }

    public void myclickf0_1(View view) {
        Intent intent=new Intent(this, H0_1Activity.class);
        startActivity(intent);
    }



    public void myclickf0_2(View view) {
        Intent intent=new Intent(this, H0_2Activity.class);
        startActivity(intent);
    }

    public void myclickf0_3(View view) {
        Intent intent=new Intent(this, H0_3Activity.class);
        startActivity(intent);
    }
}
