/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @MUBASHIR ALI
 */
 import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//	4. A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years.Ask user for their salary and year of service and print the net bonus amount.
		System.out.print("Enter your salary : ");
		int salary = input.nextInt();
		System.out.print("Enter your year of service : ");
		int service = input.nextInt();
		int bonus = salary / 5;
		int discount = salary + bonus;
		if (service >= 5) {
			System.out.println("Total year of service : " + service+" years");
			System.out.println("bonus : " + bonus);
			System.out.println("Totalamount :" + discount);
		} else
			System.out.print("Total : " + service);

	}
}