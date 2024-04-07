package com.example.mamf;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.google.android.material.button.MaterialButton;

public class Fragment2 extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_2, container, false);
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_2, container, false);


        Button skybtn2 = (Button) view.findViewById(R.id.skybtn2);
        skybtn2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                Intent intent = new Intent(getActivity(), japan.class);
                startActivity(intent);
            }
        });

        Button yellowbtn2 = (Button) view.findViewById(R.id.yellowbtn2);
        yellowbtn2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                Intent intent = new Intent(getActivity(), vie.class);
                startActivity(intent);
            }
        });

        Button mileage = (Button) view.findViewById(R.id.mileage);
        mileage.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                Fragment1 fragment1 = new Fragment1();
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.main_frame,fragment1).commit();
            }
        });


        return view;

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

}