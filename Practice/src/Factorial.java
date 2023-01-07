
/**
 *
 * @author MR
 */
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int fact = 1;
        System.out.println("Enter number :");
        int num = input.nextInt();
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
            /// logic is fact multiply by iteration(i)
        }
        System.out.println(fact);

    }
}
