
/**
 *
 * @author MR
 */
//8. A student will not be allowed to sit in exam if his/her attendence is less than 75%.
//Take following input from user
//Number of classes held
//Number of classes attended.
//And print
//percentage of class attended
//Is student is allowed to sit in exam or not.
import java.util.Scanner;

public class Studentattend {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter classes held : ");
        int classheld = input.nextInt();
        System.out.print("Enter classes attend : ");
        int classattend = input.nextInt();

        int perc = (classattend * 100) / classheld;
        System.out.println("Percentage is " + perc + "%");
        if (perc < 75) {
            System.out.println("Sit in exam ");
        } else {
            System.out.println("You cant see ");
        }

    }
}
