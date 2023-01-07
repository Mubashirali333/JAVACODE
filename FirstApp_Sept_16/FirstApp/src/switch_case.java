/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Salman
 */
import java.util.Scanner;

public class switch_case {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int result = 0;
        int choice = 0;

        System.out.println("MAIN MENU");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Modulus");

        System.out.print("Enter a option from above MENU : ");
        choice = input.nextInt();

        if (choice >= 1 && choice <= 5) {
            System.out.print("Enter First Integer Value : ");
            num1 = input.nextInt();
            System.out.print("Enter Second Integer Value : ");
            num2 = input.nextInt();
        }

        switch (choice) {
            case 1:
                result = num1 + num2;
                System.out.println("Addition : " + num1 + " + " + num2 + " = " + result);
                break;
            case 2:
                result = num1 - num2;
                System.out.println("Subration : " + num1 + " + " + num2 + " = " + result);
                break;
            case 3:
                result = num1 * num2;
                System.out.println("Multiplication : " + num1 + " + " + num2 + " = " + result);
                break;
            case 4:
                result = num1 / num2;
                System.out.println("Division : " + num1 + " + " + num2 + " = " + result);
                break;
            case 5:
                result = num1 % num2;
                System.out.println("Modulus : " + num1 + " + " + num2 + " = " + result);
                break;
            default:
                System.out.println("Sorry Wrong Option is Selected");
        }
        System.out.println("End of Program");
    }
}
