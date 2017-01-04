package com.example.asvetlichniy.brandb.viewmodel;

import android.databinding.ObservableField;
import android.support.annotation.NonNull;

public class MainActivityViewModel {

    @NonNull
    public final ObservableField<String> welcomeMessage = new ObservableField<>();
}
