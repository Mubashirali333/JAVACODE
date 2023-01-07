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
public class DollarToPKR {
    public static void main(String[] args)
    {
        // convert dollars to pkr
        Scanner input = new Scanner(System.in);
        int dollars, pkr, dollarPrice = 170;
        System.out.print("How many dollars do you have : ");
        dollars = input.nextInt();        
        pkr = dollars * dollarPrice;        
        System.out.println(dollars + "$ are equal to " + pkr + " PKR");
        
        
    }
}
