public class Tasksheet120 {
    public static int cumulativeSum(int... numbers) {
        int totalSum = 0;

        for (int number : numbers) {
            int cumulative = 0;

            for (int i = 1; i <= number; i++) {
                cumulative += i;
            }
            System.out.println("Cumulative sum for " + number + ": " + cumulative);
            totalSum += cumulative;
        }
        return totalSum;  // Return the total sum of all cumulative sums
    }
    public static void main(String[] args) {
        // Example parameters (4, 5, 10)
        int total = cumulativeSum(4, 5, 10);

        // Print the total sum of all cumulative sums
        System.out.println("Total cumulative sum: " + total);
    }
}
