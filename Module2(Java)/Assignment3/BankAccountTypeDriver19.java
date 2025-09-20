class BankAccountType {
    int accountNo;
    String accountHolder;
    double balance;

    BankAccountType(int accountNo, String accountHolder, double balance) {
        this.accountNo = accountNo;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void displayBankAccountType() {
        System.out.println(accountHolder + " → Balance = " + balance);
    }
}

class SavingAccount extends BankAccountType {
    double interestRate;

    SavingAccount(int accountNo, String accountHolder, double balance, double interestRate) {
        super(accountNo, accountHolder, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void displayBankAccountType() {
        double interest = balance * interestRate / 100;
        System.out.println(accountHolder + " -> Balance = " + balance + ", Interest = " + interest);
    }
}

class CurrentAccount extends BankAccountType {
    double overdraftLimit;

    CurrentAccount(int accountNo, String accountHolder, double balance, double overdraftLimit) {
        super(accountNo, accountHolder, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void displayBankAccountType() {
        System.out.println(accountHolder + " -> Balance = " + balance + ", Overdraft Limit = " + overdraftLimit);
    }
}

class BankAccountTypeDriver19 {
    public static void main(String[] args) {
        SavingAccount b1 = new SavingAccount(101, "Dhiraj", 5000, 5);
        b1.displayBankAccountType();

        CurrentAccount b2 = new CurrentAccount(102, "Patil", 2000, 1000);
        b2.displayBankAccountType();
    }
}
