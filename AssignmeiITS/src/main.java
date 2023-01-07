/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MR
 */

import javax.swing.JOptionPane;
public class main {
    public static void main(String[] args) {
        
        String name = JOptionPane.showInputDialog("Enter Your name ");
        JOptionPane.showMessageDialog(null,"Hello"+ name);
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter Your age "));
        JOptionPane.showMessageDialog(null,"Your "+ age);


    }
    
    
}
