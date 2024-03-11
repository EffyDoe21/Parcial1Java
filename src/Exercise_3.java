import java.util.Scanner;

public class Exercise_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount of money: ");
        double amount = scanner.nextDouble();

        System.out.print("Enter the exchange rate: ");
        double exchangeRate = scanner.nextDouble();

        double result = amount * exchangeRate;

        System.out.println("The result of the conversion is: " + result);

        scanner.close();
    }
}

