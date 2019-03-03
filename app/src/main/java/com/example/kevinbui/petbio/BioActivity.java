package com.example.kevinbui.petbio;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class BioActivity extends AppCompatActivity {

    private ImageView petImageView;
    private TextView nameTextView;
    private TextView bioTextView;
    private Bundle extras;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bio);

        petImageView = (ImageView) findViewById(R.id.petImageViewID);
        nameTextView = (TextView) findViewById(R.id.nameID);
        bioTextView = (TextView) findViewById(R.id.bioTextID);

        extras = getIntent().getExtras();

        if(extras != null){
            String name = extras.getString("name");
            String bio = extras.getString("bio");

            setUp(name, bio);
        }
    }

    public void setUp(String name, String bio){
        if (name.equals("Helen")){
            // Show Dog stuff
            petImageView.setImageDrawable(getResources().getDrawable(R.drawable.icon_lg_dog));
            bioTextView.setText(bio);
            nameTextView.setText(name);
        } else if (name.equals("Kevin")) {
            // Show cat stuff
            petImageView.setImageDrawable(getResources().getDrawable(R.drawable.icon_lg_cat));
            bioTextView.setText(bio);
            nameTextView.setText(name);
        }
    }
}
