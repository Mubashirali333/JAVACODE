/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package package2;

import models.Student;
import java.util.Scanner;

/**
 *
 * @author CS_GCH
 */
public class MyClass {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Student[] obj = new Student[1000];
        //Student s = null;
        for (int i = 0; i < obj.length; i++) {
            System.out.println("Enter Record No " + i);
            System.out.print("enter Student ID ");
            int id = Integer.parseInt(input.nextLine());
            System.out.print("Enter Student Name ");
            String name  = input.nextLine();
            System.out.print("Enter Father Name ");
            String fname  = input.nextLine();
//            s = new Student(id, name, fname);
//            obj[i] = s;            
            obj[i] = new Student(id, name, fname);
        }
        
        System.out.println("\n\n\t\tStudent Records");
        for(int i=0; i<obj.length; i++)
        {
            System.out.println("\n\t\tRecord No " + i);
            System.out.println("Student ID " + obj[i].getStudentID());
            System.out.println("Student Name " + obj[i].getStudentName());
            System.out.println("Father Name " + obj[i].getFatherName());
        }
    }
}
