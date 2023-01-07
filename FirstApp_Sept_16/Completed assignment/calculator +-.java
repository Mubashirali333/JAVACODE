/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Salman
 */
import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int result;
        // declaring variables
        //float pie = 3.14f;
        // assigning values to variables
     System.out.print("Enter the number");          int num1 = input.nextInt();
     System.out.print("Enter the number");  
      int  num2 = input.nextInt();
        
        // Arithmetic Operators
        /*
            1. + Addition
            2. - Subtraction
            3. * Multiplicaiton
            4. / Division
            5. % Modulus (remainder)        
        */
        
        result = num1 + num2;
        System.out.println("Addition : " + num1 + " + " + num2 + " = " + result);
        
        result = num1 - num2;
        System.out.println("Subtraction : " + num1 + " - " + num2 + " = " + result);
        
        result = num1 * num2;
        System.out.println("Multiplcation : " + num1 + " * " + num2 + " = " + result);
    
        result = num1 / num2;
        System.out.println("Division : " + num1 + " / " + num2 + " = " + result);
        
        result = num1 % num2;
        System.out.println("Modulus : " + num1 + " % " + num2 + " = " + result);
    
    
    }
}
