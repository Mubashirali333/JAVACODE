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

public class Even_Odd_Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a Number : ");
        int number = input.nextInt();
        
        if((number % 2) == 0)
            System.out.println(number + " is an Even Integer");
        else
            System.out.println(number + " is an ODD Integer");
    }
}
