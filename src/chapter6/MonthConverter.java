package chapter6;

public class MonthConverter {
    public static void main(String[] args) {

        //Not needed to instantiate Month class because the methods are static
        //Only need to call the method with the class name and the dot
        System.out.println(Month.getMonth(7));
        System.out.println(Month.getMonth("July"));
    }
}
