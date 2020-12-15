
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
public class ConversionProgram_8 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a number of meters: ");
        double userMeters = keyboard.nextDouble();
        
        menu();
        System.out.println("Enter your choice");
        int userChoice = keyboard.nextInt();
        if (userChoice == 1) {
            showKilometers(userMeters);
        } if (userChoice == 2) {
            showInches(userMeters);
        } if (userChoice == 3) {
            showFeet(userMeters);
        } if (userChoice ==4) {
            System.out.println("Goodbye!");
        }
        
    }
    
    public static void showKilometers (double userMeters) {
        double kilometers = userMeters * .001;
        System.out.println(kilometers);
    }
    
    public static void showInches(double userMeters) {
        double inches = userMeters * 39.37;
        System.out.println(inches);
    }
    
    public static void showFeet(double userMeters) {
        double feet = userMeters * 3.281;
        System.out.println(feet);
    }
    
    public static void menu() {
        System.out.println("1. Convert to kilometers");
        System.out.println("2. Convert to inches");
        System.out.println("3. Convert to feet");
        System.out.println("4. Exit program");
    }
}
