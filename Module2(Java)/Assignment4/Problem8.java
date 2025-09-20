//Payment Processing

class Problem8{
    public static void main(String[] args) {
        processPayment();
    }

    static void processPayment() {
        try {
            int amount = 100;
            if (amount > 0) {
                throw new Exception("Payment failed");  
            }
            System.out.println("Payment successful");
        } 
        catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        } 
        finally {
            System.out.println("Cleanup done");
        }
    }
}
