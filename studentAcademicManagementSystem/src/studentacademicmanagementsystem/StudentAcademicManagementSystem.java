
package studentacademicmanagementsystem;

import java.util.Scanner;

// Main Class at the top
class StudentAcademicManagementSystem {
    public static void main(String[] args) {
        // Output 1: Student
        double[] studentMarks = {75, 68, 80, 72, 65};
        Student student = new Student("John Smith", "ST001", 2, studentMarks);
        System.out.println("Sample Output - Student:");
        student.displayAcademicDetails();

        System.out.println();

        // Output 2: Final-Year Student
        double[] finalYearMarks = {75, 68, 80, 72, 65};
        FinalYearStudent finalStudent = new FinalYearStudent("Mary Jones", "ST002", 4, finalYearMarks, 90);
        System.out.println("Sample Output - Final-Year Student:");
        finalStudent.displayFinalYearDetails();
    }
}

// Class 1: Person
class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    void displayPersonalDetails() {
        System.out.println("Name: " + name);
    }
}

// Class 2: Student
class Student extends Person {
    String studentID;
    int year;
    double[] marks;
    double total;
    double average;

    Student(String name, String studentID, int year, double[] marks) {
        super(name);
        this.studentID = studentID;
        this.year = year;
        this.marks = marks;
        calculateTotalAndAverage();
    }

    // Method to enter grades using a loop
    void enterGrades(Scanner scanner) {
        marks = new double[5];
        System.out.println("Enter grades for 5 subjects:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = scanner.nextDouble();
        }
        calculateTotalAndAverage();
    }

    void calculateTotalAndAverage() {
        total = 0;
        for (double mark : marks) {
            total += mark;
        }
        average = total / marks.length;
    }

    String getPerformance() {
        if (average >= 80 && average <= 100) {
            return "Distinction";
        } else if (average >= 70) {
            return "Merit";
        } else if (average >= 60) {
            return "Credit";
        } else if (average >= 50) {
            return "Pass";
        } else {
            return "Fail";
        }
    }

    void displayAcademicDetails() {
        System.out.print("Name: " + name + " | Student ID: " + studentID + " | Year: " + year + "\nMarks: ");
        for (int i = 0; i < marks.length; i++) {
            System.out.print((int) marks[i] + (i < marks.length - 1 ? ", " : ""));
        }
        System.out.println("\nTotal: " + (int) total + " | Average: " + String.format("%.1f", average) + " | Performance: " + getPerformance());
    }
}

// Class 3: FinalYearStudent
class FinalYearStudent extends Student {
    double projectMark;

    FinalYearStudent(String name, String studentID, int year, double[] marks, double projectMark) {
        super(name, studentID, year, marks);
        this.projectMark = projectMark;
        calculateFinalYearAverage();
    }

    void calculateFinalYearAverage() {
        total = 0;
        for (double mark : marks) {
            total += mark;
        }
        total += projectMark;
        average = total / (marks.length + 1); // 5 subjects + 1 project mark
    }

    void displayFinalYearDetails() {
        System.out.print("Name: " + name + " | Student ID: " + studentID + " | Year: " + year + "\nMarks: ");
        for (int i = 0; i < marks.length; i++) {
            System.out.print((int) marks[i] + (i < marks.length - 1 ? ", " : ""));
        }
        System.out.println(" | Project: " + (int) projectMark);
        System.out.println("Total: " + (int) total + " | Average: " + String.format("%.1f", average) + " | Performance: " + getPerformance());
    }
}