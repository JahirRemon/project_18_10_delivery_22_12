package com.example.mdjahirulislam.doobbi_delivery.view.common;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.mdjahirulislam.doobbi_delivery.R;

public class UserProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);
    }

    public void goToQRCodeScanHome(View view) {
        startActivity(new Intent(UserProfileActivity.this,QRCodeHomeActivity.class));
    }
}
