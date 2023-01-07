
import java.util.Scanner;

/**
 *
 * @author MR
 */
public class NewTask3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int avg = 0;

        int num[] = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter number : ");
            num[i] = sc.nextInt();
        }
        for (int i = 0; i < num.length; i++) {
            sum = sum + num[i];
            avg = sum / 10;
        }
        System.out.println("sum is " + sum);
        System.out.println("Average is " + avg);
    }

}
