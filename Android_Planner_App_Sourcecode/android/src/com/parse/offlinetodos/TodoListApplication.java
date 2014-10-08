package com.parse.offlinetodos;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseACL;
import com.parse.ParseObject;
import com.parse.ParseUser;

public class TodoListApplication extends Application {
	
	public static final String TODO_GROUP_NAME = "ALL_TODOS";
	
	@Override
	public void onCreate() {
		super.onCreate();
		
		
		ParseObject.registerSubclass(Todo.class);
		
		
		Parse.enableLocalDatastore(getApplicationContext());
		Parse.initialize(this, "npjxb6bLngT2ev4frL7U3BQUMseeQCgad3V6sm2r", "xpDZgnWjQh0PxqewXH1C8lrKXCTz46WbpbTi4WrJ");
		ParseUser.enableAutomaticUser();
		ParseACL defaultACL = new ParseACL();
		ParseACL.setDefaultACL(defaultACL, true);	
	}
	
	

}
