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

public class Input_Student_info {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        String stname, fname, address, contactno, email;
        int age;
        
        System.out.print("Enter Student Name : ");        
        stname = input.nextLine();
        
        System.out.print("Enter Father Name : ");
        fname = input.nextLine();
        
        System.out.print("Enter Email Address : ");
        email = input.nextLine();
        
        System.out.print("Enter Address : ");
        address = input.nextLine();
        
        System.out.print("Enter contact No : ");
        contactno = input.nextLine();
        
        System.out.print("Enter Age : ");
        age = input.nextInt();
        
        System.out.println("\nIStudent Information ");
        System.out.println("Student Name : " + stname);
        System.out.println("Father Name : " + fname);
        System.out.println("Age : " + age);
        System.out.println("Email Address : " + email);
        System.out.println("Address : " + address);
        System.out.println("Contact No : " + contactno);
        
        
    }
}
