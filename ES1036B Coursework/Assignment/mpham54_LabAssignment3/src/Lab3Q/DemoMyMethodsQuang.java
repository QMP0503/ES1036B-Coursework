/*
Quang Pham
Student Number: 251271238
Thu, Feb 19, 2023
This program performs mathematical calculations from MyMethod class
 */
package Lab3Q;
import java.util.Scanner;
public class DemoMyMethodsQuang {
    public static Scanner input = new Scanner(System.in);//initialize scanner
    public static void main(String[] args){
        MyMethod.myHeader(3,1,"Performs mathematical calculations depending on user input.");
        //Print header information
        System.out.println("Testing Mathematical Functions: ");
        //Print program description
        char choice; //Initialize char variable
        while (true){//True loop
            System.out.println("\n======MENU=======\n" +
                    "a: Power Function\n" +
                    "b: Factorial Function\n" +
                    "c: Sine Function\n" +
                    "d: Cosine Function\n" +
                    "e: exit\n" +
                    "==================\n");//Displays choices to the user
            System.out.print("Enter your choice: ");//Prompts user to enter a choice
            choice = MyMethod.myToLowerCase(input.next().charAt(0));//Obtains user input
            switch (choice) {//switch statement for deciding which choice to run
                case 'a':
                    System.out.println("\nPOWER FUNCTION: Calculating x to the power of y.");//Describes option's function
                    System.out.print("Enter x: ");//Prompts user input
                    double x = input.nextDouble();//Accepts user input
                    System.out.print("Enter y: ");//Prompts user input
                    int y = input.nextInt();//Accepts user input
                    System.out.printf("%.2f^" + y + " = %.2f\n", x, MyMethod.myPow(x, y));
                    break;//Exits switch
                case 'b':
                    System.out.println("\nFACTORIAL FUNCTION: Calculation factorial(n).");//Describes option's function
                    System.out.print("Enter n: ");//Prompts user input
                    int n = input.nextInt();//Accepts user input
                    while (n < 0) {
                        System.out.print("n has to be >=0; enter again: ");//Prompt user to input another value
                        n = input.nextInt();//Accepts user input
                    }
                    System.out.printf(n + "! = %.2e\n",MyMethod.myFactorial(n));//Display solution
                    break;//Exits switch
                case 'c':
                    System.out.println("\nSINE FUNCTION: Calculating sin(k) degree.");//Describes option's function
                    System.out.print("Enter k in degrees: ");//Prompts user input
                    double k = input.nextDouble();//Accept user input
                    System.out.printf("sin(%.2f) degree = %.2f\n", k, MyMethod.mySin(MyMethod.myDegreeToRadian(k)));//Display solution
                    break;//Exits switch
                case 'd':
                    System.out.println("\nCOSINE FUNCTION: Calculating cos(m) degree.");//Describes function
                    System.out.print("Enter m in degrees: ");//Prompts user input
                    double m = input.nextDouble();//Accepts user input
                    System.out.printf("cos(%.2f) degree = %.2f\n", m, MyMethod.myCos(MyMethod.myDegreeToRadian(m)));//Display solution
                    break;//Exits switch
                case 'e':
                    System.out.println(""); //spacer
                    break;//Exits switch
                default:
                    System.out.println("\nInvalid Choice!\n"); //Display when user input invalid input
                    break;//Exit switch
            }
            if(choice == 'e')
                break;//Exit while loop if user input e
        }
        MyMethod.myFooter(1);//Print closing statement
    }
}
