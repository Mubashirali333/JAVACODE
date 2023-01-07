
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @MUBAHSIR ALI
 */
import java.util.Scanner;

public class Marksheet {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String Name, Fname, Surname;
        int Rollno, Maths, Eng, Urdu, Phy, Chem, Bio, total;
        int perc, totalmarks;
        totalmarks = 600;

        System.out.print("Enter Student Name : ");
        Name = input.nextLine();

        System.out.print("Enter Father name : ");
        Fname = input.nextLine();

        System.out.print("Enter Student Surname : ");
        Surname = input.nextLine();

        System.out.print("Enter your roll no : ");
        Rollno = input.nextInt();

        System.out.print("Enter your math marks : ");
        Maths = input.nextInt();
        System.out.print("Enter your Eng marks : ");
        Eng = input.nextInt();
        System.out.print("Enter your Urdu marks : ");
        Urdu = input.nextInt();
        System.out.print("Enter your Phy marks : ");
        Phy = input.nextInt();
        System.out.print("Enter your Chem marks : ");
        Chem = input.nextInt();
        System.out.print("Enter your Bio marks : ");
        Bio = input.nextInt();

        total = (Maths + Eng + Urdu + Phy + Chem + Bio);
        perc = total * 100 / totalmarks;
        System.out.println("Percentage : " + perc + "%");
        // here calculate your grade
        if (perc >= 80) {
            System.out.println("Grade : A1");
        } else if (perc >= 70) {
            System.out.println("Grade : A");
        } else if (perc >= 60) {
            System.out.println("Grade : B");
        } else if (perc >= 50) {
            System.out.println("Grade : C");
        } else if (perc >= 40) {
            System.out.println("Grade : D");
        } else {
            System.out.println("Grade : Fail");
        }

        System.out.println("\nIStudent Information ");
        System.out.println("Student Rollno is :" + Rollno);
        System.out.println("Student Name :" + Name);
        System.out.println("Father name " + Fname);
        System.out.println("Maths markis is " + Maths);
        System.out.println("English marks " + Eng);
        System.out.println("Urdu marks is " + Urdu);
        System.out.println("Physics marks is " + Phy);
        System.out.println("Chemistry marks is " + Chem);
        System.out.println("Biology marks is " + Bio);
        System.out.println("Percentage : " + perc + "%");
        if (perc >= 80) {
            System.out.println("Grade : A1");
        } else if (perc >= 70) {
            System.out.println("Grade : A");
        } else if (perc >= 60) {
            System.out.println("Grade : B");
        } else if (perc >= 50) {
            System.out.println("Grade : C");
        } else if (perc >= 40) {
            System.out.println("Grade : D");
        } else {
            System.out.println("Grade : Fail");
        }

    }
}
