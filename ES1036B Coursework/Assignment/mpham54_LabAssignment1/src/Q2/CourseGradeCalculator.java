package Q2;

import java.util.Scanner;
/*
Quang Pham
Student Number: 251271238
Sat, Jan 28, 2023
I am writing a program to find the course grade three differently weighted grade in that course.
 */
public class CourseGradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // preparing Scanner type reference to accept input for user
        final double GRD1_WGT = 0.2; //final double because it is a constant and should not be changed
        final double GRD2_WGT = 0.3;
        final double GRD3_WGT = 0.5;
        // declaring constant for grade weights
        System.out.println(
                "****************************************************\n" +
                "Full Name: Quang Pham\n" +
                "Student number: 251271238\n" +
                "Date: Jan 28, 2023\n" +
                "Brief description of task: Calculate the final course grade of student.\n" +
                "*****************************************************\n"); // Printing introduction and brief description of task
        System.out.print("Input the first grade: ");
        double grade1 = input.nextDouble();
        System.out.print("Input the second grade: ");
        double grade2 = input.nextDouble();
        System.out.print("Input the third grade: ");
        double grade3 = input.nextDouble();
        // prompts user to input all three grades and all three grades are assigned double type variables

        double finalGrade = grade1*GRD1_WGT + grade2*GRD2_WGT + grade3*GRD3_WGT; // calculate final grade

        System.out.printf("\nThe course grade is: %.2f\n" +
                "*****************************************************",
                finalGrade); // print final grade

    }
}
