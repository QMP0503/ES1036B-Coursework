package Q2;
import Q1.MethodDemo;
/*
Quang Pham
Student Number: 251271238
Thu, Feb 28, 2023
This program simulates a small talk scenario where two people talk about the temperature.
 */
import java.util.Queue;
import java.util.Scanner;

public class SmallTalk {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); // Declaring input
        Q1.MethodDemo.myHeader(1,2,"Program generate small talk about temperature.");
        // Print intro for question 2
        System.out.print("\nWhat is the outdoor temperature now? ");
        //Prompt user to input outdoor temperature
        double tempC1 = input.nextDouble();
        System.out.printf("\tI know you're used to Fahrenheit scale. %.2f deg-C is %.2f deg-F.",
                tempC1, celsiusToFahrenheit(tempC1));
        //Covert given temperature from Celsius to Fahrenheit
        System.out.print("\nI am cold! What is the indoor temperature? ");
        //Prompt user to input indoor temperature
        double tempC2 = input.nextDouble();
        System.out.printf("\t%.2f deg-C is %.2f deg-F.\n", tempC2, celsiusToFahrenheit(tempC2));
        //Convert Celsius to Fahrenheit
        System.out.print("I see. Would you crank up the temperature?" +
                "\n\tOk I'll! What temperature should I set the thermostat to? ");
        //Prompt user to enter new thermostat temperature
        double tempF1 = input.nextDouble();
        System.out.printf("\tOh, you mean %.2f Fahrenheit! Here you go.", tempF1);
        System.out.printf("\n\tBy the way, %.2f deg-F is %.2f deg-C.", tempF1, fahrenheitToCelsius(tempF1));
        //Convert Fahrenheit to Celsius
        System.out.println("\nThank you! It is very nice of you.");
        Q1.MethodDemo.myFooter(2);
        // Print outro for question 2
    }
    public static double celsiusToFahrenheit(double celsius){
        return 9*(celsius/5) + 32;
        //Method to convert Celsius to Fahrenheit
    }
    public static double fahrenheitToCelsius (double fahrenheit){
        return 5*(fahrenheit-32)/9;
        //Method to convert Fahrenheit to Celsius
    }
}
