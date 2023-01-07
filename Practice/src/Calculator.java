/*
/**
 *
 * @author MR
 */
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter operation \n");
        int op = input.nextInt();
        System.out.println("Enter number : ");
        int num = input.nextInt();
        System.out.println("Enter number : ");
        int num2 = input.nextInt();
        switch (op) {
            case 1 -> System.out.println((num + num2));
            case 2 -> System.out.println((num - num2));
            case 3 -> System.out.println(num * num2);
            case 4 -> System.out.println(num / num2);
            default -> {
            }
        }

    }
}
