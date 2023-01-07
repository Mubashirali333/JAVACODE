
/**
 *
 * @author MR
 */
import java.util.Scanner;

public class schoolgrade {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String grade;
        System.out.println("Enter name : ");
        String name = input.nextLine();
        System.out.print("Enter father name : ");
        String fname = input.nextLine();
        System.out.print("Enter roll no : ");
        int roll = input.nextInt();
        System.out.print("Enter math marks : ");
        int math = input.nextInt();
        System.out.print("Enter english marks : ");
        int eng = input.nextInt();
        System.out.print("Enter urdu marks : ");
        int urdu = input.nextInt();
        System.out.print("Enter physics marks : ");
        int phy = input.nextInt();
        System.out.print("Enter chem marks : ");
        int chem = input.nextInt();

        int obt = math + urdu + eng + phy + chem;
        int perc = obt / 5;

        ///////////////////////////////////////////////////
        System.out.println("\t Student Details");
        System.out.println("Name is " + name);
        System.out.println("Father Name is " + fname);
        System.out.println("Roll no is " + roll);
        System.out.println("Percentage is " + perc + "%");
        if (perc > 90) {
            grade = "A";
        } else if (perc > 60) {
            grade = "B";
        } else if (perc > 30) {
            grade = "C";
        } else {
            grade = "Fail";
        }
        System.out.println("Grade is " + grade);

    }
}
