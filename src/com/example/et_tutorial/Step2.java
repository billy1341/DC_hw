package com.example.et_tutorial;

import android.os.Bundle;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class Step2 extends MyMenuActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_step2);
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
        Intent intent = new Intent(this, Step2.class);
        startActivity(intent);
    	return true;
    }
	
	public void restart(View view) {
		Intent intent = new Intent(getApplicationContext(), MainActivity.class);
		intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
		startActivity(intent);
	}
	
	public void show_hints(View view) {
		Intent intent = new Intent(this,ShowHints.class);
		startActivity(intent);
	}
}
