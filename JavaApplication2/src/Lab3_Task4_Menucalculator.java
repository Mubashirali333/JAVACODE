
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author MR
 */
public class Lab3_Task4_Menucalculator {

    public static void main(String[] args) {

        int inp;
        inp = Integer.parseInt(JOptionPane.showInputDialog("\t         Calculator \n Enter choice : \n 1:for Addition \n 2:for Substraction \n 3:for Multiplication \n 4:for Division "));

        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter number : "));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter number : "));

        if(inp == 1){
            JOptionPane.showMessageDialog(null, "Addition is "+(num1+num2));
        }
        if(inp == 2){
            JOptionPane.showMessageDialog(null, "Substraction is "+ (num1-num2) );
        }
        if(inp == 3){
            JOptionPane.showMessageDialog(null, "Multiplication is "+num1*+num2);
        }
        if(inp == 4){
            JOptionPane.showMessageDialog(null,"Division is "+ num1/num2);
        }
        
        
    }

}
