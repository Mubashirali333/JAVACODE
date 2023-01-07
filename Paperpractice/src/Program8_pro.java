
import java.util.Scanner;

public class Program8_pro {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Prompt the user to enter the size of the array
        System.out.println("Enter the size of the array:");
        int size = scan.nextInt();

        // Create an array with the specified size
        int[] numbers = new int[size];

        // Prompt the user to enter the values for the array
        System.out.println("Enter the values for the array:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scan.nextInt();
        }

        // Initialize the highest number to the first element in the array
        int highest = numbers[0];
        int min = numbers[0];

        // Loop through the rest of the array and compare each element to the highest number
        for (int i = 1; i < size; i++) {
            if (numbers[i] > highest) {
                highest = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        // Print the highest number
        System.out.println("The highest number is: " + highest);
        System.out.println("The min number is: " + min);

    }
}
