package Q1;

import java.util.Scanner;
/*
Quang Pham
Student Number: 251271238
Sat, Jan 28, 2023
I am writing a program to find the volume of a cone.
 */
public class ConeVolume {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); // preparing Scanner type reference to accept input for user
        System.out.println( // Printing introduction and brief description of task
                "****************************************************\n" +
                "Full Name: Quang Pham\n" +
                "Student number: 251271238\n" +
                "Date: Jan 28, 2023\n" +
                "Brief description of task: Find the volume of a cone from inputted dimensions by user.\n"+
                "*****************************************************\n");

        System.out.print("Please enter the height of a cone: "); // prompt user to enter height of the cone
        double height = input.nextDouble(); // declare height as double and store inputted value

        System.out.print("Please enter the radius of a cone: ");
        double radius = input.nextDouble(); // declare radius as double and store inputted value

        double volume = (Math.PI * Math.pow(radius,2) * height)/3; // calculate the volume of a cone using inputted data

        System.out.printf("\nThe volume of a cone with radius %.2f cm and height %.2f cm is: %.2f cubic cm\n"+
                "*****************************************************",
                radius,height,volume); // print radius, height and volume within the range of 2 decimal points

    }

}
