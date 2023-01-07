/*
 * @author MR
 */

//1. Take values of length and breadth of a rectangle from user and check if it is square or not.
import java.util.Scanner;

public class square_rectangle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter length : ");
        int len = input.nextInt();
        System.out.print("Enter breadth : ");
        int bredth = input.nextInt();
        if (len == bredth) {
            System.out.println("Square");
        } else {
            System.out.println("Rectangle");
        }

    }

}
