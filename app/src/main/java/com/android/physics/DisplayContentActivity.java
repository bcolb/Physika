/*
 * DisplayContentActivity.java
 */
package com.android.physics;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Sets the screens content view to a set of equations or other content 
 * as needed by the Physics app.
 * @author Thor
 * @version 1.0
 */
public class DisplayContentActivity extends Activity 
{
	/**
	 * Calls the super onCreate method and sets the content view.
	 */
	public void onCreate(Bundle savedInstanceState)
	{
		// Call to the super's onCreate method
		super.onCreate(savedInstanceState);
		
		// Get the intent
		Intent intent = getIntent();
		String message = intent.getStringExtra(PhysicsFormulasActivity.CONTENT_NAME);
		String[] checkMessage = message.split(" ");
		String sendMessage = checkMessage[1];
		if (checkMessage[0].equals("formulas"))
		{
			setFormulaContent(sendMessage);
		}
		else
		{
			setResourceContent(sendMessage);
		}
	}
	
	/**
	 * Checks a series of items and finds the correct one to display.
	 * @param message
	 */
	public void setFormulaContent(String message)
	{
		if (message.equals("newtons"))
		{
			setContentView(R.layout.newtonslaws);
		}
		else if (message.equals("circular"))
		{
			setContentView(R.layout.circularmotion);
		}
		else if (message.equals("kinematics"))
		{
            setContentView(R.layout.kinematics);
		}
		else if (message.equals("momentum"))
		{
			setContentView(R.layout.impulse_momentum);
		}
		else if (message.equals("energy"))
		{
			setContentView(R.layout.energy);
		}
		else if (message.equals("energy2"))
		{
			setContentView(R.layout.energy2);
		}
		else if (message.equals("rotational"))
		{
			setContentView(R.layout.rotational_motion);
		}
		else if (message.equals("gravity"))
		{
			setContentView(R.layout.gravity);
		}
		else if (message.equals("oscillation"))
		{
			setContentView(R.layout.oscillation);
		}
		else if (message.equals("idealgas"))
		{
			setContentView(R.layout.ideal_gas);
		}
		else if (message.equals("thermodynamics"))
		{
			setContentView(R.layout.thermodynamics);
		}
		else if (message.equals("electriccharges"))
		{
			setContentView(R.layout.electric_charges);
		}
		else if (message.equals("gausslaw"))
		{
			setContentView(R.layout.gausslaw);
		}
		else if (message.equals("electricpotential"))
		{
			setContentView(R.layout.electricpotential);
		}
		else if (message.equals("potentialfield"))
		{
			setContentView(R.layout.electric_potential_field);
		}
		else if (message.equals("fundamentalcircuits"))
		{
			setContentView(R.layout.fundamentalcircuits);
		}
		else if (message.equals("magnetism"))
		{
			setContentView(R.layout.magnetism);
		}
		else if (message.equals("specialrelativity"))
		{
			setContentView(R.layout.special_relativity);
		}
		else
		{
			printContentNotAvailable();
		}
	}

	/**
	 * Checks a series of items and finds the correct one to display.
	 * @param message
	 */
	public void setResourceContent(String message)
	{
		if (message.equals("si"))
		{
			setContentView(R.layout.si_units);
		}
		else if (message.equals("prefix"))
		{
			setContentView(R.layout.prefixes);
		}
		else if (message.equals("conversions"))
		{
			setContentView(R.layout.unit_conversions);
		}
		else if (message.equals("constants"))
		{
			setContentView(R.layout.constants);
		}
		else if (message.equals("astronomy"))
		{
			setContentView(R.layout.astronomical_data);
		}
		else if (message.equals("about"))
		{
			setContentView(R.layout.about);
		}
		else
		{
			printContentNotAvailable();
		}
	}
	
	public void printContentNotAvailable()
	{
		TextView tv = new TextView(this);
		tv.setText("Content Not Available");
		setContentView(tv);
	}
}
