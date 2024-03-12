import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise_Fifteen {

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

        List<Integer> evenNumbersList = removeOddNumbers(numbersList);

        System.out.println("List with odd numbers removed: " + evenNumbersList);

        input.close();
    }

    public static List<Integer> removeOddNumbers(List<Integer> list) {
        List<Integer> evenNumbersList = new ArrayList<>();
        
        for (int num : list) {
            if (num % 2 == 0) { // Verifica si el número es par
                evenNumbersList.add(num);
            }
        }
        
        return evenNumbersList;
    }
}