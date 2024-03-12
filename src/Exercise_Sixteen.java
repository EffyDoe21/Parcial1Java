/*16. . Eliminar claves:
Escribir un programa que elimine todas las claves de un HashMap que tengan
un valor menor que un número dado.*/


import java.util.HashMap;
import java.util.Map;

public class Exercise_Sixteen {

    public static void main(String[] args) {
        // Create a HashMap with example values
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("A", 10);
        hashMap.put("B", 5);
        hashMap.put("C", 15);
        hashMap.put("D", 3);

        int numberGiven = 8; // Number given for comparison

        System.out.println("HashMap before removing keys with values less than " + numberGiven + ":");
        System.out.println(hashMap);

        // Delete keys with values less than the given number
        for (Map.Entry<String, Integer> entry : new HashMap<>(hashMap).entrySet()) {
            if (entry.getValue() < numberGiven) {
                hashMap.remove(entry.getKey());
            }
        }

        System.out.println("HashMap after removing keys with values less than " + numberGiven + ":");
        System.out.println(hashMap);
    }
}