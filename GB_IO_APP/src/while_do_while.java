/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MR
 */
import java.util.Scanner;

public class while_do_while {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1, num2, inp;

        do {

//            System.out.println("Enter ");

            System.out.println("Enter operation \n 1 : Addtion \n 2 : Substracion \n 3 : Multiply \n 4 : Divide \n 5 : Modulus ");
            inp = input.nextInt();
            System.out.print("Enter number : ");
            num1 = input.nextInt();
            System.out.print("Enter number : ");
            num2 = input.nextInt();

            if (inp == 1) {
                System.out.println("Addidtion is :" + (num1 + num2));
            } else if (inp == 2) {
                System.out.println("Substraction is :" + (num1 - num2));
            } else if (inp == 3) {
                System.out.print("Multiplication is :" + (num1 * num2));
            } else if (inp == 4) {
                System.out.print("Divide is :" + (num1 / num2));
            } else if (inp == 5) {
                System.out.print("ddidtion is :" + (num1 % num2));
            }
            break;
        }
        while(false);
//        } while ((inp != 1) || inp != 2 || inp != 3 || inp != 4);

    }

}
