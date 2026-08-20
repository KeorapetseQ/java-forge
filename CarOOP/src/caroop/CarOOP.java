package caroop;

class Car {

    String brand;
    String model;
    int year;
    double speed;

    Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.speed = 0;
    }

    void accelerate(double amount) {
        speed += amount;
        System.out.println(brand + " accelerated to " + speed + " km/h");
    }

    void brake(double amount) {
        speed -= amount;

        if (speed < 0) {
            speed = 0;
        }

        System.out.println(brand + " slowed down to " + speed + " km/h");
    }

    void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Speed: " + speed + " km/h");
    }
}

public class CarOOP {

    public static void main(String[] args) {

        Car car1 = new Car("BMW", "M3", 2024);
        Car car2 = new Car("Toyota", "Supra", 2023);

        car1.displayInfo();

        System.out.println();

        car1.accelerate(80);
        car1.accelerate(40);
        car1.brake(30);

        System.out.println();

        car2.displayInfo();

        System.out.println();

        car2.accelerate(100);
        car2.brake(50);
    }
}    

