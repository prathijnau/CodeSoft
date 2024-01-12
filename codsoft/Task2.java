import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of subjects:");
        int numOfSubjects = scanner.nextInt();
        int totalMarks = 0;
        for (int i = 1; i <= numOfSubjects; i++) 
        {
            System.out.println("Enter marks obtained in subject " + i + ":");
            int marks = scanner.nextInt();
            while (marks < 0 || marks > 100) 
            {
                System.out.println("Marks should be between 0 and 100. Enter valid marks:");
                marks = scanner.nextInt();
            }
            
            totalMarks += marks;
        }
        double averagePercentage = (double) totalMarks / numOfSubjects;
        System.out.println("\nTotal Marks: " + totalMarks);
        System.out.printf("Average Percentage: %.2f%%\n", averagePercentage);
        char grade;
        if (averagePercentage >= 90) 
        {
            grade = 'A';
        } 
        else if (averagePercentage >= 80) 
        {
            grade = 'B';
        } 
        else if (averagePercentage >= 70) 
        {
            grade = 'C';
        }
        else if (averagePercentage >= 60)
        {
            grade = 'D';
        } else 
        {
            grade = 'F';
        }
        
        System.out.println("Grade: " + grade);
        
        scanner.close();
    }
}
