package com.example.et_tutorial;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Introduction extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_introduction);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.introduction, menu);
		return true;
	}

}
