
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
public class TestAverageAndGrade_7 {
    public static double firstGrade;
    public static double secondGrade;
    public static double thirdGrade;
    public static double fourthGrade;
    public static double fifthGrade;
    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the score of the first grade: ");
        firstGrade = keyboard.nextDouble();
        System.out.println("Enter the score of the second grade: ");
        secondGrade = keyboard.nextDouble();
        System.out.println("Enter the score of the third grade: ");
        thirdGrade = keyboard.nextDouble();
        System.out.println("Enter the score of the fourth grade: ");
        fourthGrade = keyboard.nextDouble();
        System.out.println("Enter the score of the fifth grade: ");
        fifthGrade = keyboard.nextDouble();
        System.out.println("Enter the score you want to test: ");
        double testScore = keyboard.nextDouble();
        
        
        calcAverage();
        determineGrade(testScore);
    }
    
    public static void calcAverage() {
        double testAverage;
        testAverage = (firstGrade + secondGrade + thirdGrade + fourthGrade + fifthGrade)/5;
        System.out.println("The average of your scores is a " + testAverage);
    }
    
    public static void determineGrade(double testScore) {
        if (testScore < 60){
            System.out.println("If you got this score you would get an F.");
        } if (testScore > 60 && testScore <= 69) {
            System.out.println("This graed would be a D.");
        } if (testScore > 70 && testScore <=79) {
            System.out.println("This grade would be a C.");
        } if (testScore > 80 && testScore <=89){
            System.out.println("This grade would be a B.");
        } if (testScore >90){
            System.out.println("This grade would be a A.");
        }
    }
}
