
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author MR
 */
public class factorials {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int fact = 1;
        System.out.println("Enter number :");
        int num = input.nextInt();
        for (int i = 1; i <= num; i++) {
            if (i % num == 0) {
                fact = fact * i;
                System.out.println(fact);

            }
        }

    }

}
