
import java.util.Random;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DrewS
 */
public class ESPGame_18 {
    public static void main(String[] args) {
        startMenu();
        runGame();
    }
    
    public static void startMenu(){
        System.out.println("Welcome to the ESP game!");
        System.out.println("You will be guessing the color I have chosen ten times, you performance will be evaluated at the end.");
        System.out.println("The colors available to be chosen are Red, Green, Blue, Orange and Yellow.");
    }
    
 
    public static void runGame(){
        int numberOfRounds = 11;
        int i;
        int numberOfWins = 0;
        int numberOfLosses = 0;
        
        for (i=1; i<numberOfRounds; i++)  {
            Random randomGenerator = new Random();
            Scanner keyboard = new Scanner(System.in);
            String computerColorChoice = "";
            int rand = randomGenerator.nextInt(5) + 1;


            // Algorithim for computer selecting color
            switch (rand) {
                case 1:
                    computerColorChoice = "Red";
                    break;
                case 2:
                    computerColorChoice = "Green";
                    break;
                case 3: 
                    computerColorChoice = "Blue";
                    break;
                case 4:
                    computerColorChoice = "Orange";
                    break;
                case 5:
                    computerColorChoice = "Yellow";
                    break;
                default:
                    break;
            }
            String strippedCompColor = computerColorChoice.toLowerCase().trim();
            System.out.println("Now pick what color you think I chose!");
            String userInput = keyboard.nextLine().toLowerCase().trim();

            if ("red".equals(userInput) && "red".equals(strippedCompColor)){
                System.out.println("You have chosen correctly!");
                numberOfWins ++;
            } else if ("green".equals(userInput.toLowerCase().trim()) && "green".equals(strippedCompColor)) {
                System.out.println("You have chosen correctly!");
                numberOfWins ++;
            } else if ("blue".equals(userInput) && "blue".equals(strippedCompColor)) {
                System.out.println("You have chosen correctly!");
                numberOfWins ++;
            } else if ("orange".equals(userInput) && "orange".equals(strippedCompColor)){
                System.out.println("You have chosen correctly!");
                numberOfWins ++;
            } else if ("yellow".equals(userInput) && "yellow".equals(strippedCompColor)){
                System.out.println("You have chosen correctly!");
                numberOfWins ++;
            } else {
                System.out.println("This is incorrect");
                numberOfLosses ++;
            }
            }
        System.out.println("The total number of wins you had is: " + numberOfWins);
        System.out.println("The total number of losses you had is: " + numberOfLosses);
        if (numberOfWins > numberOfLosses) {
            System.out.println("You are pretty gooda at this!");
        } else {
            System.out.println("You are not really that great at this...");
        }
        System.out.println("Thank you for playing!");
}
}