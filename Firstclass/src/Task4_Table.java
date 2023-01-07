/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MR
 */
import java.util.Scanner;

public class Task4_Table {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      
//        System.out.println("Enter table : ");
//        int num1 = input.nextInt();
//        System.out.println("Enter starting number : ");
//        int st = input.nextInt();
//        System.out.println("Enter ending numbere : ");
//        int end = input.nextInt();
//        
//        for(int i=st;i<=end;i++){
//            System.out.println(num1+"*"+i+"="+i*num1);
//        }
        
        System.out.println("Enter table :");
        int num1 = input.nextInt();
        System.out.println("Enter start : ");
        int str = input.nextInt();
        System.out.println("Enter end number :");
        int end = input.nextInt();
        
        for(int i = str;i<end;i++){
            System.out.println(num1+"*"+i+"="+num1*i);
            
        }
        
        
        
        
        
        

    }

}
