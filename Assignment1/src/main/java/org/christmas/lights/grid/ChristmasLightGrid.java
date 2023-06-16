package org.christmas.lights.grid;

public interface ChristmasLightGrid {

	
	void switchOnLight(int row, int column);
	void switchOffLight(int row, int column);
	void toggleLight(int row, int column);
	Integer getLightOnCount();
}
