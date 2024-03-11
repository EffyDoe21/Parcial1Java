import java.util.Scanner;
public class Exercise_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the initial investment amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the annual interest rate (as a percentage): ");
        double annualInterestRate = scanner.nextDouble();

        System.out.print("Enter the number of years: ");
        int years = scanner.nextInt();

        // Convert annual interest rate from percentage to decimal
        double interestRate = annualInterestRate / 100;

        // Calculate the final amount using the compound interest formula
        double finalAmount = principal * Math.pow(1 + interestRate, years);

        System.out.println("The final amount after " + years + " years is: " + finalAmount);

        scanner.close();
    }
}
