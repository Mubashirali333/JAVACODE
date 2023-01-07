/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MR
 */
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Lab3_Task4_switch_calculator {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.println("Enter operation : ");
        int op = Integer.parseInt(JOptionPane.showInputDialog("Enter Operation : \n 1: For Addition \n 2: For Substraction \n 3: ForMultipliaction \n 4: For Division "));
//        System.out.println("Enter number : ");
        int num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter number : "));
//        System.out.println("Enter number : ");
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter number : "));
        
        switch (op) {
            case 1:
//                System.out.println("Addition is : " + (num1 + num2));
                JOptionPane.showMessageDialog(null, "Addition is " + (num1 + num2));
                
                break;
            case 2:
//                System.out.println("Substraction is : " + (num1 - num2));
                JOptionPane.showMessageDialog(null, "Substraction is " + (num1 - num2));
                break;
            case 3:
//                System.out.println("Multiplication is : " + (num1 * num2));
                JOptionPane.showMessageDialog(null, "Multiplication is " + (num1 * num2));
                break;
            case 4:
//                System.out.println("Division is : " + num1 / num2);
                JOptionPane.showMessageDialog(null, "Division is " + (num1 / num2));
            
        }
        
    }
}
