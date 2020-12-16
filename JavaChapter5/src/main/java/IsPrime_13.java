
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
public class IsPrime_13 {
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int number, i, a = 0;

    System.out.println("Enter a number: ");
    number = in.nextInt();

    for (i = 1; i < (number + 1); i++) {
        if (number % i == 0) {
            a++;
        }
    }

    System.out.println(prime(a));
}

public static boolean prime(int a) {
    if (a != 2) {
        return false;
    }

    return true;
}
}
