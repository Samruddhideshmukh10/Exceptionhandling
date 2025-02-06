import java.util.Scanner;

public class AverageCalculator {
    public static double average(String[] numbers) throws NullPointerException, NumberFormatException {
        if (numbers == null) {
            throw new NullPointerException("Input array is null");
        }

        double sum = 0;
        int count = 0;

        for (String num : numbers) {
            if (num == null) {
                throw new NullPointerException("Array contains a null element");
            }
            sum += Double.parseDouble(num); // Convert string to double
            count++;
        }

        return sum / count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        String[] values = new String[n];

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            values[i] = scanner.nextLine(); // Read input as a string
        }

        try {
            double result = average(values);
            System.out.println("Average: " + result);
        } catch (NullPointerException | NumberFormatException e) {
            System.out.println("Exception occurred: " + e.getMessage());
        } finally {
            scanner.close(); // Close the scanner
        }
    }
}

