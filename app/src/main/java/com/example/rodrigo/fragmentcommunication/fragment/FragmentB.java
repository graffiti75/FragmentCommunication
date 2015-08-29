package com.example.rodrigo.fragmentcommunication.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.rodrigo.fragmentcommunication.R;

public class FragmentB extends Fragment {

    //--------------------------------------------------
    // Attributes
    //--------------------------------------------------

    private TextView mTextView;

    //--------------------------------------------------
    // Attributes
    //--------------------------------------------------

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_b, container, false);
        mTextView = (TextView)rootView.findViewById(R.id.id_fragment_b__text_view);

        return rootView;
    }

    //--------------------------------------------------
    // Attributes
    //--------------------------------------------------

    public void changeText(String data) {
        mTextView.setText(data);
    }
}