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

public class Lab3_Task7_alphabet {

    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
        String inp = JOptionPane.showInputDialog("Enter any character (A to Z)");
        String a = "Apple", b = "Burger", c = "Calender", d = "Dog", e = "Elephant", f = "Frog",
                g = "Guitar", h = "House", i = "Ink", j = "Jug", k = "Kite", l = "Lemon", m = "Money", n = "Network", o = "Orange", p = "Pen",
                q = "Queen", r = "Ring", s = "Shoes", t = "T-shirt", u = "Umbrella", v = "Van", w = "Watch", x = "Xylophone", y = "Yogurt", z = "Zebra";
//            JOptionPane.showMessageDialog(null, a);

        if (inp.equals("a")) {
            System.out.println(""+a);
            JOptionPane.showMessageDialog(null, a);
        }
        
        else if (inp.equals("b")) {
            JOptionPane.showMessageDialog(null, b);
        }else if (inp.equals("c")) {
            JOptionPane.showMessageDialog(null, c);
        }else if (inp.equals("d")) {
            JOptionPane.showMessageDialog(null, d);
        }else if ("e".equals(inp)) {
            JOptionPane.showMessageDialog(null, e);
        }else if ("f".equals(inp)) {
            JOptionPane.showMessageDialog(null, f);
        }else if ("g".equals(inp)) {
            JOptionPane.showMessageDialog(null, g);
        }else if ("h".equals(inp)) {
            JOptionPane.showMessageDialog(null, h);
        }else if ("i".equals(inp)) {
            JOptionPane.showMessageDialog(null, i);
        }else if ("j".equals(inp)) {
            JOptionPane.showMessageDialog(null, j);
        }

        ///////////////////////////////////////////
        else if ("k".equals(inp)) {
            JOptionPane.showMessageDialog(null, k);
        }
        
        else if ("l".equals(inp)) {
            JOptionPane.showMessageDialog(null, l);
        }else if ("m".equals(inp)) {
            JOptionPane.showMessageDialog(null, m);
        }else if ("n".equals(inp)) {
            JOptionPane.showMessageDialog(null, n);
        }else if ("o".equals(inp)) {
            JOptionPane.showMessageDialog(null, o);
        }else if ("p".equals(inp)) {
            JOptionPane.showMessageDialog(null, p);
        }else if ("q".equals(inp)) {
            JOptionPane.showMessageDialog(null, q);
        }else if ("r".equals(inp)) {
            JOptionPane.showMessageDialog(null, r);
        }else if ("s".equals(inp)) {
            JOptionPane.showMessageDialog(null, s);
        }else if ("t".equals(inp)) {
            JOptionPane.showMessageDialog(null, t);
        }
        ////////////////////////////////////////////
        else if ("u".equals(inp)) {
            JOptionPane.showMessageDialog(null, u);
        }else if ("v".equals(inp)) {
            JOptionPane.showMessageDialog(null, v);
        }else if ("w".equals(inp)) {
            JOptionPane.showMessageDialog(null, w);
        }else if ("x".equals(inp)) {
            JOptionPane.showMessageDialog(null, x);
        }else if ("y".equals(inp)) {
            JOptionPane.showMessageDialog(null, y);
        }else if ("z".equals(inp)) {
            JOptionPane.showMessageDialog(null, z);
        }
        
        else {
            System.out.println("Invalid ");
        }
        
    }
}
