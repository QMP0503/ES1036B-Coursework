package Q1;
import java.util.Scanner;
/*
Quang Pham
Student Number: 251271238
Thu, Jan 28, 2023
This program convert your height from cm to inches.
 */
public class MethodDemo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        myHeader(1,1, "Converts height from cm to inches.");
        //Header introduction with method parameter
        System.out.print("\nEnter your height in cm: ");
        //Prompt user to input height
        double height = input.nextDouble();
        //get value for cm
        System.out.printf("%.2f cm = %.2f inches\n",
                height, cmToInchConverter(height));
        // Print height in cm and the cm to inch conversion
        System.out.printf("%.2f inches = %d ft %.2f inch\n",
                cmToInchConverter(height),(int)cmToInchConverter(height)/12,cmToInchConverter(height)%12);
        // Print inches and it's conversion to ft and inch
        myFooter(1);
        // Print outro and first name
    }
    public static void myHeader(int labNum, int questionNum, String description){
        System.out.println("****************************************************\n" +
                "Full Name: Quang Pham\n" +
                "Lab Exercise: " + labNum + " ,Question: " + questionNum);
        System.out.println("Program Description: " + description);
        System.out.println("*****************************************************");
        //Print full name, lab exercise, question number and program description
    }
    public static double cmToInchConverter(double cm){
        return cm/2.54; //convert cm to inches
    }

    public static void myFooter(int questionNumber){
        System.out.println("\n*** Signing off from Question " + questionNumber + " - Quang ***");
    }

}
