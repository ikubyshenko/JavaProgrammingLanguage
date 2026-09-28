package ik.ku.module2.exercises.ex2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Type your midterm grade");
        byte MidtermGrade = scanner.nextByte();

        System.out.println("Type your final grade");
        byte FinalGrade = scanner.nextByte();

        double TotalGrade = MidtermGrade * 0.4 + FinalGrade * 0.6;

        System.out.println("\nYour Grades:");
        System.out.println("________________");
        System.out.println("\nMidterm Grade: " + MidtermGrade);
        System.out.println("\nFinal Grade: " + FinalGrade);
        System.out.println("\nTotal Grade: " + TotalGrade);

        if (TotalGrade >= 90.0) {
            System.out.println("Excellent");
        } else if (TotalGrade >= 70.0) {
            System.out.println("Good");
        } else if (TotalGrade >= 50.0) {
            System.out.println("Satisfactory");
        } else {
            System.out.println("Failed");
        }

    }
}
