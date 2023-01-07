
import java.util.Scanner;

/**
 *
 * @author MR
 */
public class array {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int marks[] = new int[3];

//       second
// int marks[] = {33,44,22};
        
//        marks[0] = 11;
//        marks[1] = 22;
//        marks[2] = 33;

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter number : ");
           marks[i] = input.nextInt();
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("output is " + marks[i]);
        }

    }

}
