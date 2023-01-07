/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MR
 */
import java.util.Scanner;

public class Lab1_Task10_gramstokilo2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double kilo = 0.001;
        int grams;
        System.out.println("Enter grams : ");
        grams = input.nextInt();
        double res = grams * kilo;
        System.out.println("grams to kilo : "+res);

    }

}
