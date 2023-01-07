import java.util.Scanner;

public class NewTask6 {
  public static void main(String[] args) {
    // Create a Scanner object for user input
    Scanner scanner = new Scanner(System.in);

    // Ask the user for the numbers whose multiplication tables we want to print
    System.out.println("Enter the first number: ");
    int num1 = scanner.nextInt();
    System.out.println("Enter the second number: ");
    int num2 = scanner.nextInt();
    System.out.println("Enter the third number: ");
    int num3 = scanner.nextInt();

    // Ask the user for the starting and ending values for the multiplication tables
    System.out.println("Enter the starting value: ");
    int start = scanner.nextInt();
    System.out.println("Enter the ending value: ");
    int end = scanner.nextInt();

    // Print the multiplication tables
    for (int i = start; i <= end; i++) {
      System.out.println(num1 + " x " + i + " = " + num1 * i);
      System.out.println(num2 + " x " + i + " = " + num2 * i);
      System.out.println(num3 + " x " + i + " = " + num3 * i);
    }
  }
}
