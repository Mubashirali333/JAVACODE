//6. Write a program to print three (3) tables simentenously. It will ask user for three table numbers, 
//starting value and ending value.
//output will be like :
//2 * 1 = 2 3 * 1 = 3 5 * 1 = 5
//. . .
//. . .
//. . ,
//2 * 2 = 4 3 * 2 = 6 5 * 2 = 10

/**
 *
 * @author MR
 */
import java.util.Scanner;

public class Program6 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Prompt the user to enter the table numbers, starting value, and ending value
        System.out.println("Enter the table numbers:");
        int[] tableNumbers = new int[3];
        for (int i = 0; i < 3; i++) {
            tableNumbers[i] = scan.nextInt();
        }
        System.out.println("Enter the starting value:");
        int start = scan.nextInt();
        System.out.println("Enter the ending value:");
        int end = scan.nextInt();

        // Print the tables
        for (int i = start; i <= end; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(tableNumbers[j] + " * " + i + " = " + tableNumbers[j] * i + " ");
            }
            System.out.println();
        }
    }
}
