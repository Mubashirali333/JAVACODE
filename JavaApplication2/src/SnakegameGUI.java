/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MR
 */
import javax.swing.JOptionPane;
import java.util.Random;
//import java.util.Scanner;
public class SnakegameGUI {

    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
        Random rm = new Random();
        String comp = null, you;
        int randno = rm.nextInt(1, 4);
//        System.out.println(" "+a);
        switch (randno) {
            case 1 -> comp = "w";
            case 2 -> comp = "s";
            case 3 -> comp = "g";
            default -> {
            }
        }
        
//        System.out.println("Enter Snake(s),Water(w),Gun(g) :");
        you = JOptionPane.showInputDialog("Enter\nSnake(s)\nWater(w),\nGun(g) :");
//        you = input.nextLine();
        ///////////////////////////////////////
        if (comp.equals(you)) {
//            System.out.println("Tie");}
         JOptionPane.showMessageDialog(null,"This is Tie");}
            
        ////////////////////////////////////////
            
        else if (comp.equals("w")) {
            if (you.equals("g")) {
//                System.out.println("You lose ");
         JOptionPane.showMessageDialog(null,"You lose ");

            }
            else if(you.equals("s")){
//                System.out.println("You Win ");
  JOptionPane.showMessageDialog(null,"You Win ");
            }
        }
        ///////////////////////////////////////
        
        else if (comp.equals("s")){
            if(you.equals("g")){
//                System.out.println("You Win ");
         JOptionPane.showMessageDialog(null,"You Win ");
                 
            }
            else if(you.equals("w")){
//                System.out.println("You Lose ");
           JOptionPane.showMessageDialog(null,"You Lose ");

            }
        }
        
        //////////////////////////////////////////
        
        else if(comp.equals("g")){
            if(you.equals("s")){
//                System.out.println("You lose ");
         JOptionPane.showMessageDialog(null,"You Lose ");

            }
            else if(you.equals("w")){
//                System.out.println("You Win ");
         JOptionPane.showMessageDialog(null,"You Win ");

            }
        }
        
        /////////////////////////////////////////////
        
        if("w".equals(comp)){
            JOptionPane.showMessageDialog(null,"Computer Choose Water ");

        }
        else if("s".equals(comp)){
            JOptionPane.showMessageDialog(null,"Computer Choose Snake ");

        }
        else if("g".equals(comp)){
            JOptionPane.showMessageDialog(null,"Computer Choose Gun ");

        }
        ///////////////////////////////////////////////
        
        if("w".equals(you)){
//            System.out.println("You choose Water ");

JOptionPane.showMessageDialog(null,"You Choose Water ");
        }
        else if("s".equals(you)){
//            System.out.println("You choose Snake ");
JOptionPane.showMessageDialog(null,"You Choose Snake ");
        }
        else if("g".equals(you)){
//            System.out.println("You choose Gun");
JOptionPane.showMessageDialog(null,"You Choose Gun ");
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

    }

}
