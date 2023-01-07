
/**
 *
 * @author MR
 */

import java.util.Scanner;

public class birthday {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year = 2022;
        System.out.print("Enter birthyear : ");
        int birthyear = input.nextInt();

        int temp = year - birthyear;
        System.out.println("Your age is " + temp);

    }

}
