package com.example.farrell.smartcash2;

import android.app.FragmentManager;
import android.net.sip.SipSession;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by farrellmochammad on 4/18/18.
 */

public class shoppingcardFragment extends managecardFragment {
    View myView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.shoppingcard_layout, container, false);
        return myView;
    }

    @Override
    public void onClick(View view) {
        super.onClick(view);
    }


}
