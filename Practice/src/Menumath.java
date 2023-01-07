/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MR
 */
import java.lang.Math;
import java.util.Scanner;

public class Menumath {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the simple math helper.");
        System.out.println("What would you like to calculate? \n1. Sqrt \n2. Log \n3. Factorial");
        int inp = sc.nextInt();
        System.out.println("Enter number : ");
        int num = sc.nextInt();

        if (inp == 1) {
            System.out.println(Math.sqrt(num));
        } else if (inp == 2) {
            System.out.println(Math.log(num));
        } else if (inp == 3) {
            int fact = 1;
            for (int i = 1; i <= num; i++) {
                fact = fact * i;
                System.out.println(fact);
            }

        }

    }

}
