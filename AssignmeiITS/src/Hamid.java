/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author M.Hamid Miya
 */
import javax.swing.JOptionPane;

class Calculater {

    public static void main(String[] args) {
int num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter Num 1"));
int num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter Num 2"));

int opp = Integer.parseInt(JOptionPane.showInputDialog("Enter any Opera 1=Addition 2=Subtract 3=Multiplication 4=Division"));
if(opp==1){
JOptionPane.showMessageDialog(null,"Adition "+(num1+num2));
}
if(opp==2){
JOptionPane.showMessageDialog(null,"Subtaction "+(num1-num2));
}
if(opp==3){
JOptionPane.showMessageDialog(null,"Multilicatin "+(num1*num2));
}
if(opp==2){
JOptionPane.showMessageDialog(null,"Subtaction "+(num1/num2));
} }}