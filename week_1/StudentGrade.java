import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = input.nextLine();

        System.out.print("Enter mark: ");
        double mark = input.nextDouble();

        String grade;

        if (mark >= 80) {
            grade = "A";
        } else if (mark >= 70) {
            grade = "B";
        } else if (mark >= 60) {
            grade = "C";
        } else if (mark >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("\n===== STUDENT RESULT =====");
        System.out.println("Student Name : " + name);
        System.out.println("Mark         : " + mark);
        System.out.println("Grade        : " + grade);

        input.close();
    }
}