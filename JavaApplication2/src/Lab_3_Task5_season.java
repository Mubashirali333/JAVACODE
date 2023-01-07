/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MR
 */
import java.util.Scanner;

public class Lab_3_Task5_season {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String inp;
        inp = input.nextLine();
        if (inp == "dec" || inp == "jan" || inp == "feb") {
            System.out.println("Winter season");
        }
        if (inp == "march" || inp == "april" || inp == "may") {
            System.out.println("Spring season");
        }
          if(inp == "may" || inp == "june"||inp == "july"||inp == "august"){
            System.out.println("Summer season");
        }
           if(inp == "oct" || inp == "nov"){
            System.out.println("Autumn season");
        }
         

    }

}
