package org.christmas.lights.grid;
/**
 * ChristmasLightGridImpl 
 * @author narec
 *
 */
public class ChristmasLightGridImpl implements ChristmasLightGrid{
	 private Light[][] grid;
	/**
	  * create a light grid for given coordinates
	  * @param rows
	  * @param columns
	  */
	 public ChristmasLightGridImpl(int rows, int columns) {
	     grid = new Light[rows][columns];
	     initializeGrid();

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

	             }
	         }
	     }
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


	public Light[][] getGrid() {
		return grid;
	}
}
