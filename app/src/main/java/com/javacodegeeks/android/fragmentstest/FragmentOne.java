package com.javacodegeeks.android.fragmentstest;

import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentOne extends Fragment {

    public FragmentOne(){} //Empty constructor

    //Factory Instance Method
    public static FragmentOne newInstance(){
        FragmentOne myFragment =  new FragmentOne();

        return myFragment;
    }


   @Override
   public View onCreateView(LayoutInflater inflater,
      ViewGroup container, Bundle savedInstanceState) {
      
       //Inflate the layout for this fragment
       
      return inflater.inflate(
    		  R.layout.fragment_one, container, false);
   }
}
