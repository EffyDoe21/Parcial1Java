import java.util.Scanner;

public class Exercise_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three integers:");

        System.out.print("Number 1: ");
        int num1 = scanner.nextInt();

        System.out.print("Number 2: ");
        int num2 = scanner.nextInt();

        System.out.print("Number 3: ");
        int num3 = scanner.nextInt();

        int smallest, middle, largest;

        // Find the smallest number
        if (num1 <= num2 && num1 <= num3) {
            smallest = num1;
            middle = (num2 <= num3) ? num2 : num3;
            largest = (num2 <= num3) ? num3 : num2;
        } else if (num2 <= num1 && num2 <= num3) {
            smallest = num2;
            middle = (num1 <= num3) ? num1 : num3;
            largest = (num1 <= num3) ? num3 : num1;
        } else {
            smallest = num3;
            middle = (num1 <= num2) ? num1 : num2;
            largest = (num1 <= num2) ? num2 : num1;
        }

        // Display the numbers in ascending order
        System.out.println("The numbers in ascending order are: " + smallest + ", " + middle + ", " + largest);

        scanner.close();
    }
}
