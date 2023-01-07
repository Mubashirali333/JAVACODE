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

public class if_else_if {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Your Age : ");
        int age = input.nextInt();
        
        if(age > 0 && age <= 12)
            System.out.println("You Are a Child");        
        else if(age > 12 && age < 18)
            System.out.println("You Are Teenage");
        else if(age >= 18 && age <= 60)
            System.out.println("You Are Adult");
        else
            System.out.println("You Are a Old Man");
                
    }
}
