/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MR
 */
import java.util.Scanner;

public class AS1_daytomints {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        1 mint have 60 sec and 1 day have 24 hours
        //60 * 24=1440 means 1 dave have 1440 mints

        int day,res, mints = 1440;
        System.out.print("Enter days : ");
        day = input.nextInt();
        res = day * mints;
        System.out.println(day+" have "+res);
        

    }

}
