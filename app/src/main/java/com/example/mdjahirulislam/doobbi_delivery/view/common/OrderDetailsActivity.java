package com.example.mdjahirulislam.doobbi_delivery.view.common;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.mdjahirulislam.doobbi_delivery.R;

public class OrderDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_details);
        Toast.makeText(this, "QR Code is\n"+getIntent().getStringExtra("id"), Toast.LENGTH_SHORT).show();
    }
}
