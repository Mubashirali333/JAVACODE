/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MR
 */
//import java.util.Scanner;
import javax.swing.JOptionPane;

public class Lab3_Task2_Even_or_odd {

    public static void main(String[] args) {

//  Scanner input = new Scanner(System.in);
//        System.out.print("Enter number : ");
        int num = Integer.parseInt(JOptionPane.showInputDialog("Enter any nuber : "));
        if (num % 2 == 0) {
//            System.out.println(num + " Number is even ");
            JOptionPane.showMessageDialog(null, num + " Is Even number ");
        } else {
//            System.out.println(num + " Number is odd ");
            JOptionPane.showMessageDialog(null, num + " is Odd Number ");
        }

    }
}
