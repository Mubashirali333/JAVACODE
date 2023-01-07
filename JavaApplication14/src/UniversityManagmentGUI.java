/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MR
 */
import javax.swing.*;
import java.awt.*;

public class UniversityManagmentGUI {

    public static void main(String[] args) {
        // Create the main window frame
        JFrame frame = new JFrame("University Management System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        // Create a panel for the student admissions form
        JPanel studentAdmissionsPanel = new JPanel();
        studentAdmissionsPanel.setLayout(new BoxLayout(studentAdmissionsPanel, BoxLayout.Y_AXIS));

        // Add fields for the student's name and major
        JTextField studentNameField = new JTextField();
        JTextField studentMajorField = new JTextField();
        studentAdmissionsPanel.add(new JLabel("Student Name:"));
        studentAdmissionsPanel.add(studentNameField);
        studentAdmissionsPanel.add(new JLabel("Student Major:"));
        studentAdmissionsPanel.add(studentMajorField);

        // Add a button to submit the student admissions form
        JButton submitStudentButton = new JButton("Submit");
        studentAdmissionsPanel.add(submitStudentButton);

        // Add the student admissions panel to the main frame
        frame.add(studentAdmissionsPanel, BorderLayout.NORTH);

        // Show the main window frame
        frame.setVisible(true);
    }
}
