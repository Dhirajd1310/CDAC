// Base class: Vehicle
class Vehicle {
    String model;
    int year;
    String color;
    double mileage;
    String type;

    // Constructor
    Vehicle(String model, int year, String color, double mileage, String type) {
        super(); // Call to Object class constructor
        this.model = model;
        this.year = year;
        this.color = color;
        this.mileage = mileage;
        this.type = type;
    }

    // Method to display vehicle details
    public void displayVehicle() {
        System.out.println("Vehicle Details:");
        System.out.println("Model   : " + this.model);
        System.out.println("Year    : " + this.year);
        System.out.println("Color   : " + this.color);
        System.out.println("Mileage : " + this.mileage);
        System.out.println("Type    : " + this.type);
    }
}

// Derived class: Car (inherits from Vehicle)
class Car extends Vehicle {
    int noDoor;
    String fuelType;
    boolean isElectric;
    String transmission;
    int passCapacity;

    // Constructor
    Car(int noDoor, String fuelType, boolean isElectric, String transmission, int passCapacity,
        String model, int year, String color, double mileage, String type) {
        
        super(model, year, color, mileage, type); // Call to Vehicle constructor
        this.noDoor = noDoor;
        this.fuelType = fuelType;
        this.isElectric = isElectric;
        this.transmission = transmission;
        this.passCapacity = passCapacity;
    }

    // Method to display car details
    public void displayCar() {
		displayVehicle();
        System.out.println("Car Details:");
        System.out.println("Number of Doors     : " + this.noDoor);
        System.out.println("Fuel Type           : " + this.fuelType);
        System.out.println("Is Electric         : " + this.isElectric);
        System.out.println("Transmission Type   : " + this.transmission);
        System.out.println("Passenger Capacity  : " + this.passCapacity);
    }
}

// Main class
public class SingleLevelInheritance {
    public static void main(String[] args) {
        // First Car object
        Car obj1 = new Car(5, "Diesel", false, "Manual", 9,
                           "Scorpio", 2023, "White", 14, "SUV");

        obj1.displayVehicle();
        obj1.displayCar();

        System.out.println();
        System.out.println();

        // Second Car object
        Car obj2 = new Car(5, "Petrol", false, "Manual", 5,
                           "XUV 3XO", 2023, "White", 18, "Sub-compact");

        //obj2.displayVehicle();
        obj2.displayCar();
    }
}
