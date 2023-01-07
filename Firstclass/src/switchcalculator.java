/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MR
 */
import java.util.Scanner;

public class switchcalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Operation : \n 1: for Addition \n 2: for Substraction \n 3: for Multiplication \n 4: for Division ");

        int op = input.nextInt();
        int num1, num2;
        System.out.print("Enter number : ");
        num1 = input.nextInt();
        System.out.print("Enter number : ");
        num2 = input.nextInt();

        switch (op) {
            case 1:
                System.out.println("Adddtion is "+num1 + num2);
                break;
            case 2:
                System.out.println("Substraction is "+(num1- num2));
                break;
           
            case 3:
                System.out.println("Multiplication is "+num1 * num2);

                break;
            case 4:
                System.out.println("Division is "+(num1 / num2));
        }

    }

}
