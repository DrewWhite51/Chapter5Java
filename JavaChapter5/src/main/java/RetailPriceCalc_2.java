
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
public class RetailPriceCalc_2 {
    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        

        System.out.println("Enter the wholesale cost: ");
        double wholeSaleCost = keyboard.nextDouble();
        System.out.println("Enter the markup percentage: ");
        double markupPercent = keyboard.nextDouble();
        
        calcRetail(wholeSaleCost, markupPercent);
    }
    
    public static void calcRetail(double wholeSaleCost, double markupPercent){
        
        double retailPrice = (wholeSaleCost * markupPercent) + wholeSaleCost;
        System.out.println("The retail price for the item is: $ " + retailPrice);
    }
}
