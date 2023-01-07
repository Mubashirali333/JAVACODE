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

public class if_statement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        2. Take two int values from user and print greatest among them.

        int num1,num2;

        System.out.print("Enter a Number : ");
        num1= input.nextInt();
        System.out.print("Enter a Number : ");
        num2= input.nextInt();

        if (num1 < num2) 
            System.out.println(num1 + " is a Greater number");
        else
            System.out.println(num2 + " is a Smaller number");
    }
}
