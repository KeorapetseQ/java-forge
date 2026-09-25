package studentacademicmanagementsystem;

import java.util.Scanner;


class StudentAcademicManagementSystem {
    public static void main(String[] args){ 
        Scanner input = new Scanner(System.in);
        
        
        int[] emptyMarks1 = new int[5];
        Student student = new Student("Travis Scott", 20, "Maseru", "2437485", "Computer Science", 2, 5, emptyMarks1);

        
        student.enterGrades(input);

      
        student.displayPersonalDetails();
        student.displayAcademicDetails();


        int[] emptyMarks2 = new int[5];
        FinalYearStudent finalStudent = new FinalYearStudent(
            "Miles Morales", 22, "Rotterdam", "2435685", "Software Engineering", 4, 5, emptyMarks2, "AI Research", 0
        );
        
        System.out.println("\n   \n");

        System.out.println("enter marks for final-year student");
        finalStudent.enterGrades(input);
        
        System.out.print("Enter Project Mark: ");
        finalStudent.projectMark = input.nextInt();

        System.out.println("\nFinal-Year Student Details");
        finalStudent.displayFinalYearDetails();
        
        input.close();
    }
}


class Person{
    String name;
    int age;
    String residentialArea;
    
    Person(String name, int age, String residentialArea){
        this.name = name;
        this.age = age;
        this.residentialArea = residentialArea;
    }
    
    public void displayPersonalDetails(){
        System.out.println("Name: " + name);
        System.out.println("age; " + age);
        System.out.println("residentialArea: " + residentialArea);
        
    }
}

class Student extends Person{
    String studentID;
    String course;
    int year;
    int numberOfSubjects;
    int[] marks;
    
    Student(String name, int age, String residentialArea, String studentID, String course, int year, int numberOfSubjects, int[] marks){
        super(name, age, residentialArea);
        this.studentID = studentID;
        this.course = course;
        this.year = year;
        this.numberOfSubjects = numberOfSubjects;
        this.marks = marks;
    }
    
    public void enterGrades(Scanner scanner) {
        marks = new int[5];
        String[] subjectNames = {"Maths", "English", "Physics", "Accounting", "Computer Science"};
        
        System.out.println("enter grades for 5 subjects:");
        for (int i = 0; i < 5; i++) {
            System.out.print(subjectNames[i] + ": ");
            marks[i] = scanner.nextInt();
        }
    }

    public void displayAcademicDetails() {
        int total = 0;
        for (int i = 0; i < marks.length; i++) {
            total = total + marks[i];
        }

        int average = (int) total / marks.length;
        
        System.out.println("Student ID: " + studentID);
        System.out.println("Course: " + course);
        System.out.println("Year: " + year);
        
        String[] subjectNames = {"Maths", "English", "Physics", "Accounting", "Computer Science"};
        System.out.println("Marks:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("  " + subjectNames[i] + ": " + marks[i]);
        }
        
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);

        System.out.print("Performance: ");
        if (average >= 80 && average <= 100) {
            System.out.println("Distinction");
        } else if (average >= 70) {
            System.out.println("Merit");
        } else if (average >= 60) {
            System.out.println("credit");
        } else if (average >= 50) {
            System.out.println("pass");
        } else {
            System.out.println("Fail");
        }
    }
}

class FinalYearStudent extends Student {
    String projectTitle;
    int projectMark;

    FinalYearStudent(String name, int age, String residentialArea, String studentID, String course, int year, int numberOfSubjects, int[] marks, String projectTitle, int projectMark) {
        super(name, age, residentialArea, studentID, course, year, numberOfSubjects, marks);
        this.projectTitle = projectTitle;
        this.projectMark = projectMark;
    }

    public void displayFinalYearDetails() {
        displayPersonalDetails();

        int total = 0;
        for (int i = 0; i < marks.length; i++) {
            total = total + marks[i];
        }
        total = total + projectMark;

        int average = (int) total / (marks.length + 1);

        System.out.println("Student ID: " + studentID);
        System.out.println("Course: " + course);
        System.out.println("Year: " + year);

        String[] subjectNames = {"Maths", "English", "Physics", "Accounting", "Computer Science"};
        System.out.println("Marks:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("  " + subjectNames[i] + ": " + marks[i]);
        }

        System.out.println("Project Title: " + projectTitle);
        System.out.println("Project Mark: " + projectMark);
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);

        System.out.print("Performance: ");
        if (average >= 80 && average <= 100) {
            System.out.println("Distinction");
        } else if (average >= 70) {
            System.out.println("Merit");
        } else if (average >= 60) {
            System.out.println("credit");
        } else if (average >= 50) {
            System.out.println("pass");
        } else {
            System.out.println("Fail");
        }
    }
}