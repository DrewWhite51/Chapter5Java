
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
public class StockProfit_10 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the number of shares: ");
        double numberOfShares = keyboard.nextDouble();
        System.out.println("Enter the purchase price per share: ");
        double purchasePricePerShare = keyboard.nextDouble();
        System.out.println("Enter the sale price per share: ");
        double salePricePerShare = keyboard.nextDouble();
        System.out.println("Enter the purchase commission paid: ");
        double purchaseCommission = keyboard.nextDouble();
        System.out.println("Enter the sale commission paid: ");
        double salesComission = keyboard.nextDouble();

        
        profitCalc(numberOfShares, purchasePricePerShare, purchaseCommission, salesComission, salePricePerShare);
        
    }
    
    public static void profitCalc(double numberOfShares, double purchasePricePerShare, double purchaseCommission, double salesCommission, double salePricePerShare){
        double profit = (((numberOfShares * salePricePerShare)-salesCommission)-((numberOfShares * purchasePricePerShare)+purchaseCommission));
        if (profit > 0){
            System.out.println("The profit is: " + Math.abs(profit));
        } if (profit < 0) {
            System.out.println("The loss was " + Math.abs(profit));
        }
    }
}
