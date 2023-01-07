/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MR
 */
import java.util.Scanner;

public class Lab1_Task14_marksheet {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String grade;

        System.out.print("Enter name : ");
        String name = input.nextLine();

        System.out.print("Enter Father Name : ");
        String fname = input.nextLine();

        System.out.print("Enter Roll no : ");
        int rollno = input.nextInt();

        System.out.print("Enter eng marks : ");

        int eng = input.nextInt();

        System.out.print("Enter math marks : ");
        int math = input.nextInt();

        System.out.print("Enter urdu marks : ");
        int urdu = input.nextInt();

        System.out.print("Enter chem marks : ");
        int chem = input.nextInt();

        System.out.print("Enter phy marks : ");
        int phy = input.nextInt();

        int obtain = eng + math + urdu + chem + phy;
        int perc = obtain / 5;

        System.out.println( "\t ------Student info------ ");
        System.out.println("Name : " + name);
        System.out.println("Father Name : " + fname);
        System.out.println("Rollno is : " + rollno);
        System.out.println("Percentage is : " + perc+"%");

        if (perc >= 80) {
            grade = "A1";
        } else if (perc >= 60) {
            grade = "B";
        } else if (perc >= 40) {
            grade = "C";
        } else {
            grade = "Fail";
        }
        System.out.println("Grade is : " + grade);

    }
}
