package com.example.familysong.F.F0;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import com.example.familysong.R;

public class F0Activity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState)//生命周期
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_f0);

    }

    public void myclickf0_1(View view) {
        Intent intent=new Intent(F0Activity.this, F0_1Activity.class);
        startActivity(intent);
    }



    public void myclickf0_2(View view) {
        Intent intent=new Intent(F0Activity.this,F0_2Activity.class);
        startActivity(intent);
    }

    public void myclickf0_3(View view) {
        Intent intent=new Intent(F0Activity.this,F0_3Activity.class);
        startActivity(intent);
    }
}
