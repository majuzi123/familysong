package com.example.familysong.B.B0;


import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.VideoView;


import com.example.familysong.R;

public class B0Activity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState)//生命周期
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b0);

    }

    public void myclickb0_1(View view) {
        Intent intent=new Intent(B0Activity.this,B0_1Activity.class);
        startActivity(intent);
    }



    public void myclickb0_2(View view) {
        Intent intent=new Intent(B0Activity.this,B0_2Activity.class);
        startActivity(intent);
    }
}
