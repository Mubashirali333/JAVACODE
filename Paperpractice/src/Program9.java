//* Write a program which continuously takes an integer until a negative number is entered by the user.
// 

/**
 *
 * @author MR
 */
import java.util.Scanner;

public class Program9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int number = 0;

        while (true) {
            System.out.println("Enter number : ");
            number = sc.nextInt();
            if (number < 0) {
                break;
            }
            sum = sum + number;
        }
        System.out.println("sum is " + sum);

    }
}
