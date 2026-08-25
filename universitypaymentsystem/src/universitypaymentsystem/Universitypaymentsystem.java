package universitypaymentsystem;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author Keorapetse
 
 */
// Interface
interface Payable {
    void makePayment();
}

// Abstract class
abstract class Student {
    protected String name;

    public Student(String name) {
        this.name = name;
    }

    // Abstract method
    abstract void study();

    // Normal method
    public void introduce() {
        System.out.println("My name is " + name);
    }
}

// Inheritance: Undergraduate extends Student
class Undergraduate extends Student implements Payable {

    public Undergraduate(String name) {
        super(name);
    }

    // Implementing abstract method
    @Override
    void study() {
        System.out.println(name + " is studying undergraduate courses.");
    }

    // Implementing interface method
    @Override
    public void makePayment() {
        System.out.println(name + " is paying undergraduate fees.");
    }
}

// Inheritance: Postgraduate extends Student
class Postgraduate extends Student implements Payable {

    public Postgraduate(String name) {
        super(name);
    }

    @Override
    void study() {
        System.out.println(name + " is studying postgraduate courses.");
    }

    @Override
    public void makePayment() {
        System.out.println(name + " is paying postgraduate fees.");
    }
}

// Main class
public class Universitypaymentsystem {

    public static void main(String[] args) {

        // Polymorphism
        Student student1 = new Undergraduate("Tlhohonolofatso");
        Student student2 = new Postgraduate("Mpho");

        student1.introduce();
        student1.study();

        System.out.println();

        student2.introduce();
        student2.study();

        System.out.println();

        // Interface reference
        Payable payment1 = new Undergraduate("Lerato");
        Payable payment2 = new Postgraduate("Thabo");

        payment1.makePayment();
        payment2.makePayment();
    }
}
