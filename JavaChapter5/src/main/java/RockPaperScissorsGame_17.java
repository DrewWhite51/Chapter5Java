
import java.util.Random;
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
public class RockPaperScissorsGame_17 {
    
    public static void main(String[] args) {
        
         
        startMenu();
        runGame();
    
    }
    
    public static void startMenu(){
        System.out.println("Welvome to my rock, paper, scissors game!");
        System.out.println("To choose rock type 1");
        System.out.println("To enter paper type 2");
        System.out.println("To enter scissors type 3");
    }
    
    public static void runGame(){
        Scanner keyboard = new Scanner(System.in);
        Random randomGenerator = new Random();
        String computerChoice = "";
        int playerChoiceNumber;
        String playerChoice = "";
        
        System.out.println("What is your choice?");
        playerChoiceNumber = keyboard.nextInt();
        switch (playerChoiceNumber) {
            case 1:
                playerChoice = "Rock";
                break;
            case 2:
                playerChoice = "Paper";
                break;
            case 3:
                playerChoice = "Scissors";
                break;
            default:
                break;
        }
    
        for (int i = 0; i < 10; i++){
            int rand = randomGenerator.nextInt(3) + 1;
            switch (rand) {
                case 1:
                    computerChoice = "Rock";
                    break;
                case 2:
                    computerChoice = "Paper";
                    break;
                case 3:
                    computerChoice = "Scissors";
                    break;
            default:
                break;
        }
        }
        
        System.out.println("The computer has chosen " + computerChoice);
        System.out.println("The user has chosen " + playerChoice);
        
        
        if ("Rock".equals(playerChoice) && "Paper".equals(computerChoice)) {
            System.out.println("Computer wins!");
        } else if ("Paper".equals(playerChoice) && "Paper".equals(computerChoice)) {
            System.out.println("It is a tie!");
        } else if ("Scissors".equals(playerChoice) && "Paper".equals(computerChoice)){
            System.out.println("User wins!");
        } else if ("Rock".equals(playerChoice) && "Rock".equals(computerChoice)) {
            System.out.println("It is a tie!");
        } else if ("Paper".equals(playerChoice) && "Rock".equals(computerChoice)) {
            System.out.println("User wins!");
        } else if ("Scissors".equals(playerChoice) && "Rock".equals(computerChoice)) {
            System.out.println("Computer wins!");
        } else if ("Rock".equals(playerChoice) && "Scissors".equals(computerChoice)){
            System.out.println("It is a tie!");
        } else if ("Paper".equals(playerChoice) && "Scissors".equals(computerChoice)) {
            System.out.println("Computer wins!");
        } else if ("Scissors".equals(playerChoice) && "Scissors".equals(computerChoice)) {
            System.out.println("It is a tie!");
        }
    }
}
