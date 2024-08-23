import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
     //Input :Number of subjects
        System.out.println();
        System.out.print("Enter the number of subjects: ");
     
        int numberOfSubjects = scanner.nextInt();
        
    //Array to store marks obtained in each subject
        int[] marks = new int[numberOfSubjects];
        int totalMarks = 0;
        
        // Input: Marks obtained in each subject
        System.out.println("Enter the marks for each subject (Out of 100)");
        for (int i = 0; i < numberOfSubjects; i++) {
            System.out.print("Subject " + (i+1) + ": ");
            marks[i] = scanner.nextInt();
            totalMarks += marks[i];
        }
        
        //Average Percentage
        double averagePercentage = (double) totalMarks / numberOfSubjects;
        
        // Assigning Grade based on average percentage
        char grade;
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else if (averagePercentage >= 50) {
            grade = 'E';
        } else {
            grade = 'F';
        }
        
        // Results
        System.out.println("\n--- Results ---");
        System.out.println("Total Marks: " + totalMarks);
        System.out.format("Average Percentage:%.2f\n",averagePercentage);
        System.out.println("Grade: " + grade);
        
        scanner.close();
    }
}
