/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MR
 */
import java.util.Scanner;
public class Lab1_Task5_monthtsec {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int sec = 2592000;
        int month;
        System.out.print("Enter months : ");
        month = input.nextInt();
        
        int res = month * sec;
        
        System.out.println(month+" months have "+res +" seconds : ");
         
        
    }
}
