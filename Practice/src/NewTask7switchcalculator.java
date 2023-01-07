
/**
 *
 * @author MR
 */
import java.util.Scanner;

public class NewTask7switchcalculator {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter operation \n 1. Additon \n 2. Substraction \n 3. Multiplication \n 4. Division : ");
        int op = input.nextInt();

        System.out.println("Enter number : ");
        int num1 = input.nextInt();

        System.out.println("Enter number : ");
        int num2 = input.nextInt();

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

    }

}
