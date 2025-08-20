import java.util.Scanner;

public class simpleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String again = "y";

        while (again.equalsIgnoreCase("y")) {
            System.out.print("Enter first number: ");
            double x = input.nextDouble();

            System.out.print("Enter second number: ");
            double y = input.nextDouble();

            System.out.print("Please enter the operation (+, -, *, /): ");
            char operation = input.next().charAt(0);

            double result = 0;
            boolean valid = true;

            if (operation == '+') {
                System.out.println("Result: " + (x + y));
            } else if (operation == '-') {
                System.err.println("Result: " + (x - y));
            } else if (operation == '*') {
                System.err.println("Result: " + (x * y));
            } else if (operation == '/') {
                if (y != 0) {
                    System.err.println("Result: " + (x / y));
                } else {
                    System.out.println("Cannot divide by zero.");
                }
            } else {
                System.out.println("Invalid operator");
            }

            System.out.print("Do you want to calculate again? (y/n): ");
            again = input.next();
        }
        System.out.println("Thank you for using the calculator.");

    }
}
