/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MR
 */
import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int menu = input.nextInt();

        switch (menu) {
            case 1:
                System.out.println("Season");
                System.out.println("Enter Season :");
                String sea = input.nextLine();
                if(sea=="summer"){
                    System.out.println("July to december ");
                }
                if(sea=="winter"){
                    System.out.println("December to feb ");
                }
                if(sea=="autumn"){
                    System.out.println("March to May ");
                }
                if(sea=="spring"){
                    System.out.println("May to june ");
                }
                
                
                
                
                
                break;

            case 2:
                System.out.println("Calculator");
                break;

            case 3:
                System.out.println("Inches");
                break;

        }

    }

}
