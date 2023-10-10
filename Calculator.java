import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number");
        double num1 = input.nextDouble();
        System.out.println("Enter the operator ");
        char operator = input.next().charAt(0);
        System.out.println("Enter the second number");
        double num2 = input.nextDouble();
        double result;
        if (operator == '+') {
            result = num1 + num2;
        } else if (operator == '-') {
            result = num1 - num2;
        } else if (operator == '*') {
            result = num1 * num2;
        } else if (operator == '/') {
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                System.out.println("Error: Division by zero is not allowed.");
                return;
            }
        } else {
            System.out.println("Error: Invalid operator.");
            return;
        }

        // Print the result
        System.out.println("Result: " + result);

    }
}
