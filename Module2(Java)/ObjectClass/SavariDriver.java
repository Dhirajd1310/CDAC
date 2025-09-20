import java.util.*;

class CabDriver {
    static int driverId = 123;
    private int id;
    private String name;
    private long contact;
    private String type;
    private String car;
    private long account;
    private String status = "Available";

    // Constructor
    CabDriver(String name, long contact, String type, String car, long account) {
        this.name = name;
        this.contact = contact;
        this.type = type;
        this.car = car;
        this.account = account;
        this.id = driverId++;
    }

    // Getters and Setters
    public String getName() { return this.name; }
    public void setName(String newName) { this.name = newName; }

    public long getContact() { return this.contact; }
    public void setContact(long newContact) { this.contact = newContact; }

    public String getType() { return this.type; }

    public String getCar() { return this.car; }

    public long getAccount() { return this.account; }
    public void setAccount(long newAccount) { this.account = newAccount; }

    public String getStatus() { return this.status; }
    public void setStatus(String newStatus) { this.status = newStatus; }

    public int getId() { return this.id; }

    // Display methods
    public void displayCabDriver() {
        System.out.println();
        System.out.println("*** CAB DETAILS ***");
        System.out.println("Booking ID : " + this.id);
        System.out.println("Driver name : " + this.getName());
        System.out.println("Contact : " + this.getContact());
        System.out.println("Type of car : " + this.getType());
        System.out.println("Car number : " + this.getCar());
        System.out.println("Account number : " + this.getAccount());
        System.out.println("Status : " + this.getStatus());
    }

    public void displayCabDriverAfterBooking() {
        System.out.println();
        System.out.println("*** CAB DETAILS ***");
        System.out.println("Booking ID : " + this.id);
        System.out.println("Driver name : " + this.getName());
        System.out.println("Contact : " + this.getContact());
        System.out.println("Type of car : " + this.getType());
        System.out.println("Car number : " + this.getCar());
        System.out.println("Account number : " + this.getAccount());
        System.out.println("Status : " + this.getStatus());
    }
}

class Passenger {
    private String name;
    private String start;
    private String end;
    private long contact;
    private int noPass;

    // Constructor
    Passenger(String name, String start, String end, long contact, int noPass) {
        this.name = name;
        this.start = start;
        this.end = end;
        this.contact = contact;
        this.noPass = noPass;
    }

    // Getters and Setters
    public String getName() { return this.name; }
    public void setName(String newName) { this.name = newName; }

    public String getStart() { return this.start; }
    public void setStart(String newStart) { this.start = newStart; }

    public String getEnd() { return this.end; }
    public void setEnd(String newEnd) { this.end = newEnd; }

    public long getContact() { return this.contact; }
    public void setContact(long newContact) { this.contact = newContact; }

    public int getNoPass() { return this.noPass; }
    public void setNoPass(int newNoPass) { this.noPass = newNoPass; }
}

public class SavariDriver {
    static ArrayList<CabDriver> listcab = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Creating CabDriver objects
        CabDriver obj1 = new CabDriver("Ramesh", 9876543210L, "Sedan", "MH12AA1234", 123412341234L);
        CabDriver obj2 = new CabDriver("Suresh", 8876543210L, "Hatchback", "MH12AA5678", 432112341234L);
        CabDriver obj3 = new CabDriver("Mahesh", 7876543210L, "SUV", "MH12AA3456", 789012341234L);
        CabDriver obj4 = new CabDriver("Mukesh", 6876543210L, "XUV", "MH12AA8967", 456712341234L);

        // Adding drivers to list
        listcab.add(obj1);
        listcab.add(obj2);
        listcab.add(obj3);
        listcab.add(obj4);

        while (true) {
            System.out.println();
            System.out.println("Welcome to SAVARI");
            System.out.println("*** Book a Ride ***");

            System.out.print("Enter your name: ");
            sc.nextLine();  // Flush previous newline
            String name = sc.nextLine();

            System.out.print("Enter start destination: ");
            String start = sc.nextLine();

            System.out.print("Enter end destination: ");
            String end = sc.nextLine();

            System.out.print("Enter contact number: ");
            long contact = sc.nextLong();

            System.out.print("Number of passengers: ");
            int noPass = sc.nextInt();
            sc.nextLine();  // Clear newline

            // Create passenger object
            Passenger pass = new Passenger(name, start, end, contact, noPass);

            // Show available cabs
            for (CabDriver i : listcab) {
                if (i.getStatus().equals("Available")) {
                    i.displayCabDriver();
                }
            }

            // Booking process
            System.out.print("Enter the booking ID of the cab you want to book: ");
            int bookid = sc.nextInt();

            for (CabDriver i : listcab) {
                if (bookid == i.getId()) {
                    i.setStatus("Occupied");
                    i.displayCabDriverAfterBooking();
                    System.out.println("Your ride has been booked.");
                    break;
                }
            }
        }
    }
}
