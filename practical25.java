class Vehicle {
    protected String vehicleNumber;
    protected String brand;
    protected String fuelType;

    public Vehicle(String vehicleNumber, String brand, String fuelType) {
        this.vehicleNumber = vehicleNumber;
        this.brand = brand;
        this.fuelType = fuelType;
    }

    public void displayDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Brand: " + brand);
        System.out.println("Fuel Type: " + fuelType);
    }
}

class Car extends Vehicle {
    protected int numberOfSeats;
    protected boolean ACavailable;

    public Car(String vehicleNumber, String brand, String fuelType, int numberOfSeats, boolean ACavailable) {
        super(vehicleNumber, brand, fuelType);
        this.numberOfSeats = numberOfSeats;
        this.ACavailable = ACavailable;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Number of Seats: " + numberOfSeats);
        System.out.println("AC Available: " + ACavailable);
    }
}

class ElectricCar extends Car {
    protected double batteryCapacity;
    protected double chargingTime;

    public ElectricCar(String vehicleNumber, String brand, int numberOfSeats, boolean ACavailable, double batteryCapacity, double chargingTime) {
        super(vehicleNumber, brand, "Electric", numberOfSeats, ACavailable);
        this.batteryCapacity = batteryCapacity;
        this.chargingTime = chargingTime;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
        System.out.println("Charging Time: " + chargingTime + " hours");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("V001", "Yamaha", "Petrol");
        Car c1 = new Car("C001", "Toyota", "Diesel", 5, true);
        ElectricCar e1 = new ElectricCar("E001", "Tesla", 5, true, 100.0, 1.5);

        System.out.println("===== Vehicle Details =====");
        v1.displayDetails();

        System.out.println("\n===== Car Details =====");
        c1.displayDetails();

        System.out.println("\n===== Electric Car Details =====");
        e1.displayDetails();

        System.out.println("\n===== Upcasting =====");
        Vehicle v2 = new Car("C002", "Honda", "Petrol", 4, false);
        v2.displayDetails();

        System.out.println("\n===== Downcasting with instanceof =====");
        if (v2 instanceof Car) {
            Car c2 = (Car) v2;
            System.out.println("Downcast successful. Number of Seats: " + c2.numberOfSeats);
        }

        Vehicle v3 = new ElectricCar("E002", "BMW", 4, true, 80.0, 2.0);
        if (v3 instanceof ElectricCar) {
            ElectricCar e2 = (ElectricCar) v3;
            System.out.println("Electric Car Battery Capacity: " + e2.batteryCapacity + " kWh");
        }

        System.out.println("\n===== instanceof Checks =====");
        System.out.println("v1 instanceof Vehicle: " + (v1 instanceof Vehicle));
        System.out.println("c1 instanceof Vehicle: " + (c1 instanceof Vehicle));
        System.out.println("c1 instanceof Car: " + (c1 instanceof Car));
        System.out.println("e1 instanceof Car: " + (e1 instanceof Car));
        System.out.println("e1 instanceof ElectricCar: " + (e1 instanceof ElectricCar));
        System.out.println("v1 instanceof Car: " + (v1 instanceof Car));
    }
}