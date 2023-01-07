/*
 * 

/**
 *
 * @author MUBASHIR ALI
 */
import java.util.Scanner;

public class Lab3_Task3_agecompare {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2;
        System.out.print("Enter any number :");
        num1 = input.nextInt();
        System.out.print("Enter any number :");
        num2 = input.nextInt();

        if (num1 > num2) {

            System.out.println(num1 + " number is Greater ");

        } else {
            System.out.println(num2 + " number is Greater ");
        }
    }

}
