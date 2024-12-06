import java.util.ArrayList;
import java.util.Scanner;

public class StudentGradeTracker {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            ArrayList<Integer> grades = new ArrayList<>();
            
            System.out.println("Welcome to the Student Grade Tracker!");
            
            // Input grades
            while (true) {
                System.out.print("Enter a student's grade (0-100) or 0 to finish: ");
                int grade = scanner.nextInt();
                
                if (grade == 0) {
                    break; // Exit loop if the user enters -1
                }
                
                if (grade >= 0 && grade <= 100) {
                    grades.add(grade); // Add grade to the list
                } else {
                    System.out.println("Invalid grade. Please enter a number between 0 and 100.");
                }
            }
            
            // Check if there are grades to process
            if (grades.isEmpty()) {
                System.out.println("No grades entered. Exiting program.");
            } else {
                // Compute average, highest, and lowest scores
                int total = 0, highest = Integer.MIN_VALUE, lowest = Integer.MAX_VALUE;
                
                for (int grade : grades) {
                    total += grade;
                    if (grade > highest) highest = grade;
                    if (grade < lowest) lowest = grade;
                }
                
                double average = (double) total / grades.size();
                
                // Display results
                System.out.println("\nGrade Summary:");
                System.out.println("Total Students: " + grades.size());
                System.out.println("Average Grade: " + average);
                System.out.println("Highest Grade: " + highest);
                System.out.println("Lowest Grade: " + lowest);
            }
        }
    }
}
