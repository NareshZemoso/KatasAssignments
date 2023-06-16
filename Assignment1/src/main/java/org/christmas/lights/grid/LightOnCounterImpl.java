package org.christmas.lights.grid;

public class LightOnCounterImpl implements LightOnCounter{

	private Light[][] grid;

	public LightOnCounterImpl(Light[][] grid) {
		this.grid = grid;
	}

	private Integer count=0;

	/**
	 *
	 * @return light count
	 */
	@Override
	public Integer getLightOnCount() {
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				Light light=grid[i][j] ;
				if(light.isOn()){
					count++;
				}
			}
		}
		return count;
	}

	@Override
	public void incrementLightOnCount() {
		count++;
		
	}

	@Override
	public void decrementLightOnCount() {
		count--;
		
	}
	
	
}
