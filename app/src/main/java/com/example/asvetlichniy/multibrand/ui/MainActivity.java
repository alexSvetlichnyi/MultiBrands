package com.example.asvetlichniy.multibrand.ui;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.asvetlichniy.common.models.User;
import com.example.asvetlichniy.multibrand.R;
import com.example.asvetlichniy.multibrand.databinding.ActivityMainBinding;
import com.example.asvetlichniy.multibrand.viewmodel.MainActivityViewModel;

/**
 * Base Activity class with common logic for both brands
 */
public abstract class MainActivity extends AppCompatActivity {
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

    abstract void showDialog();
}
