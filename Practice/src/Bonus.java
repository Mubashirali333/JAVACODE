
import java.util.Scanner;

/**
 *
 * @author MR
 */
// 4. A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years.Ask user for their salary and year of service and print the net bonus amount.
public class Bonus {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Salary : ");
        int salary = input.nextInt();
        System.out.println("Enter service years : ");
        int service = input.nextInt();
        if (service >= 5) {
            int perc = salary / 5;
            System.out.println("5% is " + perc);
            System.out.println("Total is " + salary + perc);
        }
    }

}
