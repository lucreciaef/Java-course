package chapter3;
import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {

        //Initialize known values
        int payment = 1000;
        int bonus = 250;
        int quota = 10;

        // Get values for the unknown
        System.out.println("How many sales?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        //If for bonus
        if(sales >= quota){
            payment = payment + bonus;
        }

        //Output
        System.out.println(("The salary is "+payment));
    }
}
