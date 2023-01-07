/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @MUBASHIRALI
 */
 import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
	//	1. Take values of length and breadth of a rectangle from user and check if it is square or not.
	 int length, breath;
        System.out.print("Enter length of an object : ");
        length = input.nextInt();
        System.out.print("Enter breath of an object : ");
        breath = input.nextInt();
        
        if(length == breath)
            System.out.println("Object is a SQUARE");
        else
            System.out.println("Object is not a SQUARE. It is a RECTANGLE");
	}
}