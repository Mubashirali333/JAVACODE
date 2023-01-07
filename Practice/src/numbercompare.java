/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MR
 */
import java.util.Scanner;

public class numbercompare {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int flag1, flag2, flag3, flag4, temp1 = 0, temp2 = 0;
        System.out.println("Enter number : ");
        int num1 = input.nextInt();
        System.out.println("Enter number : ");
        int num2 = input.nextInt();
        System.out.println("Enter number : ");
        int num3 = input.nextInt();
        System.out.println("Enter number : ");
        int num4 = input.nextInt();
        System.out.println("Enter number : ");
        int num5 = input.nextInt();

        System.out.println("Enter number : ");
        int num6 = input.nextInt();
        System.out.println("Enter number : ");
        int num7 = input.nextInt();
        System.out.println("Enter number : ");
        int num8 = input.nextInt();
        System.out.println("Enter number : ");
        int num9 = input.nextInt();
        System.out.println("Enter number : ");
        int num10 = input.nextInt();
//first Five 
        if (num1 > num2) {
            flag1 = num1;
        } else {
            flag1 = num2;
        }

        if (num3 > num4) {
            flag2 = num3;
        } else {
            flag2 = num4;
        }
        if (flag1 > flag2) {
            if (flag1 > num5) {
//                System.out.println(flag1 + " is larger ");
                temp1 = flag1;
            }
        } else if (flag2 > num5) {
//            System.out.println(flag2 + " is larger ");
            temp1 = flag2;

        } else {
//            System.out.println(num5 + " is greater ");
            temp1 = num5;
        }

        //another Five
        if (num6 > num7) {
            flag3 = num6;
        } else {
            flag3 = num7;
        }

        if (num8 > num9) {
            flag4 = num8;
        } else {
            flag4 = num9;
        }
        if (flag3 > flag4) {
            if (flag3 > num10) {
//                System.out.println(flag3 + " is larger ");
                temp2 = flag3;
            } else {
                temp2 = num10;
            }
        } else if (num10 > flag3) {

//            System.out.println(flag3 + " is larger ");
            temp2 = num10;

        } else {
//            System.out.println(num10 + " is greater ");
            temp2 = flag4;
        }

        ////////////////////////
        if (temp1 > temp2) {
            System.out.println(temp1 + " is greater ");
        } else {
            System.out.println(temp2 + " is greater ");
        }
    }

}
