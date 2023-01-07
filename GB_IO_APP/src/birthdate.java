/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MR
 */
import java.util.Scanner;

public class birthdate {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int currentyear = 2022;

        System.out.print("Enter Your Year ");

        int birth = input.nextInt();

        int result = currentyear - birth;

        System.out.println("Your age is " + result);

//        System.out.println(currentyear - birth);
    }

}
