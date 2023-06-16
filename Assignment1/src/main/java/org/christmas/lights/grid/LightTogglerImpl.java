package org.christmas.lights.grid;

public class LightTogglerImpl implements LightToggler{

    private Light[][] grid;

    public LightTogglerImpl(Light[][] grid) {
        this.grid = grid;
    }

    /**
     * toggleLight toggles the lights
     * @param rowStart
     * @param rowEnd
     * @param columnStart
     * @param columnEnd
     */
    @Override
    public void toggleLight(int rowStart, int rowEnd, int columnStart, int columnEnd) {

        for(int i=rowStart;i < rowEnd;i++){
            for (int j=columnStart;j<columnEnd;j++){
               Light light= grid[i][j];
               if(light.isOn()){
                   light.turnOff();
               }else {
                   light.turnOn();
               }
            }
        }
    }
}
