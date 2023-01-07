
import java.util.Scanner;

/**
 *
 * @author MR
 */
public class highestdiviser {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        int temp = 0;
//        System.out.println("Enter number : ");
//        int num = input.nextInt();
//        for (int i = 2; i < num; i++) {
//            if (num % i == 0) {
//                temp = i;
//            }
//
//        }
//        System.out.println("" + temp);
////////////////////////////////////////
        int temp = 0;
        int num = input.nextInt();
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                temp = i;
            }

        }
        System.out.println(temp);

    }

}
