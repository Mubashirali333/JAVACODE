
/**
 *
 * @author MR
 */
import java.util.Scanner;

public class looptable {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int j = 0; j < 4; j++) {
            System.out.println("Enter Table : ");
            int num = input.nextInt();
            System.out.println("Enter Starting Table : ");
            int str = input.nextInt();
            System.out.println("Enter Ending Table : ");
            int end = input.nextInt();
            for (int i = str; i <= end; i++) {
                System.out.println(num + " X " + i + " = " + i * num);
            }

        }
    }
}
