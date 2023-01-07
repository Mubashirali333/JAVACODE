/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MUBASHIR ALI
 */
import java.util.Scanner;

public class login {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String user = "admin";
        String password = "password";

        String inp, inp2;
        System.out.print("Enter username : ");
        inp = input.nextLine();
        System.out.print("Enter password : ");

        inp2 = input.nextLine();

        if (inp == user) {
            if (inp2 == password) {
                System.out.println("Login Succesfully");
            } else {
                System.out.println("Password is in correct ");
            }

        } else {
            System.out.println("User name is incorrect ");
        }

    }
}
