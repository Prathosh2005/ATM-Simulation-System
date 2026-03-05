public class UserAccount {
   private String account_no;
   private String pin;
   private double balance;

    public UserAccount(String account_no, String pin, double balance) {
        this.account_no = account_no;
        this.pin = pin;
        this.balance = balance;
    }

    public String getAccount_no() {
        return account_no;
    }

    public double getBalance() {
        return balance;
    }

    public boolean isValidPin(String pin)
    {
        return pin.equals(this.pin);
    }

    public void deposit(double amt)
    {
        balance=balance+amt;
    }

    public void withdraw(double amt)
    {
        balance-=amt;
    }
}
