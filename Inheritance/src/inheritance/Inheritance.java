package inheritance;


public class Inheritance {

   
    public static void main(String[] args) {
        // TODO code application logic here
                Employee employee = new Employee("Alice", 50000.0);
        Manager manager = new Manager("Bob", 80000.0, 15000.0);
        Executive executive = new Executive("Charlie", 150000.0, 50000.0, true);

        System.out.println(employee.getDetails());
        System.out.println(manager.getDetails());
        System.out.println(executive.getDetails());
    }
    
}
// 1. Base Class: Employee
class Employee {
    protected String name;
    protected double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public String getDetails() {
        return name + " receives a base salary of M" + baseSalary;
    }
}

// 2. Subclass: Manager
class Manager extends Employee {
    private double bonus;

    public Manager(String name, double baseSalary, double bonus) {
        super(name, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public String getDetails() {
        return super.getDetails() + " plus a bonus of M" + bonus;
    }
}

// 3. Subclass: Executive
class Executive extends Manager {
    private boolean hasStockOptions;

    public Executive(String name, double baseSalary, double bonus, boolean hasStockOptions) {
        super(name, baseSalary, bonus);
        this.hasStockOptions = hasStockOptions;
    }

    @Override
    public String getDetails() {
        String details = super.getDetails();
        if (hasStockOptions) {
            details += " [Includes Stock Options]";
        }
        return details;
    }
}



