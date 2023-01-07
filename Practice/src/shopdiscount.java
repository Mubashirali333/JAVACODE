
/**
 *
 * @author MR
 */
//3. A shop will give discount of 10% if the cost of purchased quantity is more than 1000.Ask user for quantity,Suppose, one unit will cost 100.Judge and print total cost for user.
import java.util.Scanner;

public class shopdiscount {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        System.out.println("Enter quantity : ");
//        int pur = input.nextInt();
//        if (pur > 1000) {
//            int dis = pur / 10;
//            System.out.println("Discount is " + dis);
//            System.out.println("Total is " + (pur - dis));
//        }
        System.out.println("Enter quantity : ");
        int pur = input.nextInt();
        if (pur > 1000) {
            int dis = pur / 10;
            System.out.println(dis);
            System.out.println("Total is " + (pur - dis));
            
        }
    }
}
