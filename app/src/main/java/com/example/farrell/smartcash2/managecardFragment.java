package com.example.farrell.smartcash2;

import android.app.FragmentManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class managecardFragment extends accountFragment{

    View myView;
    private ImageView img;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.managecard_layout, container, false);
        img = (ImageView)myView.findViewById(R.id.shoppingcard);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.content_frame
                                , new shoppingcardFragment())
                        .commit();
            }
        });
        return myView;
    }


}
