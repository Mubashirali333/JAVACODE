/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Salman
 */
public class calculator {
    public static void main(String[] args) {
        
        float num1, num2, result; // declaring variables
        //float pie = 3.14f;
        // assigning values to variables
        num1 = 50;
        num2 = 3;
        
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
