/*
/**
 *
 * @author MR
 */
import java.util.Scanner;

public class Calculatorcontinue {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Enter number : ");
            int num1 = input.nextInt();
            System.out.print("Enter number : ");
            int num2 = input.nextInt();
            System.out.println("Enter operation \nAddition \nSubstraction \nMultiplication \nDivision : ");
            int op = input.nextInt();

            switch (op) {
                case 1 ->
                    System.out.println("Addition is " + (num1 + num2));
                case 2 ->
                    System.out.println("Substraction is " + (num1 - num2));
                case 3 ->
                    System.out.println("Multiplication is " + (num1 * num2));
                case 4 ->
                    System.out.println("Division is " + (num1 / num2));

            }
            System.out.println("Do you want an other calculation ? ");
            String temp = input.nextLine();
            if (temp.equals("y") || temp.equals("y")) {
                break;
            }
        }
    }
}
