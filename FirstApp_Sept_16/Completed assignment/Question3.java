/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @MUBAHSIR ALI
 */
 import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
	//	3. A shop will give discount of 10% if the cost of purchased quantity is more than 1000.Ask user for quantitySuppose, one unit will cost 100.Judge and print total cost for user.
	System.out.print("Enter total purchase amount : ");
        int purchase=input.nextInt();
        int discount=purchase/10;
        int totalamount=purchase-discount;
       if(purchase>=1000) 
       {
       System.out.println("Total purchase : "+purchase);
       System.out.println("Discount : "+discount);       
       System.out.println("totalamount : "+totalamount);}
       else
       System.out.print("Total : "+purchase);
		
	}
}