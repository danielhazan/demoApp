package com.example.demoapp;

import android.os.Bundle;
import androidx.fragment.app.Fragment;

import android.renderscript.ScriptGroup;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import org.w3c.dom.Text;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.Transformations;
import androidx.navigation.Navigation;


/**
 * A simple {@link Fragment} subclass.

 */
public class editFragment extends Fragment {
    MutableLiveData mutableLiveData ;


    public editFragment() {
        this.mutableLiveData = new MutableLiveData<String>();

        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_edit, container, false);

//        LayoutInflater binding = DataBindingUtil.inflate(
//                inflater, R.layout.martian_data, container, false);
//        View view = binding.getRoot();
//        //here data must be an instance of the class MarsDataProvider
//        binding.setMarsdata(data);
//        return view;


    }

    public MutableLiveData<String> getCurrentInput(final EditText editText) {
//        EditText editText = view.findViewById(R.id.edit_text);
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String text = String.valueOf(s);

                mutableLiveData.setValue(text);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
//        String text = String.valueOf(editText.getText());
//
//        mutableLiveData.setValue(text);
        return mutableLiveData;

    }


    @Override
    public void onViewCreated(@NonNull final View view, @Nullable Bundle savedInstanceState) {
        // do here stuff...



        EditText editText = view.findViewById(R.id.edit_text);
        getCurrentInput(editText).observe(this, new Observer<String>() {


            @Override
            public void onChanged(@Nullable String text) {
                if (text.matches("[0-9]+") && text.length() == 5){
                    Bundle bundle = new Bundle();
                    String amount = text;
                    bundle.putString("amount", amount);
                    Navigation.findNavController(view).navigate(R.id.blankFragment, bundle);
                }

            }
        });


    }

}
