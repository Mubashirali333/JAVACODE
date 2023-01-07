/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MR
 */
import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num =input.nextInt();
        int fact =1;
        for(int i=1;i<=num;i++){
            fact = fact*i;
            System.out.println(fact);
        }
        
        
        
        
        
    }
}
