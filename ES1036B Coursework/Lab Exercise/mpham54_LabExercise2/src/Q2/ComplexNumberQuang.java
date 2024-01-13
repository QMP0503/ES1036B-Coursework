package Q2;

import java.util.Scanner;

public class ComplexNumberQuang {
    public static Scanner input = new Scanner(System.in);//allow input form computer to be accepted
    public static void main(String[] args){
        myHeader(2,2,"This program add two complex number, find their magnitude and angle.");
        //Header information and code introduction
        ComplexNumber x = new ComplexNumber();
        x = dataEntry();
        ComplexNumber y = new ComplexNumber();
        y = dataEntry();
        //initialize new ComplexNumber type variable to assign new data input from user

        System.out.println("\nYou have entered the following two complex numbers x and y:");
        System.out.print("x = ");
        x.displayRecForm();
        //display equation x
        System.out.print("\ny = ");
        y.displayRecForm();
        //display equation y

        ComplexNumber addRes = complexAdder(x,y);
        ComplexNumber mulRes = complexMultiplier(x,y);
        //initialize new variable to be used to add and multiply complex number x and y into two new number.

        System.out.println("\n\nHere are the results of the arithmetic operations:");
        System.out.print("x + y = ");
        addRes.displayRecForm(); //Display addition results
        System.out.printf(" , Magnitude: %.2f, Angle: %.2f degrees\n",addRes.getMagnitude(),addRes.getAngle());
        //Display magnitude and angle of the number

        System.out.print("x * y = ");
        mulRes.displayRecForm(); //Display multiplication results
        System.out.printf(" , Magnitude: %.2f, Angle: %.2f degrees\n", mulRes.getMagnitude(),mulRes.getAngle());
        //Display magnitude and angle of the number

        myFooter(2);//Footer for question 2. Signing off.
    }
    public static int counter=0; //initialize counter with 0
    public static ComplexNumber dataEntry(){
        counter++;//increments counter by 1
        System.out.println("\nComplex number "+counter+" data......");
        System.out.print("Enter the real term: ");//Prompt user to input real term
        double realNum = input.nextDouble(); //accepts input
        System.out.print("Enter the imaginary term: ");//Prompt user to input imaginary term
        double imagNum = input.nextDouble();//accepts input
        return new ComplexNumber(realNum,imagNum);//Return new processed value
    }
    public static ComplexNumber complexAdder (ComplexNumber x, ComplexNumber y){
        ComplexNumber complexAdd = new ComplexNumber(x.getReal()+y.getReal(),x.getImaginary()+y.getImaginary());
        //add x and y
        return complexAdd; //Return addition value
    }
    public static ComplexNumber complexMultiplier (ComplexNumber x, ComplexNumber y){
        ComplexNumber complexMulti = new ComplexNumber(x.getReal()*y.getReal()-x.getImaginary()*y.getImaginary(),x.getImaginary()*y.getReal()+x.getReal()*y.getImaginary());
        //multiply x and y
        return complexMulti;//return multiplication results
    }
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
