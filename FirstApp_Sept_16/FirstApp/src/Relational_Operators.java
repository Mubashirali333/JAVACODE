/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Salman
 */
public class Relational_Operators {
//      Relational Operators
//      Always returns true / false
//      Less than			<
//      Less than or equal		<=
//      Greater Than                    >
//      Greater Than or equal           >=
//      Equal (Comparssion)		==
//      Not Equal			!=
    
    public static void main(String[] args) {
        int num1 = 50;
        int num2 = 50;
        
        boolean check = num1 < num2;
        System.out.println(num1 + " < " + num2 + " = " + check);
        check = num1 <= num2;
        System.out.println(num1 + " <= " + num2 + " = " + check);
        
        check = num1 > num2;
        System.out.println(num1 + " > " + num2 + " = " + check);
    
        check = num1 >= num2;
        System.out.println(num1 + " >= " + num2 + " = " + check);
    
        check = num1 != num2;
        System.out.println(num1 + " != " + num2 + " = " + check);
        
        check = num1 == num2;
        System.out.println(num1 + " == " + num2 + " = " + check);
        
    }
}
