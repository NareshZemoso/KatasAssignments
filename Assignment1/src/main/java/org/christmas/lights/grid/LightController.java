package org.christmas.lights.grid;


/**
 * LightController
 *
 */
public class LightController {
 public static void main(String[] args) {
     ChristmasLightGrid lightGrid = new ChristmasLightGridImpl(5, 5);

     // Switch lights on the grid
     lightGrid.switchOnLight(1, 1);
     
     // Toggle lights on the grid
     lightGrid.toggleLight(2, 3);
     lightGrid.toggleLight(4, 1);
     lightGrid.toggleLight(4, 3);
     
     // Switch lights OFF on  the grid
     lightGrid.switchOffLight(1, 1);
    

    System.out.println("ON light Count "+lightGrid.getLightOnCount()); 

 }
}