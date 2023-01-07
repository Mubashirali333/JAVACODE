
import java.util.Arrays;
import java.util.Scanner;

//5. Write a program to enter student information like (studentid, name, fathername, marks of 5 
//subjects). then it calculate its obtained marks, percentage and grade. 
//Finally it displays all information (studentid, name, fathername, marks of 5 subjects, obtained marks, 
//percentage and grade.
/**
 *
 * @author MR
 */
public class Program5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Prompt the user to enter student information
        System.out.println("Enter student id:");
        int studentId = scan.nextInt();
        scan.nextLine(); // consume the newline character
        System.out.println("Enter student name:");
        String studentName = scan.nextLine();
        System.out.println("Enter student father's name:");
        String studentFatherName = scan.nextLine();
        System.out.println("Enter marks for 5 subjects:");
        int[] marks = new int[5];
        int obtainedMarks = 0;
        for (int i = 0; i < 5; i++) {
            marks[i] = scan.nextInt();
            obtainedMarks += marks[i];
        }

        // Calculate percentage
        double percentage = (double) obtainedMarks / 500 * 100;

        // Determine grade based on percentage
        String grade;
        if (percentage >= 80) {
            grade = "A+";
        } else if (percentage >= 70) {
            grade = "A";
        } else if (percentage >= 60) {
            grade = "B";
        } else if (percentage >= 50) {
            grade = "C";
        } else {
            grade = "F";
        }

        // Print student information
        System.out.println("Student id: " + studentId);
        System.out.println("Student name: " + studentName);
        System.out.println("Student father's name: " + studentFatherName);
        System.out.println("Marks for 5 subjects: " + Arrays.toString(marks));
        System.out.println("Obtained marks: " + obtainedMarks);
        System.out.println("Percentage: " + percentage);
        System.out.println("Grade: " + grade);
    }
}
