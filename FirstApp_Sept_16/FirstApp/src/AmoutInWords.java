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
public class AmoutInWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a 5 digit amount : ");
        int amount = input.nextInt();
        
        int thousands = amount / 1000;
        int temp = amount % 1000;
        
        int hundreds = temp / 100;
        temp = temp % 100;
        
        int tens = temp / 10;
        int ones = temp % 10;
        
        System.out.println(amount + " Contains : ");
        System.out.println(thousands + " Thousands");
        System.out.println(hundreds + " Hundreds");
        System.out.println(tens + " Tens");
        System.out.println(ones + " Ones");        
    }    
}
