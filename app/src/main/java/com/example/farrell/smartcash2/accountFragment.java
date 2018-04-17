package com.example.farrell.smartcash2;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;

/**
 * Created by farrell on 14/04/2018.
 */

public class accountFragment extends Fragment implements View.OnClickListener {

    View myView;
    private Button btnPayment;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.account_layout,container,false);
        btnPayment = (Button)myView.findViewById(R.id.buttonPayment);
        btnPayment.setOnClickListener(this);
        return myView;
    }

    @Override
    public void onClick(View view) {
        FragmentManager fragmentManager = getFragmentManager();
        fragmentManager.beginTransaction()
                .replace(R.id.content_frame
                        , new paymentFragment())
                .commit();
    }
}
