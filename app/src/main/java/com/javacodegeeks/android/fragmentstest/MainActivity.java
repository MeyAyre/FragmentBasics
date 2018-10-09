package com.javacodegeeks.android.fragmentstest;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        if(savedInstanceState==null){
            getFragmentManager()
                .beginTransaction()
                .add(R.id.fragment_place1,FragmentOne.newInstance(),"fragOne")
                .commit();
        }

        //TODO: Prepare an onClickListener for the button2 to load fragment 1 into its spot
        // HINT: this is much the same as above except fragment2 factory method uses a parameter


        //TODO: Modify your onClick Listener for button2 above to replace fragment1 with fragment2
        // ALSO: put the current fragment onto the backstack
	}

   
}
