package com.example.rodrigo.fragmentcommunication.fragment;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.rodrigo.fragmentcommunication.R;
import com.example.rodrigo.fragmentcommunication.interfaces.Communicator;

public class FragmentA extends Fragment implements View.OnClickListener {

    //--------------------------------------------------
    // Attributes
    //--------------------------------------------------

    private Communicator mCommunicator;
    private Integer mCounter = 0;
    private Button mButton;

    //--------------------------------------------------
    // Activity Life Cycle
    //--------------------------------------------------

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_a, container, false);
        mButton = (Button)rootView.findViewById(R.id.id_fragment_a__button);
        mButton.setOnClickListener(this);

        return rootView;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        mCommunicator = (Communicator)getActivity();
    }

    //--------------------------------------------------
    // Listener
    //--------------------------------------------------

    @Override
    public void onClick(View view) {
        mCounter++;
        mCommunicator.respond("The counter was clicked " + mCounter + " times.");
    }
}