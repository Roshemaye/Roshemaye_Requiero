import java.util.InputMismatchException;
import java.util.Scanner;

public class Tasksheet130 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Enter the first number: ");
            int num1 = scanner.nextInt();
            
            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();
            
            int result = num1 / num2;  // This line may throw ArithmeticException
            System.out.println("Result: " + result);
            
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid integer.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred.");
        } finally {
            scanner.close();
        }
    }
}