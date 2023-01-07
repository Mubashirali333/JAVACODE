/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MR
 */
import java.util.Scanner;

public class Task{
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
        System.out.println("Enter User Name");
        String user = input.nextLine();
        System.out.println("Enter Pasword");
        int pass = input.nextInt();

if (user.equals("Hamid") & pass== 78)
{   System.out.println("You Have Login");
}
 else if (user.equals("Hamid") & pass!= 78)
 {
     System.out.println("Pasword is Wrong");
 }
 else if (user!="Hamid" & pass== 78)
 {
     System.out.println("User is Wrong");
 }
 else if (user!="Hamid" & pass!= 78)
 {
     System.out.println("User and Password is Wrong");
 }
 else {
 System.out.println("Try Again");
     }
}}