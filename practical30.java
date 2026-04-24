abstract class Vehicle {
    // Abstract methods
    abstract String fuelType();
    abstract int noOfWheels();
}

// Car class
class Car extends Vehicle {
    public String fuelType() {
        return "Petrol/Diesel";
    }

    public int noOfWheels() {
        return 4;
    }
}

// Bike class
class Bike extends Vehicle {
    public String fuelType() {
        return "Petrol";
    }

    public int noOfWheels() {
        return 2;
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        System.out.println("Name - Dhruv Barot");
        System.out.println("Enrollment No - 250393107002");

        Vehicle car = new Car();
        Vehicle bike = new Bike();

        System.out.println("\n--- Car Details ---");
        System.out.println("Fuel Type: " + car.fuelType());
        System.out.println("Number of Wheels: " + car.noOfWheels());

        System.out.println("\n--- Bike Details ---");
        System.out.println("Fuel Type: " + bike.fuelType());
        System.out.println("Number of Wheels: " + bike.noOfWheels());
    }
}