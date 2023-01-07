/**
 *
 * @author MR
 */


import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Username : ");
        String user = input.nextLine();
        System.out.println("Enter password : ");
        int password = input.nextInt();
        if(user.equals("Admin") && password == 1234){
            System.out.println("Successfully login ");
        }
        else{
            System.out.println("Invalid");
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
