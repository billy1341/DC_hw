package com.example.et_tutorial;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ShowHints extends Activity {
	
	private String[] myStringArray;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_show_hints);
		
		Resources res = getResources();
		myStringArray = res.getStringArray(R.array.hints);
		
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.show_hints_list_item, myStringArray);
		ListView listView = (ListView) findViewById(R.id.listView1);
		listView.setAdapter(adapter);
		listView.setOnItemClickListener(mMessageClickedHandler);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.show_hints, menu);
		return true;
	}
	
	// Create a message handling object as an anonymous class.
	private OnItemClickListener mMessageClickedHandler = new OnItemClickListener() {
	    public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
	    	switch((int)id){
	    	case 0:
	    		ShowAlertDialog("-2 year\n-$16\n-20 life");
	    		break;
	    	case 1:
	    		ShowAlertDialog("-4 year\n+$144\n-40 life");
	    		break;
	    	case 2:
	    		ShowAlertDialog("-1 year\n-$10\n+25 life");
	    		break;
	    	case 3:
	    		ShowAlertDialog("-4 year\n+$120\n-45 life");
	    		break;
	    	default:
	    		finish();
	    		break;
	    	}
	    	
	    }
	};
	
	private void ShowAlertDialog(String str)
	{
		AlertDialog.Builder myAlertDialog = new AlertDialog.Builder(this);
		myAlertDialog.setTitle("");
		myAlertDialog.setMessage(str);
		myAlertDialog.setNeutralButton(R.string.ok,new DialogInterface.OnClickListener() {
	           public void onClick(DialogInterface dialog, int id) {
	               // User clicked OK button
	           }
		});
		myAlertDialog.show();
	}
}
