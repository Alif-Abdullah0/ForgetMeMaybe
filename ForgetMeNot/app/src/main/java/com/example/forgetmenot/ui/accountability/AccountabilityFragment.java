package com.example.forgetmenot.ui.accountability;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.forgetmenot.R;

public class AccountabilityFragment extends Fragment {

    private AccountabilityViewModel accountabilityViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        accountabilityViewModel =
                new ViewModelProvider(this).get(AccountabilityViewModel.class);
        View root = inflater.inflate(R.layout.fragment_accountability, container, false);
        final TextView textView = root.findViewById(R.id.text_dashboard);
        accountabilityViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}