// Base class: India
class India {
    String president;
    String primeMinister;
    String capital;
    int states;
    int union;
    String lang;

    // Constructor
    India(String president, String primeMinister, String capital, int states, int union, String lang) {
       // super(); // Calling Object class constructor
        this.president = president;
        this.primeMinister = primeMinister;
        this.capital = capital;
        this.states = states;
        this.union = union;
        this.lang = lang;
    }

    // Method to display India's details
    public void displayIndia() {
        System.out.println("India Details:");
        System.out.println("President       : " + this.president);
        System.out.println("Prime Minister  : " + this.primeMinister);
        System.out.println("Capital         : " + this.capital);
        System.out.println("States          : " + this.states);
        System.out.println("Union Territories: " + this.union);
        System.out.println("Language        : " + this.lang);
    }
}

// Derived class: Maharashtra (inherits from India)
class Maharashtra extends India {
    String cm;
    String capital;
    String lan;
    int districts;
    long pop;
    double area;

    // Constructor
    Maharashtra(String cm, String capital, String lan, int districts, long pop, double area,
                String president, String primeMinister, String capital1, int states, int union, String lang) {
        super(president, primeMinister, capital1, states, union, lang); // Calling India constructor
        this.cm = cm;
        this.capital = capital;
        this.lan = lan;
        this.districts = districts;
        this.pop = pop;
        this.area = area;
    }

    // Method to display Maharashtra's details
    public void displayMaharashtra() {
        System.out.println("Maharashtra Details:");
        System.out.println("Chief Minister  : " + this.cm);
        System.out.println("Capital         : " + this.capital);
        System.out.println("Language        : " + this.lan);
        System.out.println("Districts       : " + this.districts);
        System.out.println("Population      : " + this.pop);
        System.out.println("Area            : " + this.area + " km²");
    }
}

// Main class
public class SingleLevelInheritanceExample1 {
    public static void main(String[] args) {
        // Creating Maharashtra object with both India and Maharashtra details
        Maharashtra obj = new Maharashtra(
            "Eknath Shinde", "Mumbai", "Marathi", 36, 112374333, 307713.0,
            "Droupadi Murmu", "Narendra Modi", "Delhi", 8, 29, "Hindi"
        );

        // Display details
        obj.displayIndia();
        System.out.println();
        obj.displayMaharashtra();
    }
}
