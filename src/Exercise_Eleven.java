
/*11. Suma de elementos:
Escribir un programa que calcule la suma de todos los elementos en un vector de enteros.*/


import java.util.Scanner;

public class Exercise_Eleven {
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

        int sum = calculateSum(numbers);

        System.out.println("The sum of all elements in the array is: " + sum);

        input.close();
    }

    public static int calculateSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
}