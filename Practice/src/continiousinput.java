
/**
 *
 * @author MR
 */
import java.util.Scanner;

public class continiousinput {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0;
        int sum = 0;

        while (true) {
            System.out.print("Enter number : ");
            number = input.nextInt();

            if (number < 0) {
                break;
            }
            sum = sum + number;
        }
        System.out.println("Sum is " + sum);
    }
}
