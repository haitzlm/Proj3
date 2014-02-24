package com.example.notes;

import android.app.Activity;
import android.os.Bundle;

public class ResultPageActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.resultpage);
		//here we get the unique identifier from the previous
		//page
		//then save to local variable
		//put cursor on get stringExtra
		// ctrl 1
		//new variable
		String enteredTerm = getIntent().getStringExtra("PAGE_RESULT");
		//
	}
	
	public ResultPageActivity() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
