
/**
 *
 * @author MR
 */
import java.util.Scanner;

public class NewTask8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int temp;
        System.out.println("Enter number : ");
        int num1 = input.nextInt();
        System.out.println("Enter number : ");
        int num2 = input.nextInt();
        System.out.println("Enter number : ");
        int num3 = input.nextInt();

        if (num1 > num2) {
            temp = num1;
        } else {
            temp = num2;
        }
        if (num3 > temp) {
            System.out.println("Greater number is " + num3);
        } else {
            System.out.println("Greater number is " + temp);
        }

    }
}
