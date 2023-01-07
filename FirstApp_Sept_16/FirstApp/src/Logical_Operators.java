/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Salman
 */
public class Logical_Operators {
//    there are 3 logical operators
//  they always returns true / false
//  logical operators are used in between two or more expression
//  1. And (&&) it is like Multiplication (*)
//  2. OR (II)	it is like Addition (+)
//  3. NOT (!) it inverses true to false, and false to true

    public static void main(String[] args) {
        int num1 = 9;
        int num2 = 5;
        int num3 = 10;
        int num4 = 15;

        boolean result = (num1 > num2) && (num3 < num4);
        System.out.println("And : Value in result is " + result);
        
        result = (num1 < num2) || (num3 < num4);
        System.out.println("OR : Value in result is " + result);
        
        result = !(num1 < num2);
        System.out.println("Not : Value in result is " + result);
        
    }
}
