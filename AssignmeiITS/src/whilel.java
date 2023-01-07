/**
 *
 * @author MR
 */

import java.util.Scanner;
public class whilel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
//        int a = 0;
//        
//        while (a!=99){
//            System.out.println("Enter number : ");
//            a = input.nextInt();
//            
//        }
        
         String temp = null;
         while(true){
             if ("q".equals(temp)){
            break;
         }
          System.out.println("Enter number : ");
             temp = input.nextLine();
         }

    }
    
}
