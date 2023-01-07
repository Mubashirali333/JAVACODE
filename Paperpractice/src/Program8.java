
import java.util.Scanner;

/**
 *
 * @author MR
 */
public class Program8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array :");
        int size = sc.nextInt();
        int num[] = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter number :");
            num[i] = sc.nextInt();
        }

        int highest = num[0];
        for (int i = 1; i < size; i++) {
            if (num[i] > highest) {
                highest = num[i];
            }
        }
        System.out.println("Highest number is " + highest);
    }
}
