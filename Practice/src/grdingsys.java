
/**
 *
 * @author MR
 */
import java.util.Scanner;

public class grdingsys {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter age ");
        int age = input.nextInt();

        if (age > 26 && age <= 56) {
            System.out.println("Job");
        }
        if (age >= 19 && age <= 25) {
            System.out.println("University");
        }
        if (age >= 17 && age <= 18) {
            System.out.println("College");
        }
        if (age >= 5 && age <= 16) {
            System.out.println("Schooling");
        }
        if (age >= 60) {
            System.out.println("Retired");
        }
    }
}
