package org.christmas.lights.grid;

public class LightOnCounterImpl implements LightOnCounter{

	private Integer count=0;

	@Override
	public Integer getLightOnCount() {
		
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
