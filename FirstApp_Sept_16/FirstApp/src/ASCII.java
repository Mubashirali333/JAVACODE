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
public class ASCII {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character : ");
        char ch = input.nextLine().charAt(0);
        int code = ch;
        
        System.out.println("ASCII Code of " + ch + " is " + code);
    }
}
