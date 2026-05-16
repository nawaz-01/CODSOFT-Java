// This program calculates the total marks, average percentage, and grade based on user input for multiple subjects.
// The user is prompted to enter the number of subjects and the marks for each subject. The program then computes the total marks, average percentage, and assigns a grade based on the average percentage.
// The grading system is as follows:
// A+ : 90% and above
// A  : 80% to 89%
// B  : 70% to 79%
// C  : 60% to 69%
// D  : 50% to 59%
// F  : Below 50%

import java.util.Scanner;

public class Project_02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter number of subjects: ");
        int numSubjects = sc.nextInt();

        int[] marks = new int[numSubjects];
        int totalMarks = 0;

        for (int i = 0; i < numSubjects; i++) {
            System.out.print("\nEnter marks for subject " + (i + 1) + " (out of 100): ");
            marks[i] = sc.nextInt();

            if (marks[i] < 0 || marks[i] > 100) {
                System.out.println("Invalid marks! Please enter between 0 and 100.");
                i--;
                continue;
            }

            totalMarks += marks[i];
        }

        double averagePercentage = (double) totalMarks / numSubjects;

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

        System.out.println("\n===== RESULTS =====");
        System.out.println("\nTotal Marks: " + totalMarks + " out of " + (numSubjects * 100));
        System.out.println("\nAverage Percentage: " + averagePercentage + "%");
        System.out.println("\nGrade: " + grade);

        sc.close();
    }
}
