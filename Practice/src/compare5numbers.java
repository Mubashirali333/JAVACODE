
/**
 *
 * @author MR
 */
import java.util.Scanner;

public class compare5numbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int temp, temp2, temp3;
        System.out.println("Enter number : ");
        int num1 = input.nextInt();
        System.out.println("Enter number : ");
        int num2 = input.nextInt();
        System.out.println("Enter number : ");
        int num3 = input.nextInt();
        System.out.println("Enter number : ");
        int num4 = input.nextInt();
        System.out.println("Enter number : ");
        int num5 = input.nextInt();

        if (num1 > num2) {
            temp = num1;
        } else {
            temp = num2;
        }
        //////////

        if (num3 > num4) {
            temp2 = num3;
        } else {
            temp2 = num4;
        }

        if (temp > temp2) {
            temp3 = temp;
        } else {
            temp3 = temp2;

        }

        if (temp3 > num5) {
            System.out.println("Greater number is " + temp3);
        } else {
            System.out.println("Greater number is " + num5);
        }

    }
}
