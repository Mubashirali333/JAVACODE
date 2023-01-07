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
       int dollars,pkr, dollarprice=170;
       System.out.print("how many dollars you have : ");
       dollars=input.nextInt();
       pkr=dollars*dollarprice;
       System.out.println(dollars+" is equal to"+pkr+"PKR");
       
    }
}
