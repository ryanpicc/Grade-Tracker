import java.util.Scanner;
public class GradeTracker {
    public static void main(String[] args) {
        System.out.println("Welcome to Grade Tracker!");
    
Scanner input = new Scanner(System.in);

System.out.println("Enter student name: ");

String studentName = input.nextLine();

System.out.println("Enter first grade:");
double grade1 = input.nextDouble();

System.out.println("Enter second grade:");
double grade2 = input.nextDouble();

System.out.println("enter third grade: ");
double grade3 = input.nextDouble();

double average = (grade1 + grade2 + grade3) / 3.0;

System.out.println("Student: " + studentName);
System.out.printf("Average grade: %.2f%n", average);
if (average >= 65.0) {
	System.out.println("Result: Pass");
} else {
	System.out.println("Result: Fail");
}
    input.close();
    }
}
