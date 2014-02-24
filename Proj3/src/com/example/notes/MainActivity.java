package com.example.notes;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AutoCompleteTextView;

public class MainActivity extends Activity {

	private AutoCompleteTextView autoCompleteEntered;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		//passing data from one screen to another
		//from week 5 GPS listener
		/*1.get access to autocomplete text
		 * 2.put cursur on the method findViwebid
		 * 3.change View above to AutoCompleteText
		 * 4.ctrl-shift -o organize imports
		 * 5.Note that the field above, as well as the left
		 * side of the statement below is the same as the item ID in the layout
		 * 6.If get red squiggly on the right put cursor on the item
		 * and hit add cast.
		 * 7. so now, autoCompleteEntered represents the data entered 
		 * nto the autocomplete field on the layout screen
		 contined...
		 */

		autoCompleteEntered = (AutoCompleteTextView) findViewById(R.id.autoCompleteEntered);

	}
	/*
	 * I named the method below so to follow along better
	 */
	public void searchForPlants(View v) {
		/* Now to get data back out
		 * 1.Create the new layout and activity
		 * 2.put in the intent to associate the method with the page
		 * 3.put in the startActivity
		 * 4.on line 38... need to add a variable
		 * 5.put cursor on toString and hit
		 * ctrl  1
		 * "assign to local variable"
		 * */
		
		Intent pageResultIntent= new Intent (this, ResultPageActivity.class);
		
		//get the data the that was entered
		String searchPlantName = autoCompleteEntered.getText().toString();
		//pass that data to the next activity
		//pass the string and an identifier
		// the item in quotes "PAGE_RESULT" is the unique identifier for this
		//
		pageResultIntent.putExtra("PAGE_RESULT", searchPlantName);
		
		startActivity(pageResultIntent);

	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
