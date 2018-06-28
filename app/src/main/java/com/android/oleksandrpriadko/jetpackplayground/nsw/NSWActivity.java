package com.android.oleksandrpriadko.jetpackplayground.nsw;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.android.oleksandrpriadko.jetpackplayground.R;

import androidx.navigation.Navigation;

public class NSWActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nsw);
    }

    @Override
    public void onBackPressed() {
        if (!Navigation.findNavController(this, R.id.nav_host).popBackStack()) {
            super.onBackPressed();
        }
    }
}
