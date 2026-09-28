package ik.ku.module2.exercises.ex2;

import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type your midterm grade");
        byte MidtermGrade = scanner.nextByte();
        System.out.println("Type your final grade");
        byte FinalGrade = scanner.nextByte();
        double TotalGrade = (double)MidtermGrade * 0.4 + (double)FinalGrade * 0.6;
        System.out.println("\nYour Grades:");
        System.out.println("________________");
        System.out.println("\nMidterm Grade: " + MidtermGrade);
        System.out.println("\nFinal Grade: " + FinalGrade);
        System.out.println("\nTotal Grade: " + TotalGrade);
        if (TotalGrade >= (double)90.0F) {
            System.out.println("Excellent");
        } else if (TotalGrade >= (double)70.0F) {
            System.out.println("Good");
        } else if (TotalGrade >= (double)50.0F) {
            System.out.println("Satisfactory");
        } else {
            System.out.println("Failed");
        }

    }
}
