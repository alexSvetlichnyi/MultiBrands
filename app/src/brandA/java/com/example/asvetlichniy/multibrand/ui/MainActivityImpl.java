package com.example.asvetlichniy.multibrand.ui;

import android.support.design.widget.Snackbar;

import com.example.asvetlichniy.multibrand.R;

/**
 * Brand A customization
 */
public class MainActivityImpl extends MainActivity {

    @Override
    public void showDialog() {
        Snackbar snackbar = Snackbar.make(findViewById(R.id.coordinator_layout), "Welcome to Brand A", Snackbar.LENGTH_SHORT);
        snackbar.show();
    }
}
