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
    }

    public void setUp(String name, String bio){

    }
}
