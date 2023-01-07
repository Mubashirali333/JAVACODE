
import java.util.Scanner;

public class Minmaxusingloop {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int size = scan.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter the values for the array:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scan.nextInt();
        }

        int highest = numbers[0];
        int min = numbers[0];

        for (int i = 1; i < size; i++) {
            if (numbers[i] > highest) {
                highest = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        System.out.println("The highest number is: " + highest);
        System.out.println("The min number is: " + min);

    }
}
