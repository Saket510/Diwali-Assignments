package study;
import study.Calculator;
import study.WrongOperator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choice;
        do {
            System.out.print("Enter 1st number: ");
            int num1 = sc.nextInt();

            System.out.print("Enter 2nd number: ");
            int num2 = sc.nextInt();

            System.out.print("Enter operator (+, -, *, /, %): ");
            String operator = sc.next();

            try {
                int result = Calculator.calculate(num1, num2, operator);
                System.out.println("Result: " + result);
            } 
            catch (WrongOperator e) {
                System.out.println("Error: " + e.getMessage());
            } 
            catch (ArithmeticException e) {
                System.out.println("Math Error: " + e.getMessage());
            }


        } while (true);
    }
}
