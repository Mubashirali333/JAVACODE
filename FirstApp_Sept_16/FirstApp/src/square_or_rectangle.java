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
public class square_or_rectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int length, breath;
        System.out.print("Enter Length of an object : ");
        length = input.nextInt();
        System.out.print("Enter Breath of an object : ");
        breath = input.nextInt();
        
        if(length == breath)
            System.out.println("Object is a SQUARE");
        else
            System.out.println("Object is not a SQUARE. It is a RECTANGLE");
        
    }
}
