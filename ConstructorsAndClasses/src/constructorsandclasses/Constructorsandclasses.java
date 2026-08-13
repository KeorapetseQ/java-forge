/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package constructorsandclasses;

/**
 *
 * @author Keorapetse
 */


public class Constructorsandclasses {

    public static void main(String[] args) {

        Student student1 = new Student("Travis", 30, "Computing");
        student1.displayInfo();

        
        Student student2 = new Student();
        student2.displayInfo();

        Student student3 = new Student("Lerato", "Business Studies");
        student3.displayInfo();

        student1.celebrateBirthday();

        Course javaCourse = new Course("Intro to Java", 8, student1);
        javaCourse.printSummary();
    }
}

class Student {

    String name;
    int age;
    String course;

    public Student() {
        this.name = "Unknown";
        this.age = 0;
        this.course = "Not enrolled";
    }

    public Student(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public Student(String name, String course) {
        this.name = name;
        this.course = course;
        this.age = 0;
    }

    public void displayInfo() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(course);
    }

    public void celebrateBirthday() {
        this.age++;
        System.out.println(name + " just turned " + age + "!");
    }
}

class Course {

    String title;
    int durationWeeks;
    Student instructor;

    public Course(String title, int durationWeeks, Student instructor) {
        this.title = title;
        this.durationWeeks = durationWeeks;
        this.instructor = instructor;
    }

    public void printSummary() {
        System.out.println(title + " (" + durationWeeks + " weeks)  taught by " + instructor.name);
    }
}
