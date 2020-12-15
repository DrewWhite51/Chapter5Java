
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
public class DistanceTraveled_9 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double vehicleSpeed;
        double hoursDriven;
        System.out.println("Enter the speed:");
        vehicleSpeed = keyboard.nextDouble();
       System.out.println("Enter the hours driven");
       hoursDriven = keyboard.nextDouble();
       distance(vehicleSpeed, hoursDriven);
     
       
    }
    
    public static void distance(double vehicleSpeed, double hoursDriven){
        Scanner keyboard = new Scanner(System.in);

       while (vehicleSpeed < 0) {
           System.out.println("Enter the speed:");
           vehicleSpeed = keyboard.nextDouble();
       }
       
       while (hoursDriven < 1 ) {
           System.out.println("Enter the hours driven:");
           hoursDriven = keyboard.nextDouble();
       }
       System.out.println("Hours" + "                    Distance Traveled");
       System.out.println("------------------------------------------------");
       int hr = 1;
       while (hoursDriven >= 1) {
           System.out.println(" " + hr + "                           " + hr * vehicleSpeed + " miles");
           hr++;
           hoursDriven--;
       }
    }
}
