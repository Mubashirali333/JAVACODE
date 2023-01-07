/*
 */

/**
 *
 * @author MUBASHIR ALI
 */
import java.util.Scanner;

public class marksheet {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String name, fname;
        int rollno, eng, urdu, math, chem, phy;

        System.out.print("Enter your name : ");
        name = input.nextLine();
        System.out.print("Enter your father name : ");
        fname = input.nextLine();
        System.out.print("Enter roll no : ");
        rollno = input.nextInt();

        System.out.print("Enter english marks : ");
        eng = input.nextInt();

        System.out.print("Enter urdu marks : ");
        urdu = input.nextInt();

        System.out.print("Enter math marks : ");
        math = input.nextInt();

        System.out.print("Enter chemistry marks : ");
        chem = input.nextInt();

        System.out.print("Enter physiscs marks : ");
        phy = input.nextInt();

        int obtain = eng + urdu + math + chem + phy;
//        int perc = obtain / 5;
        int perc = obtain *100/500;


        System.out.println("-----------------------------------------Student Details---------------------------------------------- ");
        System.out.println("Student name is " + name);
        System.out.println("Father name is : " + fname);
        System.out.println("Roll no is : " + rollno);
        System.out.println("Total marks is : " + obtain);
        System.out.println("Percentage is : " + perc + "%");

        if (perc > 90) 
            System.out.println("Your grade is A ");
        else if (perc > 70)
            System.out.println("Your grade is B ");
        else if (perc > 50)
            System.out.println("Your grade is C ");
        else if (perc > 30)
            System.out.println("You grade is  D ");
        else
            System.out.println("You are Fail");
        

    }
}
