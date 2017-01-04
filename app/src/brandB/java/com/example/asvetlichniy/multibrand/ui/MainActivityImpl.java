package com.example.asvetlichniy.multibrand.ui;

import android.app.AlertDialog;
import android.content.DialogInterface;

/**
 * Brand B customization
 */
public class MainActivityImpl extends MainActivity {

    @Override
    public void showDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivityImpl.this);
        builder.setTitle("Brand B");
        builder.setMessage(String.format("Hi %s, Welcome to Brand B", user.getFirstName()));
        builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        AlertDialog dialog = builder.create();
        dialog.show();
    }
}
