
/**
 *
 * Write a program which continuously takes an integer until a negative number is entered by the user.
 *
 * @author MR
 */
import java.util.Scanner;

public class NewTask9 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = 0;
        int sum =0;
        
        while(true){
            System.out.println("Enter number : ");
            number = input.nextInt();
            
            if(number<0){
                break;
            }
            sum = sum+number;
        }
        System.out.println("Sum is "+sum);
        
        
        

    }

}
