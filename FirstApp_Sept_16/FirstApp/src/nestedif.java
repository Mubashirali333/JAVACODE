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

public class nestedif {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userID, password;
        System.out.print("Enter your userID : ");
        userID = input.nextLine();
        System.out.print("Enter your password : ");
        password = input.nextLine();

        if (userID.equalsIgnoreCase("salman")) 
            if (password.equals("gexton")) 
                System.out.println("Welcome");
             else 
                System.out.println("Sorry wrong password");            
        else 
            System.out.println("Sorry wrong UserID");
        
    }
}
