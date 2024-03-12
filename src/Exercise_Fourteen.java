/*14. Eliminar duplicados:
Escribir un programa que elimine los elementos duplicados de una lista.*/

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Exercise_Fourteen {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your name: ");
        String Name = input.nextLine();
        System.out.println("Welcome " + Name + "!");

        List<Integer> numbersList = new ArrayList<>();

        System.out.print("Enter the size of the list: ");
        int size = input.nextInt();

        System.out.println("Please enter " + size + " integers:");

        for (int i = 0; i < size; i++) {
            numbersList.add(input.nextInt());
        }

        List<Integer> uniqueNumbersList = removeDuplicates(numbersList);

        System.out.println("List with duplicates removed: " + uniqueNumbersList);

        input.close();
    }

    public static List<Integer> removeDuplicates(List<Integer> list) {
        Set<Integer> set = new HashSet<>(list);
        return new ArrayList<>(set);
    }
}