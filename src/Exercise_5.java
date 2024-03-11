import java.util.Scanner;
public class Exercise_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        // Check if the number is positive
        if (number < 0) {
            System.out.println("Error: The number entered is not positive.");
            return;
        }

        int sumOfDigits = 0;
        int originalNumber = number;

        // Sum the digits of the number
        while (number > 0) {
            sumOfDigits += number % 10;
            number /= 10;
        }

        System.out.println("The sum of the digits of " + originalNumber + " is: " + sumOfDigits);

        scanner.close();
    }
}
