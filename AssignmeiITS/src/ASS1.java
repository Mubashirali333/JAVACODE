/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MR Hamid Miya
 */

import javax.swing.JOptionPane;

class ASS1 {
    public static void main(String[] args) {

        String value = JOptionPane.showInputDialog("Enter Years ");
        int days = 365;
        int years = Integer.parseInt(value);
        int result =  years * days;
        JOptionPane.showMessageDialog(null, "Days are " + result);
    }}
