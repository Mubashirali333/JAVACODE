import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numbers [] = new int [5];
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];


			System.out.print("Enter the value for [" + i + "] : ");
			numbers[i] = input.nextInt();
		}
		System.out.println("/n/nArraysvalues");
		for (int i = 0; i < numbers.length; i++)
			System.out.println("value for arrays[" + i + "] is : " + numbers[i]);
		System.out.print("Sum" + sum);


	}
}