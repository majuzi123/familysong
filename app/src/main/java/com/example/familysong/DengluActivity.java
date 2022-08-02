package com.example.familysong;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Map;

public class DengluActivity extends AppCompatActivity {
    private Button loginBtn;
    private EditText et_UserName,et_Password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_denglu);
        init();
        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String uname = et_UserName.getText().toString();
                String pwd = et_Password.getText().toString();
                Map<String, String> userMap = User.getUserInfo(DengluActivity.this);
                if (uname.equals(userMap.get("username")) && pwd.equals(userMap.get("password"))) {
                    Toast.makeText(DengluActivity.this, "验证成功！", Toast.LENGTH_LONG).show();
                    Intent intent=new Intent(DengluActivity.this,ShiyongActivity.class);
                    //执行意图
                    startActivity(intent);
                } else {
                    Toast.makeText(DengluActivity.this, "验证失败！", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    private void init() {
        loginBtn=findViewById(R.id.login);
        et_UserName=findViewById(R.id.userid);
        et_Password=findViewById(R.id.pwd);
    }
    public void myclick2(View view) {
        finish();
    }
}