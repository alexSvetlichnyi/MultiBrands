package com.example.asvetlichniy.multibrand.ui;

import android.support.design.widget.Snackbar;

import com.example.asvetlichniy.multibrand.R;

/**
 * Brand A customization
 */
public class MainActivityImpl extends MainActivity {

    @Override
    public void showDialog() {
        Snackbar snackbar = Snackbar.make(findViewById(R.id.coordinator_layout), String.format("Hi %s, Welcome to Brand A", user
                .getFirstName()), Snackbar.LENGTH_SHORT);
        snackbar.show();
    }
}
