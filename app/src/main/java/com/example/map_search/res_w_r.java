package com.example.map_search;

import android.os.Bundle;
import android.widget.RatingBar;

import androidx.appcompat.app.AppCompatActivity;

public class res_w_r extends AppCompatActivity {
    private RatingBar ratingbar;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.res_w_r);

        ratingbar = findViewById(R.id.ratingBarSmall5);
        ratingbar = findViewById(R.id.ratingBarSmall);

        ratingbar.setOnRatingBarChangeListener(new Listener());
    }

    class Listener implements RatingBar.OnRatingBarChangeListener
    {
        @Override
        public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
            ratingbar.setRating(rating);
        }
    }

}

