/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MR
 */

import java.util.Scanner;
public class IO_APP {
    public static void main(String[] args) {
        int num1 , num2 ,result;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value ");
        num1 = input.nextInt();

        System.out.println("Enter value ");
        num2 = input.nextInt();

        result = num1 + num2;

        System.out.println("Result" + result);
    }
   
}
