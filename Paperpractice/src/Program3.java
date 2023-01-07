
import java.util.Scanner;

//3. Write a Java Program which takes 10 integer values from user and store them in an array. then print 
//all these values on screen with sum and average of these numbers.
/**
 *
 * @author MR
 */
public class Program3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int avg= 1;
        int marks[] = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter marks : ");
            marks[i] = sc.nextInt();
            sum = sum + marks[i];
            avg = sum/10;
        }
        System.out.println("Sum is :"+sum);
        System.out.println("Average is :"+avg);

    }

}
