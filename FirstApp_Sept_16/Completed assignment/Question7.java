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
		Scanner input=new Scanner(System.in);
		int num1;
		int num2;
		int per;
		
	//	7. A student will not be allowed to sit in exam if his/her attendence is less than 75%.
 // Take following input from user
// Number of classes held
// Number of classes attended.
// And print percentage of class attended
// Is student is allowed to sit in exam or not.
    System.out.print("Numberofclasesesheld : ");
    num1=input.nextInt();
  System.out.print("Numberofclassesattended : ");
  num2 = input.nextInt();
		per=num2*100/num1;
		System.out.println("Percentage : " + per +"%");
		if (per > 75) 
            System.out.println(" Student is allow to sit in exam");
        else
            System.out.println(" Student is not allow to sit in exam");
	}
}