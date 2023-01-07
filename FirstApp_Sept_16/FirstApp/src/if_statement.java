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

        System.out.print("Enter a Number : ");
        int number = input.nextInt();

        if (number < 0) 
            System.out.println(number + " is a Negative Integer");
        else
            System.out.println(number + " is a Positive Integer");
    }
}
