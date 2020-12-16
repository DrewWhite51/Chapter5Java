
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
public class PresentValue_16 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double futureValue;
        double numberOfYears;
        double annualInterestRate;
        System.out.println("Enter the amount of money you wish to have in your account in the future. ");
        futureValue = keyboard.nextDouble();
        System.out.println("Enter the number of years that money will be accumulating. ");
        numberOfYears = keyboard.nextDouble();
        System.out.println("Enter the annual interest rate of the account. ");
        annualInterestRate = keyboard.nextDouble();
        
        presentValue(futureValue, annualInterestRate, numberOfYears);
        
    }
    
    public static void presentValue(double futureValue, double annualInterestRate, double numberOfYears){
        double presentValue = (futureValue)/(Math.pow(1+annualInterestRate, numberOfYears));
        System.out.println("If you want " + futureValue + " in your account in " + numberOfYears + " years with an annual ineterst rate of " + annualInterestRate + "% then you will have to deposit " + presentValue + " in your account today.");
    }
}
