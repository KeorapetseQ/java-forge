//inheritance and class
package inheritancenclass;

public class Inheritancenclass {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Generic vehicle", 80);
        Car car = new Car("Honda", 120, 4);
        SportsCar sportsCar = new SportsCar("Lambo", 250, 2, true);

        vehicle.describe();
        System.out.println();

        car.describe();
        System.out.println();

        sportsCar.describe();
    }
}


class Vehicle {
    String brand;
    int speed;

    Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public void describe() {
        System.out.println(brand + " travels at " + speed + " km/h");
    }
}


class Car extends Vehicle {
    protected int doors;

    public Car(String brand, int speed, int doors) {
        super(brand, speed);
        this.doors = doors;
    }

    public void describe() {
        super.describe();
        System.out.println("and has " + doors + " doors");
    }
}


class SportsCar extends Car {
    private boolean turboEnabled;

    public SportsCar(String brand, int speed, int doors, boolean turboEnabled) {
        super(brand, speed, doors);
        this.turboEnabled = turboEnabled;
    }

    public void describe() {
        super.describe();

        if (turboEnabled) {
            System.out.println("[TURBO]");
        }
    }
}