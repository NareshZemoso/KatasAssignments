package org.christmas.lights.grid;
/**
 * ChristmasLightGridImpl 
 * @author narec
 *
 */
public class ChristmasLightGridImpl implements ChristmasLightGrid{
	 private Light[][] grid;
	 private LightOnCounter lightCounter;
	/**
	  * create a light grid for given coordinates
	  * @param rows
	  * @param columns
	  */
	 public ChristmasLightGridImpl(int rows, int columns) {
	     grid = new Light[rows][columns];
	     initializeGrid();
	     lightCounter=new LightOnCounterImpl();
	 }
/**
 * initialize the grid 
 */
	 private void initializeGrid() {
	     for (int i = 0; i < grid.length; i++) {
	         for (int j = 0; j < grid[i].length; j++) {
	             grid[i][j] = new ChristmasLight();
	         }
	     }
	 }
	 
	 /**
	  * toggle light for given coordinates
	  * @param row
	  * @param column
	  */

	 public void toggleLight(int row, int column) {
	     if (isValidCoordinate(row, column)) {
	    	 Light light = grid[row][column];
	         if (light != null) {
	             if (light.isOn()) {
	                 light.turnOff();
	                 lightCounter.decrementLightOnCount();
	             } else {
	                 light.turnOn();
	                 lightCounter.incrementLightOnCount();
	             }
	         }
	     }
	 }
	 /**
	  * Switch on light
	  * @param row
	  * @param column
	  */
	 public void switchOnLight(int row, int column) {
	     if (isValidCoordinate(row, column)) {
	    	 Light light = grid[row][column];
	         if (light != null) {
	             if (!light.isOn()) {
	            	 light.turnOn();
	            	 lightCounter.incrementLightOnCount();
	             }
	         }
	     }
	 }
	 
	 /**
	  * Switchoff light
	  * @param row
	  * @param column
	  */
	 public void switchOffLight(int row, int column) {
	     if (isValidCoordinate(row, column)) {
	    	 Light light = grid[row][column];
	         if (light != null) {
	             if (light.isOn()) {
	            	 light.turnOff();
	            	 lightCounter.decrementLightOnCount();
	             }
	         }
	     }
	 }
	 
	 public Integer getLightOnCount() {
			return lightCounter.getLightOnCount();
		}
	
	 /**
	  * check the given coordinate is valid
	  * @param row
	  * @param column
	  * @return
	  */

	 private boolean isValidCoordinate(int row, int column) {
	     return row >= 0 && row < grid.length && column >= 0 && column < grid[row].length;
	 }
	 
	 
	
	
	 
	 
	}
