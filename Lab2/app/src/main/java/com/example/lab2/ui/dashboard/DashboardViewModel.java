package com.example.lab2.ui.dashboard;

import android.widget.ImageView;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
/// Szymon Kuczyński s22466
public class DashboardViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public DashboardViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("You should eat around 2000 kcal");
    }

    public LiveData<String> getText() {
        return mText;
    }
}