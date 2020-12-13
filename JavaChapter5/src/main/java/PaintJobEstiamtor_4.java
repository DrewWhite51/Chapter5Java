
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

// For every 115 square feet of wall space one gallon of paint is needed and 8 hours of labor
// $18.00 per hour for labor

// Info needed:
// Number of gallons of paint needed x
// Hours of labor required x
// Cost of paint x
// Cost of labor x
// Total cost of the job

// Algorithm Layout
// Ask user for number of rooms, square feet for each room, total square feet
public class PaintJobEstiamtor_4 {
    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter the number of rooms that need to be painted");
        double numberOfRooms = keyboard.nextDouble();
        double totalSquareFeet = 0;
        int counter;
        double laborPerHour = 18.00;

        System.out.println("Enter the cost for paint per gallon: ");
        double costOfPaintPerGallon = keyboard.nextDouble();
        
        // Gets the total square feet for all the rooms
        for (counter = 1; counter <= numberOfRooms; counter++ ) {
            System.out.println("Enter the number of square feet or room " + counter);
            totalSquareFeet += keyboard.nextDouble();}
        
        gallonsNeededAndCost(totalSquareFeet, costOfPaintPerGallon);
        hoursOfLaborNeededAndCost(laborPerHour, totalSquareFeet);
    }

    public static void gallonsNeededAndCost(double totalSquareFeet, double costOfPaintPerGallon){
        double gallonsNeeded = totalSquareFeet/115;
        System.out.println("The gallons of paint needed is: " + gallonsNeeded);
        double costOfPaint = gallonsNeeded * costOfPaintPerGallon;
        System.out.println("The cost of paint is: $ " + costOfPaint);
    }
    
    public static void hoursOfLaborNeededAndCost(double laborPerHour, double totalSquareFeet){
        double laborHoursNeeded = (totalSquareFeet/115) * 8;
        System.out.println("The number of labor hours needed is: " + laborHoursNeeded);
        double laborCost = laborPerHour * laborHoursNeeded;
        System.out.println("The cost of labor is: $ " + laborCost);
    }
    
    public static void costOfPaint(){
        
    }
}
