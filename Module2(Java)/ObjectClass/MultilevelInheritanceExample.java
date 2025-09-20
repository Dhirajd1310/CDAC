// Base class
class Device {
    String brand;
    String model;
    double weight;
    String batteryType;
    double price;

    // Constructor for Device
    Device(String brand, String model, double weight, String batteryType, double price) {
        this.brand = brand;
        this.model = model;
        this.weight = weight;
        this.batteryType = batteryType;
        this.price = price;
    }

    // Display device details
    void displayDeviceDetails() {
        System.out.println("Device Details:");
        System.out.println("Brand        : " + this.brand);
        System.out.println("Model        : " + this.model);
        System.out.println("Weight       : " + this.weight + " grams");
        System.out.println("Battery Type : " + this.batteryType);
        System.out.println("Price        : $" + this.price);
    }
}

// Intermediate class
class Phone extends Device {
    String networkType;
    int simSlots;
    boolean hasCamera;
    boolean hasBluetooth;
    boolean hasWifi;

    // Constructor for Phone
    Phone(String brand, String model, double weight, String batteryType, double price,
          String networkType, int simSlots, boolean hasCamera, boolean hasBluetooth, boolean hasWifi) {
        super(brand, model, weight, batteryType, price); // Call to Device constructor
        this.networkType = networkType;
        this.simSlots = simSlots;
        this.hasCamera = hasCamera;
        this.hasBluetooth = hasBluetooth;
        this.hasWifi = hasWifi;
    }

    // Display phone details
    void displayPhoneDetails() {
        displayDeviceDetails();
        System.out.println("Network Type : " + this.networkType);
        System.out.println("SIM Slots    : " + this.simSlots);
        System.out.println("Has Camera   : " + this.hasCamera);
        System.out.println("Has Bluetooth: " + this.hasBluetooth);
        System.out.println("Has Wi-Fi    : " + this.hasWifi);
    }
}

// Derived class
class SmartPhone extends Phone {
    String operatingSystem;
    int storageCapacity; // in GB
    int ram;             // in GB
    boolean hasFingerprintSensor;
    boolean hasFaceUnlock;

    // Constructor for SmartPhone
    SmartPhone(String brand, String model, double weight, String batteryType, double price,
               String networkType, int simSlots, boolean hasCamera, boolean hasBluetooth, boolean hasWifi,
               String operatingSystem, int storageCapacity, int ram,
               boolean hasFingerprintSensor, boolean hasFaceUnlock) {

        super(brand, model, weight, batteryType, price,
              networkType, simSlots, hasCamera, hasBluetooth, hasWifi); // Call to Phone constructor

        this.operatingSystem = operatingSystem;
        this.storageCapacity = storageCapacity;
        this.ram = ram;
        this.hasFingerprintSensor = hasFingerprintSensor;
        this.hasFaceUnlock = hasFaceUnlock;
    }

    // Display smartphone details
    void displaySmartPhoneDetails() {
        displayPhoneDetails();
        System.out.println("Operating System      : " + this.operatingSystem);
        System.out.println("Storage Capacity      : " + this.storageCapacity + " GB");
        System.out.println("RAM                   : " + this.ram + " GB");
        System.out.println("Has Fingerprint Sensor: " + this.hasFingerprintSensor);
        System.out.println("Has Face Unlock       : " + this.hasFaceUnlock);
    }
}

// Main class to test multilevel inheritance
public class MultilevelInheritanceExample {
    public static void main(String[] args) {
        // Creating a SmartPhone object
        SmartPhone smartphone = new SmartPhone(
            "Apple", "iPhone SE 2", 150, "Lithium-Ion", 499,
            "4G", 2, true, true, true,
            "iOS", 128, 3, true, false
        );

        // Displaying SmartPhone details
        smartphone.displaySmartPhoneDetails();
    }
}
