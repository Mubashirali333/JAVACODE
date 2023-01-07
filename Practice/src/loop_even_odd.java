/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MUBSHIRALI
 */
import java.util.Scanner;

public class loop_even_odd {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num1 = input.nextInt();
        System.out.println("Enter start : ");
        int str = input.nextInt();
        System.out.println("Enter end : ");
        int end = input.nextInt();
        if (num1 % 2 == 0) {
            for (int i = str; i <= end; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " is Even ");
                } else {
                    System.out.println(i + " is odd");
                }
            }
        } else {
            for (int i = str; i <= end; i++) {
                System.out.println(i + " is odd");
            }
        }

    }

}
