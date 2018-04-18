package com.example.farrell.smartcash2;

import android.app.FragmentManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class paymentFragment extends accountFragment{

    View myView;
    private ImageView img1,img2,img3,img4;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.payment_layout, container, false);
        img1 = (ImageView)myView.findViewById(R.id.imageBca);
        img2 = (ImageView)myView.findViewById(R.id.imageBNI);
        img3 = (ImageView)myView.findViewById(R.id.imageBRI);
        img4 = (ImageView)myView.findViewById(R.id.imageMandiri);
        img1.setOnClickListener(this);
        img2.setOnClickListener(this);
        img3.setOnClickListener(this);
        img4.setOnClickListener(this);
        return myView;
    }

    @Override
    public void onClick(View view) {
        super.onClick(view);
        FragmentManager fragmentManager = getFragmentManager();
        fragmentManager.beginTransaction()
                .replace(R.id.content_frame
                        , new dropdownbankFragment())
                .commit();
    }
}
