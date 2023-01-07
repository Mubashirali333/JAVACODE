
import java.util.Scanner;

/**
 *
 * * Q Take an array as input from the user. Search for a given number x and
 * print the index at which it occurs.//
 *
 * @author MR
 */
public class practice {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size : ");

        int size = sc.nextInt();

        int number[] = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter number : ");
            number[i] = sc.nextInt();
        }
        System.out.println("Enter search : ");
        int x = sc.nextInt();
        for (int i = 0; i < number.length; i++) {
            if (number[i] == x) {
                System.out.println("Found at index" + i);
            }
        }
    }
}
