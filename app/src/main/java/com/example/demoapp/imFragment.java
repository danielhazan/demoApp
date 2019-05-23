package com.example.demoapp;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.

 */
public class imFragment extends Fragment {
    public imFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_im, container, false);


    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        // do here stuff...


//        TextView textView = view.findViewById(R.id.message);
//        TextView textView2 = view.findViewById(R.id.message2);
//        Button button = view.findViewById(R.id.button);
//        button.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.imFragment, null));
//        textView.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.editFragment,null));
////        TextView tv = view.findViewById(R.id.message2);
//        textView2.setText(getArguments().getString("amount"));



    }

}