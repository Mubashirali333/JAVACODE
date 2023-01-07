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
public class PKRToDollars {
    public static void main(String[] args)
    {
        // convert dollars to pkr
        Scanner input = new Scanner(System.in);
        int dollars, cents, pkr, dollarPrice = 170;
        System.out.print("How many PKR do you have : ");
        pkr = input.nextInt();        
        dollars = pkr / dollarPrice;
        cents = pkr % dollarPrice;
        System.out.println(pkr + "/PKR are equal to " + dollars + "$ and " + cents + " cents");
               
    }
}
