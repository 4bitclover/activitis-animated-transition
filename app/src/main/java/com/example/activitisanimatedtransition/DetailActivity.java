package com.example.activitisanimatedtransition;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;





public class DetailActivity extends AppCompatActivity {

    private ImageView profileImage;
    private TextView nameView;
    private TextView bioView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        profileImage = findViewById(R.id.profile_image);
        nameView = findViewById(R.id.name);
        bioView = findViewById(R.id.bio);

        String [] profileData = (String[]) getIntent().getExtras().get("profile");

        profileImage.setImageDrawable(
                getResources().getDrawable(
                        Integer.parseInt(profileData[2])
                )
        );

        profileImage.setTransitionName("img" + profileData[3]);
        nameView.setText(profileData[0]);
        nameView.setTransitionName("name" + profileData[3]);
        bioView.setText(profileData[1]);
        bioView.setTransitionName("bio" + profileData[3]);
    }
}
