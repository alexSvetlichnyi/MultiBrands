package com.example.asvetlichniy.brandb;

import android.content.DialogInterface;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.asvetlichniy.brandb.databinding.ActivityMainBinding;
import com.example.asvetlichniy.brandb.viewmodel.MainActivityViewModel;
import com.example.asvetlichniy.common.models.User;

/**
 * Base Activity class with common logic for both brands
 */
public class MainActivity extends AppCompatActivity {
    @NonNull
    protected User user = new User("Alex");
    @NonNull
    protected MainActivityViewModel viewModel = new MainActivityViewModel();
    @NonNull
    private View.OnClickListener buttonClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            showDialog();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setViewModel(viewModel);
        binding.setButtonClick(buttonClickListener);
        viewModel.welcomeMessage.set(getResources().getString(R.string.welcome_message));
    }

    public void showDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
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
