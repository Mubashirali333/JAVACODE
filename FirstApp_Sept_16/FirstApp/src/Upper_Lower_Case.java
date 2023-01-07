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

public class Upper_Lower_Case {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a character : ");
        char ch = input.nextLine().charAt(0);
        int code = ch;
        
//        System.out.println("You had entered char " + ch);
//        System.out.println("ASCII Code of " + ch + " is " + code);
        
        if(code >= 65 && code <= 90)
            System.out.println(ch + " is a Uppercase Alphabet");
        else if (code >= 97 && code <= 122)
            System.out.println(ch + " is a Lowercase Alphabet");
        else
            System.out.println("Sorry " + ch + " is not a valid Alphabet");
        
        
    }
}
