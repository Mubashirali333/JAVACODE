/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MUBASHIR ALI
 */
import java.util.Scanner;

public class Task2_pos_neg {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any num : ");
        int num = input.nextInt();

        if (num > 0) {
            System.out.println(num + " Number is Positive ");
        } else {
            System.out.println(num + " Number is Negative ");

        }

    }

}
