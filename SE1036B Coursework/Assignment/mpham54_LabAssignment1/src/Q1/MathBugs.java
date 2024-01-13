package Q1;

import java.util.Scanner;
/*
Quang Pham
Student Number: 251271238
Sat, Jan 28, 2023
I am writing a program which prompts users to input a four-digit number without any zero and find its RMS
 */
public class MathBugs {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); // preparing Scanner type reference to accept input for user
        System.out.println( // Printing introduction and brief description of task
                "****************************************************\n" +
                "Full Name: Quang Pham\n" +
                "Student number: 251271238\n" +
                "Date: Jan 28, 2023\n" +
                "Brief description of task: Find root-mean-square value of four digit number with no zeros identify the place values of the number.\n"+
                "*****************************************************");

        System.out.print("Enter a 4-digit number:"); // prompt user to enter 4 digit number
        int number = input.nextInt(); // declares number as int and stores number user entered
        int thousandthDigit = number/1000; // find thousandth digit for number user entered
        int hundredthDigit = (number%1000)/100; //find hundredth digit for number user entered
        int tenthDigit = (number%100)/10; // find tenth digit for number user entered
        int onesDigit = number%10; // find ones digit for number user entered

        double RMS = Math.sqrt((Math.pow(thousandthDigit,2)+ Math.pow(hundredthDigit,2)+ Math.pow(tenthDigit,2)+ Math.pow(onesDigit,2))/4);
        // Calculate RMS value of inputted number

        System.out.printf(
                "Thousands Digit: %d \n" +
                "Hundreds Digit: %d \n" +
                "Tens Digit: %d \n" +
                "Ones Digit: %d \n" +
                "The RMS value of the four digits is: %.2f\n"+
                "*****************************************************",
                thousandthDigit, hundredthDigit, tenthDigit, onesDigit, RMS); // display calculated number and other processed data
    }
}
