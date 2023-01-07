/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MUBASHIRALI
 */
import java.util.Scanner;

public class Task5_Evenodd_2num {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number : ");
        int str = input.nextInt();
        System.out.println("Enter ending number : ");
        int end = input.nextInt();

        if (str % 2 == 0) {
            for (int i = str; i <= end; i++) {
                if (i % 2 == 0) {
                    System.out.println("Even " + i);}

            }

        } 
        else {
            for (int i = str; i <= end; i++) {
                if (i % 2 != 0) {
                    System.out.println("Odd " + i);}

            }
        }

//         
    }
}
