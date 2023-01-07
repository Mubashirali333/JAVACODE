/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MR
 */
import java.util.Scanner;

public class Task3_max_min {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int maxnum,minnum;
        System.out.print("Enter number : ");
        int num1 = input.nextInt();
        System.out.print("Enter number : ");
        int num2 = input.nextInt();
        System.out.print("Enter number : ");
        int num3 = input.nextInt();

        if(num1>num2){
//            System.out.println(num1+" number is greater ");
         maxnum = num1;
        }
        else{
         maxnum=num2;   
        }
        if(maxnum>num3){
            System.out.println(maxnum+" is greater ");
        }
        else{
            System.out.println(num3+" is greater ");
        }
        
        
        /////////////////////////////////////////////
        
        if(num1<num2){
//            System.out.println(num1+" number is greater ");
         minnum = num1;
        }
        else{
         minnum=num2;   
        }
        if(minnum<num3){
            System.out.println(minnum+" is less ");
        }
        else{
            System.out.println(num3+" is less ");
        }
        
        
        
        
        
        
        
        
        
        
    }

}
