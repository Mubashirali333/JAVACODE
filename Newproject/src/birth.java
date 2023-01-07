
import java.util.Scanner;

public class birth {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int curryear = 2022;
        System.out.print("Enter birth year :");
        int bdyear = input.nextInt();
        int result = curryear - bdyear;
        System.out.println("Your age is " + result);
    }
}
