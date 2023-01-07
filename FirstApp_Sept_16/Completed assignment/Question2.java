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

public class if_statement {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
//     2. Take two int values from user and print greatest among them.
		System.out.print("Enter the number : ");
		int num1=input.nextInt();
		System.out.print("Enter the second number : ");
		int num2=input.nextInt();
		
		if(num1>num2)
		System.out.print("Greater number is  : "+num1+ " Is Greatet than" + num2);
		else
		System.out.print("Greater number is : "+num2+  "Is Greatet than" +num1);


	}
}
