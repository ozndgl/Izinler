package com.consoledeneme.izinler2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;

import java.security.Permission;

public class MainActivity extends AppCompatActivity {

    private static final int Permission = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (ContextCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.CAMERA)== PackageManager.PERMISSION_DENIED){
            ActivityCompat.requestPermissions(this,new String[]
                            {
                                    Manifest.permission.CAMERA,Manifest.permission.RECORD_AUDIO
                            }, Permission
                    );
        }


    }
}