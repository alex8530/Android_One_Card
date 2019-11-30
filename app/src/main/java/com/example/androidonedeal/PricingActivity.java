package com.example.androidonedeal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class PricingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pricing);

        LinearLayout linear_visa_master= findViewById(R.id.linear_visa_master);
        linear_visa_master.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), PaymentActivity.class);
                startActivity(intent);

            }
        });

        ImageView img_back_arrow= findViewById(R.id.img_back_arrow);
        img_back_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), PaymentActivity.class);
                startActivity(intent);

            }
        });


    }
}
