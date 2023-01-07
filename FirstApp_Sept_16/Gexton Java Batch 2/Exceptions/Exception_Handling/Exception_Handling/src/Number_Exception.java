/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Salman
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class Number_Exception {

    public static void main(String[] args) {
        int[] numbers = new int[4];
        Scanner input = new Scanner(System.in);
        try {
            for (int i = 0; i < numbers.length; i++) {
                System.out.print("Enter Value at " + i + " : ");
                numbers[i] = input.nextInt();
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("ARRAY EXception " + ex.getMessage());
        } catch (InputMismatchException ex) {
            System.out.println("Input Mismatch EXception " + ex.getMessage());
        }
        finally{
            System.out.println("Finally Block");
        }
    }

}
