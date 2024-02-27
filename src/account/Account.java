package account;

public class Account {
    private int accountNumber;
    private double balance;
    private int number;
    private String customerName;
    private String email;

    public void deposit(double depositAmount){
        if (depositAmount > 0){
            this.balance += depositAmount;
            System.out.printf("You deposited %.2f. Your new account balance is %.2f%n", depositAmount, this.balance);
        }
    }

    public void withdraw(double withdrawalAmount){
        if (withdrawalAmount < this.balance && withdrawalAmount > 0){
            this.balance -= withdrawalAmount;
            System.out.printf("You withdraw %.2f. Your new balance is %.2f%n", withdrawalAmount, this.balance);
        }
        else {
            System.out.printf("Only %.2f available. Withdrawal not processed%n", this.balance);
        }

    }
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
