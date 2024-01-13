package Q2;

public class ComplexNumber {
    private double real;
    private double imaginary;
    //initiate variable
    public ComplexNumber(){
        real=0;
        imaginary=0;
    }//assign 0 to value
    public ComplexNumber(double re, double im){
        real=re;
        imaginary=im;
    }//assign variable with given arguments
    public double getReal(){
        return real;
    }//Return real number
    public double getImaginary(){
        return imaginary;
    }// Return imaginary number
    public double getMagnitude(){
        return Math.sqrt(Math.pow(real,2)+Math.pow(imaginary,2));
    } //return magnitude of complex number
    public double getAngle(){
        return Math.toDegrees(Math.atan2(imaginary,real));
    }//return angle of complex number
    public void displayRecForm() {
        System.out.printf("%.2f", real);

        if (imaginary >= 0)
            System.out.print(" + ");
        else
            System.out.print(" - ");

        System.out.printf("%.2fi", Math.abs(imaginary));
    }//reformat to make imaginary value to absolute value.
}
