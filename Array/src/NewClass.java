
import java.util.Scanner;

/**
 *
 * @author MR
 */
public class NewClass {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String marks[] = new String[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter ");
            marks[i] = sc.nextLine();
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("ouput is "+marks[i]);

        }

    }
}
