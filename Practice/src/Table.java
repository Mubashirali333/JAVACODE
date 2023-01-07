
/**
 *
 * @author MR
 */
import java.util.Scanner;

public class Table {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter table : ");
        int table = input.nextInt();
     
        for (int i=1;i<10;i++){
            System.out.println(table+"X"+i+i*2);
    }
    }

}
