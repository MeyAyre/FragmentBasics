package com.javacodegeeks.android.fragmentstest;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class FragmentTwo extends Fragment {
   private static final String ARG_PARAM1 = "param1";

   private String mParam1;
   /**
    * Use this factory method to create a new instance of
    * this fragment using the provided parameters.
    *
    * @param param1 Parameter 1.
    * @return A new instance of fragment SimpleFragment.
    */
   public static FragmentTwo newInstance(String param1) {
      FragmentTwo fragment = new FragmentTwo();
      Bundle args = new Bundle();
      args.putString(ARG_PARAM1, param1);
      fragment.setArguments(args);
      return fragment;
   }
   // Required empty public constructor
   public FragmentTwo() {}

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
        }
    }

   @Override
   public View onCreateView(LayoutInflater inflater,
      ViewGroup container, Bundle savedInstanceState) {
      /**
       * Inflate the layout for this fragment
       */
      return inflater.inflate(
      R.layout.fragment_two, container, false);
   }
}
