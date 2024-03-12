
import java.util.Scanner;

public class Exercise_Twelve {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your name: ");
        String Name = input.nextLine();
        System.out.println("Welcome " + Name + "!");

        System.out.print("Enter the size of the integer array: ");
        int size = input.nextInt();

        int[] numbers = new int[size];

        System.out.println("Please enter " + size + " positive integers:");

        for (int i = 0; i < size; i++) {
            numbers[i] = input.nextInt();
        }

        int product = calculateProductOfEvenNumbers(numbers);

        System.out.println("The product of all even elements in the array is: " + product);

        input.close();
    }

    public static int calculateProductOfEvenNumbers(int[] arr) {
        int product = 1;
        for (int num : arr) {
            if (num % 2 == 0) { 
                product *= num;
            }
        }
        return product;
    }
}