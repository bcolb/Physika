/**
 * PhysicsFormulasActivity.java
 */
package com.android.physics;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * A very basic class used as part of the TabLayout in the 
 * Android Physics app.
 * @author Thor
 *
 */
public class PhysicsFormulasActivity extends Activity 
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
		
        // Displays the formulas list - a tableLayout filled with buttons
		setContentView(R.layout.formulas_list);
	}
	
	/**
	 * Set for the kinematics button, when pressed this method displays the 
	 * Kinematics content.
	 * @param v
	 */
	public void showKinematics(View v)
	{
		Intent intent = new Intent(this, DisplayContentActivity.class);
		String message = "formulas kinematics";
		intent.putExtra(CONTENT_NAME, message);
		startActivity(intent);
	}
	
	/**
	 * Set for the circular motion button, when pressed this method displays the 
	 * circular motion content.
	 * @param v
	 */
	public void showCircular(View v)
	{
		Intent intent = new Intent(this, DisplayContentActivity.class);
		String message = "formulas circular";
		intent.putExtra(CONTENT_NAME, message);
		startActivity(intent);
	}
	
	/**
	 * Set for the newton's laws button, when pressed this method displays 
	 * the Newton's Laws content.
	 * @param v
	 */
	public void showNewtons(View v)
	{
		Intent intent = new Intent(this, DisplayContentActivity.class);
		String message = "formulas newtons";
		intent.putExtra(CONTENT_NAME, message);
		startActivity(intent);
	}
	
	/**
	 * Set for the momentum button, when pressed this method displays 
	 * the momentum content.
	 * @param v
	 */
	public void showMomentum(View v)
	{
		Intent intent = new Intent(this, DisplayContentActivity.class);
		String message = "formulas momentum";
		intent.putExtra(CONTENT_NAME, message);
		startActivity(intent);
	}
	
	/**
	 * Called when the Energy button is pressed, displays the content 
	 * for energy.
	 * @param v
	 */
	public void showEnergy(View v)
	{
		Intent intent = new Intent(this, DisplayContentActivity.class);
		String message = "formulas energy";
		intent.putExtra(CONTENT_NAME, message);
		startActivity(intent);
	}
	
	/**
	 * Displays the work and enery content by starting a new DisplayContentActivity.
	 * @param v
	 */
	public void showEnergy2(View v)
	{
		Intent intent = new Intent(this, DisplayContentActivity.class);
		String message = "formulas energy2";
		intent.putExtra(CONTENT_NAME, message);
		startActivity(intent);
	}
	
	/**
	 * Displays the rotational motion content by starting a DisplayContentActivity.
	 * @param v
	 */
	public void showRotational(View v)
	{
		Intent intent = new Intent(this, DisplayContentActivity.class);
		String message = "formulas rotational";
		intent.putExtra(CONTENT_NAME, message);
		startActivity(intent);
	}
	
	/**
	 * Displays the content for the theory of gravity by starting a DisplayContentActivity.
	 * @param v
	 */
	public void showGravity(View v)
	{
		Intent intent = new Intent(this, DisplayContentActivity.class);
		String message = "formulas gravity";
		intent.putExtra(CONTENT_NAME, message);
		startActivity(intent);
	}
	
	/**
	 * Displays the content on oscillatory motion.
	 * @param v
	 */
	public void showOscillation(View v)
	{
		Intent intent = new Intent(this, DisplayContentActivity.class);
		String message = "formulas oscillation";
		intent.putExtra(CONTENT_NAME, message);
		startActivity(intent);
	}
	
	/**
	 * Displays the content for the ideal gas law.
	 * @param v
	 */
	public void showIdealGas(View v)
	{
		Intent intent = new Intent(this, DisplayContentActivity.class);
		String message = "formulas idealgas";
		intent.putExtra(CONTENT_NAME, message);
		startActivity(intent);
	}
	
	/**
	 * Displays the content for thermodynamics.
	 * @param v
	 */
	public void showThermodynamics(View v)
	{
		Intent intent = new Intent(this, DisplayContentActivity.class);
		String message = "formulas thermodynamics";
		intent.putExtra(CONTENT_NAME, message);
		startActivity(intent);
	}
	
	/**
	 * Displays the content for electric charges and force.
	 * @param v
	 */
	public void showElectricCharges(View v)
	{
		Intent intent = new Intent(this, DisplayContentActivity.class);
		String message = "formulas electriccharges";
		intent.putExtra(CONTENT_NAME, message);
		startActivity(intent);
	}
	
	/**
	 * Displays the content for Gauss' law.
	 * @param v
	 */
	public void showGaussLaw(View v)
	{
		Intent intent = new Intent(this, DisplayContentActivity.class);
		String message = "formulas gausslaw";
		intent.putExtra(CONTENT_NAME, message);
		startActivity(intent);
	}
	
	/**
	 * Displays the content for electric potential.
	 * @param v
	 */
	public void showElectricPotential(View v)
	{
		Intent intent = new Intent(this, DisplayContentActivity.class);
		String message = "formulas electricpotential";
		intent.putExtra(CONTENT_NAME, message);
		startActivity(intent);
	}
	
	/**
	 * Displays the content for potential and field.
	 * @param v
	 */
	public void showPotentialField(View v)
	{
		Intent intent = new Intent(this, DisplayContentActivity.class);
		String message = "formulas potentialfield";
		intent.putExtra(CONTENT_NAME, message);
		startActivity(intent);
	}
	
	/**
	 * Displays the content for fundamental circuits.
	 * @param v
	 */
	public void showFundamentalCircuits(View v)
	{
		Intent intent = new Intent(this, DisplayContentActivity.class);
		String message = "formulas fundamentalcircuits";
		intent.putExtra(CONTENT_NAME, message);
		startActivity(intent);
	}
	
	/**
	 * Displays the content for magnetism.
	 * @param v
	 */
	public void showMagnetism(View v)
	{
		Intent intent = new Intent(this, DisplayContentActivity.class);
		String message = "formulas magnetism";
		intent.putExtra(CONTENT_NAME, message);
		startActivity(intent);
	}
	
	/**
	 * Displays the content for special relativity.
	 * @param v
	 */
	public void showSpecialRelativity(View v)
	{
		Intent intent = new Intent(this, DisplayContentActivity.class);
		String message = "formulas specialrelativity";
		intent.putExtra(CONTENT_NAME, message);
		startActivity(intent);
	}
}
