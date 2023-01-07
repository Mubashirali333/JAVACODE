
import java.util.Scanner;

/**
 *
 * @author MR
 */
public class ifelse {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter age : ");
        int age = input.nextInt();
        System.out.println("Enter Height : ");
        int height = input.nextInt();

        if (age > 20) {
            if (height > 5) {
                System.out.println("Selected");
            } else {
                System.out.println("invalid height");
            }

        } else {
            System.out.println("you are not selected");
        }
    }
}
