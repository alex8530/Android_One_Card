package com.example.androidonedeal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class EditProfileActivity extends AppCompatActivity {

    EditText input_yourname, input_phone ;
    TextView txt_username , txt_update_info ,txt_edit_password;
    LinearLayout linear_update_info,linear_reset_password;
    AppCompatButton btn_update_info , btn_reset_password;
    RelativeLayout rel_back ;
    ImageView img_back_arrow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile);

        linear_update_info=findViewById(R.id.linear_update_info);
        linear_reset_password=findViewById(R.id.linear_reset_password);
        txt_username=findViewById(R.id.txt_username);
        btn_update_info=findViewById(R.id.btn_update_info);
        btn_reset_password=findViewById(R.id.btn_reset_password);
        img_back_arrow=findViewById(R.id.img_back_arrow);
        rel_back=findViewById(R.id.rel_back);

        rel_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


        txt_update_info=findViewById(R.id.txt_update_info);
        txt_update_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linear_update_info.setVisibility(View.VISIBLE);
                linear_reset_password.setVisibility(View.GONE);
                txt_update_info.setBackground(getResources().getDrawable(R.drawable.btn_bg_for_editprofile));
                txt_edit_password.setBackground(null);

            }
        });
        txt_edit_password=findViewById(R.id.txt_edit_password);
        txt_edit_password.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linear_update_info.setVisibility(View.GONE);
                linear_reset_password.setVisibility(View.VISIBLE);
                txt_edit_password.setBackground(getResources().getDrawable(R.drawable.btn_bg_for_editprofile));
                txt_update_info.setBackground(null);

            }
        });
    }
}
