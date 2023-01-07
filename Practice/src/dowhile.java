
import java.util.Scanner;

/**
 *
 * @author MR
 */
public class dowhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
    int i=0;
    String inp;
    do{
        System.out.println("Hello");
        System.out.println("Do you program again ");
        inp = input.nextLine();
               
    }while (!(inp.equals ("N")));
    
    }
    
}
