
import java.util.Scanner;

/*
Write a program to enter student information like (studentid, name, fathername, marks of 5 
subjects), then it calculate its obtained marks, percentage and grade.
Finally it displays all information (studentid, name, fathername, marks of 5 subjects, obtained marks, 
percentage and grade
 */
/**
 *
 * @author MR
 */
public class NewTask5 {

    public static void main(String[] args) {

        int obj = 0;
        float per = 0.0f;
        String Grade = null;
        Scanner input = new Scanner(System.in);

        String ms[] = new String[11];

        for (int i = 0; i < 8; i++) {
            if (i < 3) {
                System.out.print("Enter student : ");
                ms[i] = input.nextLine();
            } else {
                System.out.print("Enter marks : ");
                ms[i] = input.nextLine();
                obj += Integer.parseInt(ms[i]);
            }
            ms[8] = String.valueOf(obj);
        }
        per = obj / 5;
        ms[9] = String.valueOf(per);
        if (per > 90) {
            Grade = "A1";
        } else if (per > 70) {
            Grade = "B";
        } else if (per > 50) {
            Grade = "C";
        } else {
            Grade = "Fail";
        }
        ms[10] = Grade;
        for (int i = 0; i < 11; i++) {
            if (i < 3) {
                System.out.println("\n  \t Student info is \n \t " + ms[i]);
            }
        }
            System.out.println("Percentage is  " + ms[9]);
            System.out.println("Grade is  " + ms[10]);


    }

}
