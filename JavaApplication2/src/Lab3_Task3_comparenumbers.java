/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MUBASHIRALI
 */
import java.util.Scanner;

public class Lab3_Task3_comparenumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int flag1, flag2, flag3;
        System.out.print("Enter Number   : ");
        int num1 = input.nextInt();
        System.out.print("Enter Number : ");
        int num2 = input.nextInt();

        /////////////////////////////////////
        System.out.print("Enter Number : ");
        int num3 = input.nextInt();
        System.out.print("Enter Number : ");
        int num4 = input.nextInt();

        /////////////////////////////////////
        System.out.print("Enter Number : ");
        int num5 = input.nextInt();
        System.out.print("Enter Number : ");
        int num6 = input.nextInt();

        /////////////////////////////////////
        if (num1 > num2) {
            flag1 = num1;
        } else {
            flag1 = num2;
        }
        ///////////////////////////////////////
        if (num3 > num4) {
            flag2 = num3;
        } else {
            flag2 = num4;
        }

        if (num5 > num6) {
            flag3 = num5;
        } else {
            flag3 = num6;
        }

        ///////////////////////////////////
        if (flag1 > flag2) {
            if (flag1 > flag3) {
                System.out.println(flag1 + " is Greater ");
            }
//            else {
//                System.out.println(flag3 + "is Greater ");
//            }
        }
        else if (flag2>flag3){
            System.out.println(flag2 + " is Greater ");
        }
        else{
            System.out.println(flag3+"is greater ");
        }

    }
}
