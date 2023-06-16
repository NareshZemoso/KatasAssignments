package org.christmas.lights.grid;

public class ChristmasLight implements Light{
	private boolean isOn;

	/**
	 * Turn on light
	 */
	@Override
	 public void turnOn() {
	     isOn = true;
	 }
	
	/**
	 * turn off light
	 */
	@Override
	 public void turnOff() {
	     isOn = false;
	 }
	
	/**
	 * check the light is on
	 */

	@Override
	public boolean isOn() {
		// status of light 
		return isOn;
	}
}
