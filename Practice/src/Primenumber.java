/**
 *
 * @author MR
 */
import java.util.Scanner;

public class Primenumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = input.nextInt();
        if(num % 2 ==0 ){
            System.out.println("Not prime");
        }
        else{
            System.out.println("Prime");
        }
            

    }
}
