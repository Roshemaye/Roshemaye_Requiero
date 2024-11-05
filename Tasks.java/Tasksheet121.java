import static java.lang.Math.addExact;
import static java.lang.Math.subtractExact;
import static java.lang.Math.multiplyExact;
import static java.lang.Math.floorDiv;

public class Tasksheet121 {
    public static int addition(int a, int b) {
        return addExact(a, b);
    }
    public static int subtraction(int a, int b) {
        return subtractExact(a, b);
    }
    public static int multiplication(int a, int b) {
        return multiplyExact(a, b);
    }
    public static int division(int a, int b) {
        return floorDiv(a, b);
    }
    public static void main(String[] args) {
        int a = 15;
        int b = 3;

        System.out.println("Addition of " + a + " and " + b + " is: " + addition(a, b));
        System.out.println("Subtraction of " + a + " and " + b + " is: " + subtraction(a, b));
        System.out.println("Multiplication of " + a + " and " + b + " is: " + multiplication(a, b));
        System.out.println("Division of " + a + " by " + b + " is: " + division(a, b));
    }
}
