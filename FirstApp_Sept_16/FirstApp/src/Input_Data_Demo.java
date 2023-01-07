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

public class Input_Data_Demo {
    public static void main(String[] args) {
        int num1, num2, result;
        
        // Create an object of a Scanner class        
        Scanner input = new Scanner(System.in);
        
        // displaying a msg to user for inputing a number value
        System.out.print("Enter First Number : ");
        // taking the value from user and storing it in num1 variable
        num1 = input.nextInt();
        
        System.out.print("Enter Second Number : ");
        num2 = input.nextInt();
        
        result = num1 + num2;
        System.out.println("Addition : " + num1 + " + " + num2 + " = " + result);
        
        result = num1 - num2;
        System.out.println("Subtraction : " + num1 + " - " + num2 + " = " + result);
        
        result = num1 * num2;
        System.out.println("Multiplcation : " + num1 + " * " + num2 + " = " + result);
    
        result = num1 / num2;
        System.out.println("Division : " + num1 + " / " + num2 + " = " + result);
        
        result = num1 % num2;
        System.out.println("Modulus : " + num1 + " % " + num2 + " = " + result);
    
        
    }
}
