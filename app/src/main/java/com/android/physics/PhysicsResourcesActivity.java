package com.android.physics;

import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class PhysicsResourcesActivity extends Activity 
{
	// Fields
	public final static String CONTENT_NAME = "nothing";

	/**
     * Overrides the super class' onCreate method. First calls the super 
     * class' on create method then sets its part of the UI.
	 * @param Bundle the instance state.
	 */
	public void onCreate(Bundle savedInstanceState)
	{
		// Call the super on create method
		super.onCreate(savedInstanceState);
			
		// This is a simple UI used in the interim
        setContentView(R.layout.resources_list);
	}
	
	/**
	 * Displays the content for SI units.
	 * @param v
	 */
	public void showSI(View v)
	{
		Intent intent = new Intent(this, DisplayContentActivity.class);
		String message = "resources si";
		intent.putExtra(CONTENT_NAME, message);
		startActivity(intent);
	}
	
	/**
	 * Displays the content for prefixes.
	 * @param v
	 */
	public void showPrefixes(View v)
	{
		Intent intent = new Intent(this, DisplayContentActivity.class);
		String message = "resources prefix";
		intent.putExtra(CONTENT_NAME, message);
		startActivity(intent);
	}
	
	/**
	 * Displays the content for basic conversions.
	 * @param v
	 */
	public void showConversions(View v)
	{
		Intent intent = new Intent(this, DisplayContentActivity.class);
		String message = "resources conversions";
		intent.putExtra(CONTENT_NAME, message);
		startActivity(intent);
	}
	
	/**
	 * Displays the content for important constants.
	 * @param v
	 */
	public void showConstants(View v)
	{
		Intent intent = new Intent(this, DisplayContentActivity.class);
		String message = "resources constants";
		intent.putExtra(CONTENT_NAME, message);
		startActivity(intent);
	}
	
	/**
	 * Displays the content for astronomical data.
	 * @param v
	 */
	public void showAstronomy(View v)
	{
		Intent intent = new Intent(this, DisplayContentActivity.class);
		String message = "resources astronomy";
		intent.putExtra(CONTENT_NAME, message);
		startActivity(intent);
	}
	
	/**
	 * Starts the calculator.
	 * @param v
	 */
	public void showCalculator(View v)
	{
		Intent intent = new Intent();
		intent.setClassName("com.android.calculator2", "com.android.calculator2.Calculator");
		PackageManager packagemanager = getPackageManager();
		List<ResolveInfo> activities = packagemanager.queryIntentActivities(intent, 0);
		boolean goodIntent = activities.size() > 0;
		if (goodIntent)
		{
			startActivity(intent);
		}
	}
	
	/**
	 * Displays the content for about this app.
	 * @param v
	 */
	public void showAbout(View v)
	{
		Intent intent = new Intent(this, DisplayContentActivity.class);
		String message = "resources about";
		intent.putExtra(CONTENT_NAME, message);
		startActivity(intent);
	}
	
	/*
	 * Not used for now.
	public void showKhanVideo(View v)
	{
		Uri youtubeVideo = Uri.parse("http://www.youtube.com/watch?feature=player_embedded&v=ihNZlp7iUHE");
		Intent intent = new Intent(Intent.ACTION_VIEW, youtubeVideo);
		PackageManager packagemanager = getPackageManager();
		List<ResolveInfo> activities = packagemanager.queryIntentActivities(intent, 0);
		boolean goodIntent = activities.size() > 0;
		if (goodIntent)
		{
			startActivity(intent);
		}
	}
	*/
		
}
	

