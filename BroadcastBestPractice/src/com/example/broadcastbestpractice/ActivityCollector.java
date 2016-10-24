package com.example.broadcastbestpractice;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;

public class ActivityCollector {
	public static List<Activity> activies=new ArrayList<Activity>();

	public static void addActivity(Activity activity){
		activies.add(activity);
	}
	public static void removeActivity(Activity activity){
		activies.remove(activity);
	}
	public static void finishAll(){
		for(Activity activity2:activies){
			if(!activity2.isFinishing()){
				activity2.finish();
			}
		}
	}
}
