package org.christmas.lights.grid;


/**
 * LightController
 *
 */
public class LightController {
 public static void main(String[] args) {

     //create light grid
     ChristmasLightGrid lightGrid = new ChristmasLightGridImpl(5, 5);

     Light[][] grid = lightGrid.getGrid();

    //lightToggler is created
    LightToggler lightToggler=new LightTogglerImpl(grid);
     // Toggle lights on the grid
     lightToggler.toggleLight(1,4,1,4);

     // Switch lights on the grid
     lightGrid.switchOnLight(1, 1);
     

     
     // Switch lights OFF on  the grid
     lightGrid.switchOffLight(1, 1);

     LightOnCounter lightOnCounter=new LightOnCounterImpl(grid) ;
     //get ON lights count
    System.out.println("ON light Count "+lightOnCounter.getLightOnCount());

 }
}