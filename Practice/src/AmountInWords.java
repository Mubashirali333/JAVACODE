
/**
 *
 * @author MR
 */

import java.util.Scanner;

public class AmountInWords {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number : ");
        int amount = input.nextInt();

        int thousand = amount / 1000;
        int temp = amount % 1000;

        int hundred = temp / 100;
        temp = temp % 100;

        int ten = temp / 10;
        int one = ten % 10;

        System.out.println(amount);
        System.out.println("Thousand " + thousand);
        System.out.println("Hudred " + hundred);
        System.out.println("Ten " + ten);
        System.out.println("one " + one);

    }

}
