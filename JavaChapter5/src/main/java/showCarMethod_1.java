
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
public class showCarMethod_1 {

    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String userChoice = " ";
        String letter = " ";
        int indexNumber = 0;
        System.out.println("Enter a word and and a number and I will show you the letter at the number you have chosen. ");
        userChoice = keyboard.nextLine();
        
        System.out.println("Enter a number to find the letter at that index. ");
        indexNumber = keyboard.nextInt();
        
        showChar(userChoice, indexNumber);
    
    }
    
    
    public static void showChar(String userChoice, int indexNumber){
        
        char letter = userChoice.charAt(indexNumber);
        System.out.println("The letter at the index number chosen is: " + letter);
    }
    
}
