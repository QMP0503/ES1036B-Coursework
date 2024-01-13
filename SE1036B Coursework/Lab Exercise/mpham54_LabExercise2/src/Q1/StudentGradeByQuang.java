package Q1;
import  Q1.Student;
import java.util.Scanner;
/*
Quang Pham
Student Number: 251271238
Thu, Feb 19, 2023
This program assign student letter grades and display student information
 */
public class StudentGradeByQuang {
    public static Scanner input = new Scanner(System.in); //allow input form computer to be accepted
    public static int counter=0; //initialize counter with 0
    public static void main(String[] args){
        myHeader(2,1,"Display student information and assign letter grade to score.");
        //Display introduction header
        Student s1 = new Student(); //New student type variable s1
        System.out.println("Here is my grade-info: ");//Display student information
        s1.printInfo();//default value from Student class

        System.out.println("\nData entry follows.....\n");//Display text for formatting
        Student s2 = new Student(); //New student type variable s2
        dataEntry(s1);//Enter new student information to s1 variable
        System.out.println();//Spacer
        dataEntry(s2);//Enter new student information to s2 variable

        System.out.println("\nHere is the detail info..");
        System.out.printf("%-20s %-20s Score (Letter Grade)\n","Name", "Student Number");
        System.out.println("---------------------------------------------------------------");
        s1.printInfo();
        s2.printInfo();
        System.out.println("---------------------------------------------------------------");
        //Prints out student 1 and student 2's detailed information given the updated inputs from user

        if (compareGrade(s1,s2)==1)
            System.out.print("Note: "+s1.getName()+" scored higher than "+s2.getName()+".");
        else if (compareGrade(s1,s2)==-1)
            System.out.print("Note: "+s2.getName()+" scored higher than "+s1.getName()+".");
        else
            System.out.print("Their scores are equal!");
        //Compare student grade from inputted value
        myFooter(1); //Footer for question one and sign off message
    }
    public static void dataEntry(Student s){
        counter++; //Every time data entry called, counter go up by one
        System.out.println("Student "+ counter +":");
        System.out.print("Enter Student Number: ");//prompts user input
        int studentNum = input.nextInt();//accepts input
        System.out.print("Enter Student's full Name: ");//prompts user input
        input.nextLine();//clears input
        String studentName = input.nextLine();//accept user input
        System.out.print("Enter "+studentName+"'s score: ");//prompt user input
        int studentScore = input.nextInt();//accepts user input
        s.setStudentNumber(studentNum);//assign new value for student method
        s.setName(studentName);//assign new value for student method
        s.setScore(studentScore);//assign new value for student method
    }//update student value from user input
    public static int compareGrade(Student s1, Student s2){
        if(s1.getScore()>s2.getScore())
            return 1;
        else if(s1.getScore()<s2.getScore())
            return -1;
        else
            return 0;
    }//compare score between two student and assign value depending on outcome.
    public static void myHeader(int labNum, int questionNum, String description) {
        System.out.println("****************************************************\n" +
                "Full Name: Quang Pham\n" +
                "Lab Exercise: " + labNum + " ,Question: " + questionNum);
        System.out.println("Program Description: " + description);
        System.out.println("*****************************************************");
    }//Print full name, lab exercise, question number and program description
    public static void myFooter(int questionNumber){
        System.out.println("\n*** Signing off from Question " + questionNumber + " - Quang ***");
        //print footer with question number
    }
}
