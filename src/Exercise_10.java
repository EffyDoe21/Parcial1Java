import java.util.Scanner;

 class Exercise_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input a positive integer
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        // Check if the number is positive
        if (number <= 0) {
            System.out.println("Error: The number entered is not positive.");
            return;
        }

        // Ask the user to input a digit to count
        System.out.print("Enter a digit to count: ");
        int digit = scanner.nextInt();

        // Check if the digit is valid (0-9)
        if (digit < 0 || digit > 9) {
            System.out.println("Error: The digit entered is not valid.");
            return;
        }

        // Convert the number and the digit to strings for easier processing
        String numberStr = String.valueOf(number);
        String digitStr = String.valueOf(digit);

        // Counter to count the occurrences of the digit in the number
        int count = 0;

        // Iterate over each digit of the number and count the occurrences of the entered digit
        for (int i = 0; i < numberStr.length(); i++) {
            if (numberStr.charAt(i) == digitStr.charAt(0)) {
                count++;
            }
        }

        // Display the result
        System.out.println("The digit " + digit + " appears " + count + " times in the number " + number + ".");

        scanner.close();
    }
}
