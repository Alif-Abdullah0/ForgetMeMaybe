package com.example.forgetmenot.ui.accountability;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AccountabilityViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public AccountabilityViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is dashboard fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}