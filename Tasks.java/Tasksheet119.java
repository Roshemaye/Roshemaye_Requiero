import java.util.Scanner;

public class Tasksheet119 {
    public static int add(int a, int b){
        return a + b; 
    }
    public static int subtract(int a, int b){
        return a - b; 
    }
    public static int multiply(int a, int b){
        return a * b; 
    }
    public static int divide(int a, int b){
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return 0;
        }
        else{
            return (int) a/b;
        } 
        }
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        int sum = add(num1, num2);
        int difference = subtract(num1, num2);
        int product = multiply(num1, num2);
        double quotient = divide(num1, num2);

        System.out.println("Results:");
        System.out.println("Addition: " + sum);
        System.out.println("Subtraction: " + difference);
        System.out.println("Multiplication: " + product);
        if (num2 != 0) {
            System.out.println("Division: " + quotient);
        }

       
        scanner.close();
    }

}
    
