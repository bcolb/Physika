/**
 * The main activity for the Physics Agora android application.
 * 
 * @author VonNeumann
 * @version 1.0
 */
package com.android.physics;

import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TabHost;

/**
 * Serves as the root for the node layout, contains both a TabWidget
 * and FrameLayout. Is the TabHost.
 */
public class PhysicsActivity extends TabActivity 
{

	/**
	 * Calls the super class onCreate method and sets up the necessary
	 * tabs for the tab layout.
	 */
    @Override
    public void onCreate(Bundle savedInstanceState) 
    {
    	// Calling the super class' onCreate method and passing it savedInstanceState
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        // Getting the required resources
        Resources res = getResources();
        TabHost tabHost = getTabHost();
        
        // Creating an intent to be used in launching the Formulas tab
        Intent formulasIntent = new Intent().setClass(this, PhysicsFormulasActivity.class);
        TabHost.TabSpec formulasSpec = tabHost.newTabSpec("formulas");
        formulasSpec.setIndicator("Formulas", res.getDrawable(R.drawable.ic_tab_formulas));
        formulasSpec.setContent(formulasIntent);
        tabHost.addTab(formulasSpec);
        
        // Creating an intent to be used in launching the Resources tab
        Intent resourcesIntent = new Intent().setClass(this, PhysicsResourcesActivity.class);
        TabHost.TabSpec resourcesSpec = tabHost.newTabSpec("resources");
        resourcesSpec.setIndicator("Resources", res.getDrawable(R.drawable.ic_tab_resources));
        resourcesSpec.setContent(resourcesIntent);
        tabHost.addTab(resourcesSpec);
        
        // Set the current tab
        tabHost.setCurrentTab(2);
	}
    

}