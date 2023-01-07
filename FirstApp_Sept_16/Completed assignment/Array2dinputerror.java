import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in); 
		int i, j;
		int[][] numbers=new int[3][5];
		 for(i=0; i<numbers.length; i++)
		{
			System.out.print("Enter the value"+i);
		for( j=0; j<numbers[i].length; j++)
		{
		
		System.out.println("Value at numbers[" + i + "][" + j + "] : " );
		 numbers[i][j]=input.nextInt();
		}
		
		}
		
		
	}
}