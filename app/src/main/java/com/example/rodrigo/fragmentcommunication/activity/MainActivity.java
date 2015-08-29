package com.example.rodrigo.fragmentcommunication.activity;

import android.support.v4.app.FragmentManager;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.example.rodrigo.fragmentcommunication.R;
import com.example.rodrigo.fragmentcommunication.fragment.FragmentB;
import com.example.rodrigo.fragmentcommunication.interfaces.Communicator;

public class MainActivity extends FragmentActivity implements Communicator {

    //--------------------------------------------------
    // Activity Life Cycle
    //--------------------------------------------------

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //--------------------------------------------------
    // Callback
    //--------------------------------------------------

    @Override
    public void respond(String data) {
        // From fragments we can call this method with the help of reference of communicate.
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentB fragment = (FragmentB)fragmentManager.findFragmentById(R.id.id_fragment_b);
        fragment.changeText(data);
    }
}