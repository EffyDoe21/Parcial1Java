/*17. Promedio de valores:
Escribir un programa que tome un HashMap donde las claves son nombres de
estudiantes y los valores son listas de calificaciones, y calcule el promedio de calificaciones
para cada estudiante.*/

import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        HashMap<String, List<Integer>> gradesMap = new HashMap<>();

        
        for (String student : gradesMap.keySet()) {
            List<Integer> grades = gradesMap.get(student);
            double average = calculateAverage(grades);
            System.out.println("The average grade for " + student + " is: " + average);
        }
    }

    
    public static double calculateAverage(List<Integer> grades) {
        if (grades == null || grades.isEmpty()) {
            return 0.0; 
        }

        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }

        return (double) sum / grades.size(); 
    }
}