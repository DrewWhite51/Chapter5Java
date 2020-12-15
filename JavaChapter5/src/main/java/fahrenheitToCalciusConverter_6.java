
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
public class fahrenheitToCalciusConverter_6 {
    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the temperature you wish to convert to Celsisus: ");
        double userFInput = keyboard.nextDouble();
        double degreesFahrenheit = 20;
        
        fToC(userFInput);
        fToCConversions(degreesFahrenheit);
    }
    
    public static void fToC(double userFInput) {
        double toCelsius;
        toCelsius = ((userFInput - 32)*5)/9;
        System.out.println(userFInput + " to conerted to Celsius is: " + toCelsius);
    }
    
    public static void fToCConversions (double degreesFahrenheit) {
        double counter;
        double toCelsius;
        for (counter = 0; counter <= degreesFahrenheit; counter++) {
            toCelsius = ((counter - 32)*5)/9;
            System.out.println("At " + counter + " degrees fahrenheit, it is " + toCelsius + " degrees celsius.");
        }
    }
}
