
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Drew
 */
public class FallingDistance_5 {

    
    public static void main(String[] args) {  
        
        Scanner keyboard = new Scanner(System.in);
        int fallingTime = 10;

        
        fallingDistance(fallingTime);
        
    }
    
    public static void fallingDistance(double fallingTime) {
        int counter = 1;
        double distanceFallen = 1;
        for (counter = 1; counter <= fallingTime; counter++) {
            distanceFallen = .5*9.81*Math.pow(counter, 2);
            System.out.println("The distance fallen so far is: " + distanceFallen + " meters at " + counter + " seconds.");

        }
        
    }
    
}
