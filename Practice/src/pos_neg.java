/**
 *
 * @author MR
 */

import java.util.Scanner;
public class pos_neg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num1 =input.nextInt();
        if(num1 > 0){
            System.out.println("Number is positive ");
        }
        else{
            System.out.println("Number is negative ");
        }
        
    }


}
