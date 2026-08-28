
package payableinterface;

/**
 *
 * @author Keorapetse
 */

public class PayableInterface {

    public static void main(String[] args) {

        Freelancer freelancer = new Freelancer(150, 40);
        Employee employee = new Employee(12000);

        freelancer.printPaymentSlip();
        employee.printPaymentSlip();
    }
}

interface Payable {

    double calculatePayment();

    default void printPaymentSlip() {
        System.out.println("Payment: M" + calculatePayment());
    }
}

class Freelancer implements Payable {

    public final double hourlyRate;
    public final int hoursWorked;

    public Freelancer(double hourlyRate, int hoursWorked) {
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculatePayment() {
        return hourlyRate * hoursWorked;
    }
}

class Employee implements Payable {

    public final double monthlySalary;

    public Employee(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculatePayment() {
        return monthlySalary;
    }
}

