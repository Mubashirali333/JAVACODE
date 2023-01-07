/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MR
 */
import java.util.Scanner;

public class AS2_daytosec {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sec = 60 *60 *24; //sec8 mint *days
        System.out.print("Enter days : ");
        int day = input.nextInt();
        int res = day * sec;
        System.out.println("Days in sceonds is : " + res);

    }
}
