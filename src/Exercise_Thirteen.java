
/*13. Escribir un programa que encuentre el elemento máximo en un vector de enteros. es
decir el número más grande*/


import java.util.Scanner;

public class Exercise_Thirteen {

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

        int max = findMax(numbers);

        System.out.println("The maximum element in the array is: " + max);

        input.close();
    }

    public static int findMax(int[] arr) {
        if (arr.length == 0) {
            return Integer.MIN_VALUE; // Retorna el valor mínimo posible si el array está vacío
        }

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }
}
