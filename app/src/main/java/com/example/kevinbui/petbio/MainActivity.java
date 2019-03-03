package com.example.kevinbui.petbio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView catView;
    private ImageView dogView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        catView = (ImageView)findViewById(R.id.catID);
        dogView = (ImageView)findViewById(R.id.dogID);

        catView.setOnClickListener(this);
        dogView.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.catID:
                Intent catIntent = new Intent(MainActivity.this, BioActivity.class);
                catIntent.putExtra("name", "Kevin");
                catIntent.putExtra("bio", "Great cat, loves people, and meows a lot");
                startActivity(catIntent);
                Toast.makeText(MainActivity.this, "Cat Touched", Toast.LENGTH_LONG).show();
                break;

            case R.id.dogID:
                Intent dogIntent = new Intent(MainActivity.this, BioActivity.class);
                dogIntent.putExtra("name", "Helen");
                dogIntent.putExtra("bio", "Great dog, loves people, and barks a lot");
                startActivity(dogIntent);
                Toast.makeText(MainActivity.this, "Dog Touched", Toast.LENGTH_LONG).show();
                break;
        }
    }
}
