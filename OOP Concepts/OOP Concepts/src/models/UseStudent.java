/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author CS_GCH
 */
import java.util.Scanner;

public class UseStudent {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Student obj = new Student(10, "Ali Raza", "Fawad");

        System.out.print("Enter Student Updated Naame :  ");
        obj.setStudentName(input.nextLine());

        System.out.println("\n\nStudent Information");
        System.out.println("Student ID " + obj.getStudentID());
        System.out.println("Student Name " + obj.getStudentName());
        System.out.println("Father Name " + obj.getFatherName());

        Student obj1 = new Student();
        System.out.print("Enter Student ID ");
        obj1.setStudentID(Integer.parseInt(input.nextLine()));
        System.out.print("Enter Student Naame :  ");
        obj1.setStudentName(input.nextLine());
        System.out.print("Enter Father Naame :  ");
        obj1.setFatherName(input.nextLine());

        System.out.println("\n\nStudent obj1 Information");
        System.out.println("Student ID " + obj1.getStudentID());
        System.out.println("Student Name " + obj1.getStudentName());
        System.out.println("Father Name " + obj1.getFatherName());        
    }
}
