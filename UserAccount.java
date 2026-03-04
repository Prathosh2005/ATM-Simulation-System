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

    public void setAccount_no(String account_no) {
        this.account_no = account_no;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
