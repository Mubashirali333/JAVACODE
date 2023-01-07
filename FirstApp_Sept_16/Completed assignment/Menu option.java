import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int op;
		int num1,num2;
		System.out.print("Select an option :");
		op= input.nextInt();
		if(op==1)
		System.out.print("Enter first number :");
		num1=input.nextInt();

System.out.print("Enter second number :");
       num2 =input.nextInt();
       System.out.println(num1+num2);
       
       else if(op==2)
		System.out.print("Enter first number :");
		num1=input.nextInt();

System.out.print("Enter first number :");
       num2 =input.nextInt();
       System.out.println(num1+num2);
       
       else if(op==3)
		System.out.print("Enter first number :");
		num1=input.nextInt();

System.out.print("Enter first number :");
       num2 =input.nextInt();
       System.out.println(num1-num2);
       
       else if(op==4)
		System.out.print("Enter first number :");
		num1=input.nextInt();

System.out.print("Enter first number :");
       num2 =input.nextInt();
       System.out.println(num1/num2);
       
       else(op==5)
		System.out.print("Enter first number :");
		num1=input.nextInt();

System.out.print("Enter first number :");
       num2 =input.nextInt();
       System.out.println(num1*num2);
       

		
	}
}