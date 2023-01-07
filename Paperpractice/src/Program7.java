

import java.util.Scanner;

//7. Write a calulator program using switch case statement.
/**
 *
 * @author MR
 */
public class Program7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter number : ");
        int num2 = sc.nextInt();
        System.out.println("Enter operation \n 1:Addition \n 2:Substraction \n 3:Multiplication \n 4:Division");
        int op = sc.nextInt();
        
        switch(op){
            case 1 ->System.out.println("Addition is "+(num1+num2));
            case 2 -> System.out.println("Sub "+(num1-num2));
            case 3 ->System.out.println("mul "+(num1*num2));
            case 4 -> System.out.println("divide "+(num1/num2));
        }
    }

}
