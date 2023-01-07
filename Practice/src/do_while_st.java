
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author MR
 */
public class do_while_st {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String inp;
        do {
            System.out.print("Enter name : ");
            String name = input.nextLine();
            System.out.print("Enter Father name : ");
            String fname = input.nextLine();
            System.out.print("Enter roll no : ");
            int roll = input.nextInt();
            System.out.println("Do you program again ");
            inp = input.nextLine();
        } while (!(inp.equals("N")));

    }
}
