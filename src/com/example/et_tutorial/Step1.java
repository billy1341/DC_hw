package com.example.et_tutorial;

import android.os.Bundle;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class Step1 extends MyMenuActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_step1);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		super.onCreateOptionsMenu(menu);
		return true;
	}
	
	@Override
    public boolean onOptionsItemSelected(MenuItem item) {
    	super.onOptionsItemSelected(item);
    	
    	finish();
        Intent intent = new Intent(this, Step1.class);
        startActivity(intent);
    	return true;
    }
	
	public void next(View view) {
		Intent intent = new Intent(this,Step2.class);
		startActivity(intent);
	}

}
