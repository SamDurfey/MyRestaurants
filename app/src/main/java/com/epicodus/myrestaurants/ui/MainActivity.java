package com.epicodus.myrestaurants.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.epicodus.myrestaurants.R;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    @Bind(R.id.restaurantsButton) Button mRestaurantsButton;
    @Bind(R.id.locationEntry) EditText mLocationEntry;
    @Bind(R.id.appNameTextView) TextView mTitleTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        // Typeface stuff

        mRestaurantsButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view == mRestaurantsButton) {
            String location = mLocationEntry.getText().toString();
            Intent intent = new Intent(MainActivity.this, RestaurantsActivity.class);
            intent.putExtra("location", location);
            startActivity(intent);
        }
    }
}

