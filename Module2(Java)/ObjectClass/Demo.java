// Base class
class RBI {
    // final method cannot be overridden by subclasses
    public final void guidelines() {
        System.out.println("Don't share your personal details with anyone.");
        System.out.println("RBI doesn't call for OTP.");
    }
}

// Subclass SBI trying to override final method (This will cause compile-time error)
class SBI extends RBI {
    public void rateOfInterest() {
        System.out.println("ROI: " + 8.9 + " %");
    }

    // Uncommenting this method will cause compiler error because guidelines() is final in RBI
    /*
    public void guidelines() {  
        System.out.println("This will cause a compile-time error");
    }
    */
}

// Subclass BOI, does not override final method
class BOI extends RBI {
    public void rateOfInterest() {
        System.out.println("ROI: " + 8.9 + " %");
    }
}

// Demo class to test
class Demo {
    public static void main(String[] args) {
        SBI obj = new SBI();
        obj.guidelines();        // Calls RBI's final guidelines() method
        obj.rateOfInterest();
    }
}
