package com.i017114.primerparcial_i017114;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * Created by reyes on 03/09/2017.
 */

public class FormFragment extends Fragment {


    private int contentView;



    public FormFragment() {

        // Required empty public constructor

    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {



        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.formfragment, container, false);


    }




    public void setContentView(int contentView) {
        this.contentView = contentView;


    }



}