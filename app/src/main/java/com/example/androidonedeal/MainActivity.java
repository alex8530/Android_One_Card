package com.example.androidonedeal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    DrawerLayout drawer_layout;
    NavigationView nav_view;
//    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        drawer_layout = findViewById(R.id.drawer_layout);
        View view = LayoutInflater.from(this).inflate(R.layout.alex_nav_menu, null);
        nav_view =  findViewById(R.id.nav_view);
        nav_view.addView(view);
        nav_view.getBackground().setAlpha(0);



        ImageView img_nav = findViewById(R.id.img_nav);
        img_nav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawer_layout.openDrawer(GravityCompat.START);
            }
        });


        ///init views
        TextView tv_profile = view.findViewById(R.id.tv_profile);
        tv_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,EditProfileActivity.class);
                startActivity(i);

            }
        });


        TextView tv_terms = view.findViewById(R.id.tv_terms);
        tv_terms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,PrivacyPolicyActivity.class);
                startActivity(i);
            }
        });


        Button btn_buy_card =  view.findViewById(R.id.btn_buy_card);
        btn_buy_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,PricingActivity.class);
                startActivity(i);
            }
        });


        TextView tv_noti =  view.findViewById(R.id.tv_noti);
        tv_noti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,NotificationActivity.class);
                startActivity(i);
            }
        });



        TextView tv_my_deals =  view.findViewById(R.id.tv_my_deals);
        tv_my_deals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,MyDealsActivity.class);
                startActivity(i);
            }
        });



      final RelativeLayout relative_ads =  findViewById(R.id.relative_ads);
        ImageView img_ex =  findViewById(R.id.img_ex);
        img_ex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                relative_ads.setVisibility(View.GONE);

            }
        });






    }
}
