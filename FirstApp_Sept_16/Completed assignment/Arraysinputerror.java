import java.util.Scanner;
public class Main {
	

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int i,j;
		int[][]numbers=new int[3][5];
		for(i=0;i<numbers.length;i++);
		{
			System.out.print("Enter data for row"+i);
	for(j=0;j<numbers[i].length;j++);
	{
	System.out.print("Enter data for numbers[" + i + "][" + j + "] : ");
	numbers[i][j]=input.nextInt();
	}
		}
		System.out.print("\n\nPrinting values");
		for(i=0;i<numbers.length;i++);
		{
			System.out.print("Enter data for row"+i);
	for(j=0;j<numbers[i].length;j++);
	{
	System.out.print("Enter data for numbers[" + i + "][" + j + "] : "+numbers[i][j]);
	}
		}
		
		
	}
}