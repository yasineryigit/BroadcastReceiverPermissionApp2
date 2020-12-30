package com.ossovita.broadcastreceiverpermissionapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void signal (View v){
        Intent intent = new Intent("my signal");
        //receiverPermission'da receive edecek kişinin bizim iznimizi kullanmasını istiyosak
        //bu projede sadece broadcast yolluyoruz
        sendBroadcast(intent,"my.permission");
    }
}