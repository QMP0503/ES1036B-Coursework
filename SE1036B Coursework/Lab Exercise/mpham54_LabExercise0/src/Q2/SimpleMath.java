package Q2;
import java.util.Scanner;
public class SimpleMath //Creating a class SimpleMath.
{
    public static void main(String[] args) //Creating method main(), which is the entry point
    {
        System.out.println("""
                Hello again! THis is Quang Pham.
                Student Number: 251271238
                Date: Jan 24, 2023
                ----------------------------------
                Let's do some simple mathematical calculations.
                Converting a temperature from Celsius scale to Fahrenheit
                scale...""");
        /*
        Introduces name, student number, date of creation and state the purpose of this program using text block
         */
        double c, f; //declaring variable c and f
        Scanner input= new Scanner (System.in);// Prepares a Scanner type reference to accept input from user.
        System.out.println("Enter temperature in Celsius: "); //Prompt user to input value
        c = input.nextDouble(); //Accepts input from user assigned to c
        f = ((9*c)/5)+32; //Calculates number inputted from Celsius to Fahrenheit using conversion formula.
            System.out.println(c+" degrees Celsius is "+ f +" degree Fahrenheit!\n" + //Print out calculated value in Fahrenheit.
                    "Question 2 is successfully done!"); //Prints a concluding statement to the program.
    }
}
