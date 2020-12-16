
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
public class KineticEnergy_12 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the mass of the object in kilograms. ");
        double objectMass = keyboard.nextDouble();
        System.out.println("Enter the velocity of the object in meters per second. ");
        double objectVelocity = keyboard.nextDouble();

        kineticEnergy(objectMass, objectVelocity);
    }
    
    public static void kineticEnergy (double objectMass, double objectVelocity){
        double kineticEnergy = .5*objectMass*Math.pow(objectVelocity, 2);
        System.out.println("The kinetic energy of the object is: " + kineticEnergy + " joules.");
    }
}
