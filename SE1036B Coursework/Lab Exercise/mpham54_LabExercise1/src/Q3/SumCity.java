package Q3;
import Q1.MethodDemo;
import java.util.Scanner;
/*
Quang Pham
Student Number: 251271238
Thu, Feb 28, 2023
This program finds the sum of real number vales, characters using the ASCII chart and prints out your name.
 */
public class SumCity {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Q1.MethodDemo.myHeader(1,3,"Find sum value of real number, characters and state full name.");
        //Print intro to question 3
        System.out.print("Enter a real number: ");
        //Prompt user to enter a real number
        double num1 = input.nextDouble();
        System.out.print("Enter a second real number: ");
        //Prompt user to enter a second real number
        double num2 = input.nextDouble();
        System.out.printf("The sum of %.2f and %.2f is %.2f\n", num1, num2, sumValues(num1,num2));
        //Print out the value of the sum of the first and second number
        System.out.print("\nEnter a character: ");
        //Prompt user to enter a character
        char char1 = input.next().charAt(1);
        //Not nextChar() for java scanner class so char(0) remove unwanted character and next() stores it.
        System.out.print("Enter a second character: ");
        //Prompt user to enter second character
        char char2 = input.next().charAt(0);
        System.out.printf("The sum of %c and %c is %c, whose equivalent integer value is %d.\n",
                char1, char2, sumValues(char1, char2), (int)sumValues(char1,char2));
        //Print out the sum of two characters when converted to ASCII in its character and integer form
        System.out.print("\nEnter your full name: ");
        //Prompt user to enter full name
        input.nextLine(); // Clear input for scanner
        String name = input.nextLine();//Accepts full name
        System.out.printf("%s\n", sumValues("My name is ", name));//Print user's name
        Q1.MethodDemo.myFooter(3);//Signing off from question 3

    }
    public static String sumValues(String str1, String str2){
        return str1 + str2; //Add name in str1 and str2
    }
    public static double sumValues(double num1, double num2){
        return num1 + num2; // Add num1 and num2
    }
    public static char sumValues(char char1, char char2){
        return (char)(char1 + char2);
        //single quote character constant is int, thus the data type have to be redefined
        //char1 and char2 is converted into ASCII integer values and add those values together
    }
}
