
import java.util.Scanner;

/**
 *
 * @author MR
 */
public class Arrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size : ");
        int size = sc.nextInt();
        int number[] = new int[size];

        //input
        for (int i = 0; i < size; i++) {
            System.out.println("Enter numbers : ");
            number[i] = sc.nextInt();
        }

//       output 
//        for(int i =0;i<size;i++){
//            System.out.println(number[i]);
//        }
        System.out.println("Enter num for replace : ");
        int x = sc.nextInt();
        for (int i = 0; i < number.length; i++) {
            if (number[i] == x) {
                System.out.println("Yes there it is at index" + i);
                break;
            }
        }

    }

}
