package com.example.farrell.smartcash2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class dropdownbankFragment extends paymentFragment {
    View myView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.dropdownbank_layout, container, false);

        return myView;
    }
}
