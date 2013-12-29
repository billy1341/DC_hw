package com.example.et_tutorial;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class Step2 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_step2);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.step2, menu);
		return true;
	}
	
	public void next(View view) {
		Intent intent = new Intent(this,Step2.class);
		startActivity(intent);
	}
	
	public void show_hints(View view) {
		Intent intent = new Intent(this,ShowHints.class);
		startActivity(intent);
	}
}
