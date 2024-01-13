package Q1;

public class Circle {
    public double radius; //declaring variable type for radius
    public void setRadius(double rad){
        radius=rad; //Set variable for radius
    }
    public double getRadius(){
        return radius;
    } //return value for radius inputted by user
    public double getArea(){
        return Math.PI*Math.pow(radius,2);
    } //calculate area of circle
    public double getDiameter(){
        return radius*2;
    } //Calculate diameter
    public double getCircumference(){
        return 2*Math.PI*radius;
    } //Calculate circumference

}
