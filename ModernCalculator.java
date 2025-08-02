import java.util.Scanner;

public class ModernCalculator {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter first number:");
            double num1 = scanner.nextDouble();

            System.out.println("Enter operator (+, -, *, /):");
            String op = scanner.next();

            System.out.println("Enter second number:");
            double num2 = scanner.nextDouble();

            double result = switch (op) {
                case "+" -> num1 + num2;
                case "-" -> num1 - num2;
                case "*" -> num1 * num2;
                case "/" -> {
                    if (num2 == 0) {
                        System.out.println("❌ Cannot divide by zero.");
                        yield 0;
                    }
                    yield num1 / num2;
                }
                default -> {
                    System.out.println("❌ Invalid operator.");
                    yield 0;
                }
            };

            System.out.println("Result = " + result);
        }
    }
}
