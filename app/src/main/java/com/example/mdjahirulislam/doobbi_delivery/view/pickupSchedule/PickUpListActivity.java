package com.example.mdjahirulislam.doobbi_delivery.view.pickupSchedule;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.mdjahirulislam.doobbi_delivery.R;
import com.example.mdjahirulislam.doobbi_delivery.view.common.UserProfileActivity;
import com.example.mdjahirulislam.doobbi_delivery.view.home.HomeActivity;

public class PickUpListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pick_up_list);
    }

    public void goToUserProfileActivity(View view) {
        startActivity(new Intent(PickUpListActivity.this,UserProfileActivity.class));

    }
}
