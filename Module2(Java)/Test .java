class Bank {
    private double balance = 1000;
    private void setBalance(double amount) { balance = amount; }
    public double getBalance() { return balance; }
}

public class Test {
    public static void main(String[] args) {
        Bank b = new Bank();
        // b.setBalance(5000); ❌ not accessible
        System.out.println(b.getBalance());
    }
}
