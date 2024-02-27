package account;

public class AccountMain {
    public static void main(String[] args) {
        Account account = new Account();

        System.out.println("Your initial balance is: " + account.getBalance());
        account.deposit(2000);
        account.deposit(-10000);
        account.withdraw(2000);
        account.withdraw(-2500);
    }
}
