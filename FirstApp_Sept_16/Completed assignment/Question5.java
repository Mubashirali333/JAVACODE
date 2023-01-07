import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		int Maths,Eng,Urdu,Phy,Chem,Bio,total,perc,marks;
		int totalmarks;
		totalmarks=600;
		 System.out.print("Enter your math marks : ");
		Maths= input.nextInt();
		System.out.print("Enter your Eng marks : ");
		Eng  = input.nextInt();
		System.out.print("Enter your Urdu marks : ");
		Urdu  = input.nextInt();
		System.out.print("Enter your Phy marks : ");
		Phy  = input.nextInt();
		System.out.print("Enter your Chem marks : ");
		Chem  = input.nextInt();
		System.out.print("Enter your Bio marks : ");
		Bio  = input.nextInt();
		
		total = (Maths + Eng + Urdu + Phy + Chem + Bio);
		perc=total*100/totalmarks;
        System.out.println("Percentage : " + perc +"%");
		// here calculate your grade
		  if (perc >=80)
            System.out.println("Grade : A1");
        
        
        else if (perc >=70){
        System.out.println("Grade : A");}
        
        else if (perc >=60){
        System.out.println("Grade : B");}
        
        else if (perc >=50){
        System.out.println("Grade : C");}
        
        else if (perc >=40){
        System.out.println("Grade : D");}
        
        else 
        System.out.println("Grade : Fail");
        }
}