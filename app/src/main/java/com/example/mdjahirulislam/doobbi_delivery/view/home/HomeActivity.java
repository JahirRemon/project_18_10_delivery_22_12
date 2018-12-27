package com.example.mdjahirulislam.doobbi_delivery.view.home;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.mdjahirulislam.doobbi_delivery.R;
import com.example.mdjahirulislam.doobbi_delivery.view.common.UserProfileActivity;
import com.example.mdjahirulislam.doobbi_delivery.view.pickupSchedule.PickUpListActivity;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void goToPickUpListActivity(View view) {
        startActivity(new Intent(HomeActivity.this,PickUpListActivity.class));

    }

    public void goToUserProfileActivity(View view) {
        startActivity(new Intent(HomeActivity.this,UserProfileActivity.class));

    }
}
