package com.example.familysong;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ZhuceActivity extends AppCompatActivity  {
    private Button registerBtn;
    private EditText et_UserName,et_Password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zhuce);
        init();
        registerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String uname=et_UserName.getText().toString();
                String pwd=et_Password.getText().toString();
                if(User.saveUserIfo(uname,pwd,ZhuceActivity.this)){
                    Toast.makeText(ZhuceActivity.this, "注册成功！", Toast.LENGTH_LONG).show();
                    Intent intent=new Intent(ZhuceActivity.this,MainActivity.class);
                    //执行意图
                    startActivity(intent);

                }else{
                    Toast.makeText(ZhuceActivity.this, "注册失败！", Toast.LENGTH_LONG).show();
                }


            }
        });
    }

    private void init() {
        et_UserName=findViewById(R.id.userid);
        et_Password=findViewById(R.id.pwd);
        registerBtn=findViewById(R.id.register);
    }
}