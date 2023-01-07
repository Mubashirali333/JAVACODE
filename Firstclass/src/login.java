/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MR
 */
import java.util.Scanner;

public class login {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String user, pass;
        System.out.print("Enter username : ");
        user = input.nextLine();
        System.out.print("Enter password :");
        pass = input.nextLine();

/////////////////////          1        ///////////////////////////
//        if (user.equals("admin") && pass.equals("pass")){
//           
//            System.out.println("login succesfully ");
//        }
//        else{
//            System.out.println("Invalid ");
//        }
///////////////////             2         /////////////////////
//        if (user.equals("admin")) {
//            if (pass.equals("pass")) {
//
//                System.out.println("login succesfully ");
//            } else {
//                System.out.println("Password Invalid ");
//            }
//
//        }
//        else{
//            System.out.println("ussername is incorrect");
//        }
        ///////////////           3                  ////////////////////////////
//        int i = user.compareTo("admin");
//        {
//            System.out.println("User name is correct");
//        }
//        int j = pass.compareTo("pass");
//        {
//            System.out.println("Passowrd is correct ");
//        }
        ///////////////           4                  ////////////////////////////
        if (user.compareTo("admin") == 0) {
            if (pass.compareTo("password") == 0) {
                System.out.println("login successfully");
            } else {
                System.out.println("Password is incorrect ");
            }
        } else {
            System.out.println("Invalid Username ");
        }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    }
}
