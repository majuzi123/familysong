package com.example.familysong;


import android.content.Context;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;


public class User {
    public static boolean saveUserIfo(String username, String password, Context context){
        FileOutputStream fos=null;
        String msg=null;
        try {
            fos=context.openFileOutput("MyData.txt",Context.MODE_PRIVATE);
            msg=username+":"+password;
            fos.write(msg.getBytes());
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        finally {
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    public static Map<String,String> getUserInfo(Context context){
        FileInputStream fis=null;
        try {
            fis=context.openFileInput("MyData.txt");
            byte[] buffer=new byte[fis.available()];
            fis.read(buffer);
            String msg=new String(buffer);
            String[] userinfo=msg.split(":");
            Map<String,String> userMap=new HashMap<>();
            userMap.put("username",userinfo[0]);
            userMap.put("password",userinfo[1]);
            return userMap;
        } catch (IOException e) {
            e.printStackTrace();
            return  null;
        }
        finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
