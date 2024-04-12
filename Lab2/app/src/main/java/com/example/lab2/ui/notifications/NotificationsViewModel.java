package com.example.lab2.ui.notifications;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
/// Szymon Kuczyński s22466
public class NotificationsViewModel extends ViewModel {

    private final MutableLiveData<String> mText1;
    private final MutableLiveData<String> mText2;
    private final MutableLiveData<String> mText3;
    private final MutableLiveData<String> mText4;
    private final MutableLiveData<String> mText5;
    private final MutableLiveData<String> mText6;


    public NotificationsViewModel() {
        mText1 = new MutableLiveData<>();
        mText1.setValue("Breakfast recipe");
        mText2 = new MutableLiveData<>();
        mText2.setValue("Placki z dyni");
        mText3 = new MutableLiveData<>();
        mText3.setValue("Lunch Recipe");
        mText4 = new MutableLiveData<>();
        mText4.setValue("Tortilla");
        mText5 = new MutableLiveData<>();
        mText5.setValue("Supper recipe");
        mText6 = new MutableLiveData<>();
        mText6.setValue("Sałatka");
    }

    public LiveData<String> getText1() {
        return mText1;
    }
    public LiveData<String> getText2() {
        return mText2;}
    public LiveData<String> getText3() {
        return mText3;
    }
    public LiveData<String> getText4() {
        return mText4;
    }
    public LiveData<String> getText5() {
        return mText5;
    }
    public LiveData<String> getText6() {
        return mText6;
    }
}