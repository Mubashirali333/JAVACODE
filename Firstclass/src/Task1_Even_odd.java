/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MUBASHIR ALI
 */
import java.util.Scanner;

public class Task1_Even_odd {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number : ");

        int num = input.nextInt();

        if(num%2==0){
            System.out.println(num+" Number is Even ");
        }
        else{
            System.out.println(num+" Number is Odd ");
        }        
        
        
        
    }
}
