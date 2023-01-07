/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Salman
 */
import java.util.Scanner;

public class Array_Exception {

    public static void main(String[] args) {
        String[] names = new String[5];
        Scanner input = new Scanner(System.in);

        try {
            for (int i = 0; i <= 5; i++) {
                System.out.print("Enter Name at " + i + " : ");
                names[i] = input.nextLine();
            }
            
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Exception " + ex.getMessage());
        }
        
        System.out.println("Names Are");
            for (int i = 0; i < names.length; i++) {
                System.out.println("Name at " + i + " is : " + names[i]);
            }

    }
}
