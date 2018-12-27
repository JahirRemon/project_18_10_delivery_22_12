package com.example.mdjahirulislam.doobbi_delivery.view.common;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.mdjahirulislam.doobbi_delivery.R;

public class QRCodeHomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qrcode_home);
    }

    public void goToQRCodeScan(View view) {


//        new IntentIntegrator(this).setCaptureActivity(QRCodeScannerActivity.class).initiateScan();


        startActivity(new Intent(QRCodeHomeActivity.this,QRCodeScannerActivity.class));

    }
}
