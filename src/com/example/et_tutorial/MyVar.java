package com.example.et_tutorial;

import java.util.Locale;
import android.app.Application;

public class MyVar extends Application {
	public Locale locale;
	
	public MyVar(){
		locale = Locale.getDefault();
	}
}
