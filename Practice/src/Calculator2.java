/*
/**
 *
 * @author MR
 */
import java.util.Scanner;

public class Calculator2 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num1 = input.nextInt();
        System.out.print("Enter number : ");
        int num2 = input.nextInt();
        System.out.println("Enter operation \nAddition \nSubstraction \nMultiplication \nDivision : ");
        String op = input.nextLine();
        
        if (op.equals('+' | 1)) {
            System.out.println("Additon is " + num1 + num2);
        } else if (op.equals('-' | 2)) {
            System.out.println("Substraction is " + (num1 - num2));
        } else if (op.equals('*' | 3)) {
            System.out.println("Multiplication is " + num1 * num2);
        }
//        else if (op.equals('/' | 4)) {
//            System.out.println("Division is " + num1 / num2);
//        }
    }
}
