package chapter6;

//Classes in the same package do not need to be imported, such as Rectangle
import java.util.Scanner;

public class HomeAreaCalculatorRedo {
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        HomeAreaCalculatorRedo calculator = new HomeAreaCalculatorRedo();
        Rectangle kitchen = calculator.getRoom();
        Rectangle bathroom = calculator.getRoom();

        double area = calculator.calculateTotalArea(kitchen, bathroom);

        System.out.println("The total area is: "+area);
        calculator.scanner.close();
    }

    public Rectangle getRoom() {

        System.out.println("Enter the length of your room:");
        double length = scanner.nextDouble();
        System.out.println("Enter the width of your room:");
        double width = scanner.nextDouble();

        //version 1, although wasteful to create an obj that isn't used
        //Rectangle room = new Rectangle(length, width);
        //return room;

        //version2, more compact
        return new Rectangle(length, width);
    }

    public double calculateTotalArea(Rectangle rectangle1, Rectangle rectangle2) {
        return rectangle1.calculateArea() + rectangle2.calculateArea();
    }
}
