package chapter6;

public class Rectangle {
    //Global variables are called fields
    private double length;
    private double width;

    //Default constructor has the same name as the class and no parameters
    //Initializes with default values
    public Rectangle(){
        length = 0;
        width = 0;
    }

    //Constructor with initial values passed as parameters
    public Rectangle(double lengthValue, double widthValue){
        setLength(lengthValue); //reusing method below
        setWidth(widthValue);
    }

    //Create methods to get and edit the values of the fields for a specific instance of Rectangle
    public double getLength(){
        return length;
    }
    public void setLength(double lengthValue){
        this.length = lengthValue;
    }

    public double getWidth(){
        return width;
    }
    public void setWidth(double widthValue){
        this.width = widthValue;
    }

    //Actions that can be done with a Rectangle
    public double calculatePerimeter(){
        return (2* length) + (2*width);
    }
    public double calculateArea(){
        return length * width;
    }

}
