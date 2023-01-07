/*
 * @author MR
 */

// 2. Take two int values from user and print greatest among them.

import java.util.Scanner;

public class greaterless {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num1 = input.nextInt();

        System.out.println("Enter number : ");
        int num2 = input.nextInt();
        if (num1 > num2) {
            System.out.println(num1 + " is greater ");
        } else {
            System.out.println(num2 + " is greater ");
        }
    }
}
