/*
 */

/**
 *
 * @author MR
 */
import java.util.Scanner;

public class evenodd {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.println("Enter number : ");
//        int num1 = input.nextInt();
//        if (num1%2 == 0){
//            System.out.println("Number is even ");
//        }
//        else{
//            System.out.println("Number is odd ");
//        }

//second scenario
        System.out.println("Enter number : ");
        int num1 = input.nextInt();
        if (num1 % 2 != 0) {
            System.out.println("Number is odd ");
        } else {
            System.out.println("Number is even ");
        }
    }

}
