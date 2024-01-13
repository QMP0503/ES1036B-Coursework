package Q1;
import java.util.Scanner;
/*
Quang Pham
Student Number: 251271238
Thu, Feb 19, 2023
This program finds the area, diameter and circumference of a circle.
 */
public class CircleInfoQuang {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Circle c = new Circle();
        myHeader(2,1, "Calculate and display the area, circumference and diameter of a circle.");
        //input information for my header
        System.out.print("Enter the radius: ");
        //prompt user to input radius
        double rad = input.nextDouble();
        //declaring variable for radius
        c.setRadius(rad);
        //calling circle method class
        System.out.printf("\nCircle info:\n" +
                "Radius: %.3f cm\n"+
                "Area: %.3f sq-cm\n"+
                "Diameter: %.3f cm\n"+
                "Circumference: %.3f cm\n",
                c.getRadius(),c.getArea(),c.getDiameter(),c.getCircumference());
        //Print calculated values for circle dimensions using circle method
        myFooter(1);
        //Information for my footer
    }
    public static void myHeader(int labNum, int questionNum, String description) {
        System.out.println("****************************************************\n" +
                "Full Name: Quang Pham\n" +
                "Lab Assignment: " + labNum + " ,Question: " + questionNum);
        System.out.println("Program Description: " + description);
        System.out.println("*****************************************************");
    }//Print full name, lab exercise, question number and program description
    public static void myFooter(int questionNumber){
        System.out.println("\n*** Signing off from Question " + questionNumber + " - Quang ***");
        //print footer with question number
    }
}



