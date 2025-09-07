import java.util.*;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Input number of subjects
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        // Validate number of subjects
        if (numSubjects <= 0) {
            System.out.println("Number of subjects must be greater than 0.");
            scanner.close();
            return;
        }

        // Step 2: Input marks for each subject
        int[] marks = new int[numSubjects];
        int totalMarks = 0;

        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + " (out of 100): ");
            marks[i] = scanner.nextInt();

            // Validate marks
            if (marks[i] < 0 || marks[i] > 100) {
                System.out.println("Marks must be between 0 and 100. Please try again.");
                scanner.close();
                return;
            }
            totalMarks += marks[i];
        }

        // Step 3: Calculate average percentage
        double averagePercentage = (double) totalMarks / numSubjects;

        // Step 4: Grade calculation
        String grade;
        if (averagePercentage >= 90) {
            grade = "A+";
        } else if (averagePercentage >= 80) {
            grade = "A";
        } else if (averagePercentage >= 70) {
            grade = "B";
        } else if (averagePercentage >= 60) {
            grade = "C";
        } else if (averagePercentage >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }

        // Step 5: Display results
        System.out.println("\nResults:");
        System.out.println("Total Marks: " + totalMarks + " out of " + (numSubjects * 100));
        System.out.printf("Average Percentage: %.2f%%\n", averagePercentage);
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
