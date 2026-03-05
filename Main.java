import java.util.*;
import java.util.Map;
import java.util.HashMap;
public class Main
{
    static Map<String,UserAccount> userAccountMap=new HashMap<>();





    static Scanner in=new Scanner(System.in);
    public static void main(String[] args)
    {
        userAccountMap.put("123456789", new UserAccount("123456789", "0609", 500.0));
        userAccountMap.put("123456790", new UserAccount("123456790", "6090", 500.0));

        boolean running=true;
        System.out.println("Welcome to the ATM");
        while(running)
        {
            System.out.println("\nPress 1 to login");
            System.out.println("Press 2 to exit");
            int n=in.nextInt();
            in.nextLine();

            switch (n)
            {
                case 1 -> {
                    System.out.println("\nEnter the Account No");
                    String acc_no=in.nextLine();
                    UserAccount userAccount= userAccountMap.get(acc_no);
                    if(userAccount!=null)
                    {
                        System.out.println("Enter the Pin");
                        String pin = in.next();
                        in.nextLine();
                        if(userAccount.isValidPin(pin)) {
                            showMenu(userAccount);
                        }
                        else
                        {
                            System.out.println("Invalid Pin");
                            continue;
                        }
                    }
                    else {
                        System.out.println("Incorrect Account No");
                        continue;
                    }
                    
                    // Temporary;
                    System.out.println("Login attempt received.");
                }

                case 2 -> {

                    System.out.println("Thank you for using the ATM");
                    running=false;

                }

                default -> {
                    System.out.println("Enter a valid number");
                }
            }
        }
        in.close();
    }

    private static void showMenu(UserAccount userAccount)
    {
        boolean running=true;
        while(running) {
            System.out.println("Press 1 to Deposit\nPress 2 to Withdraw\nPress 3 to Check Balance\nPress 4 to exit");
            int n = in.nextInt();
            switch (n) {
                case 1 -> {
                    System.out.println("Enter the amt to Deposit");
                    double amt=in.nextDouble();
                    if(amt>0) {
                        userAccount.deposit(amt);
                        System.out.println(amt+" Deposited ,Current Balance "+ userAccount.getBalance());
                    }
                    else{
                        System.out.println("Invalid amount");
                    }
                }

                case 2-> {
                    System.out.println("Enter the Amount to withdraw");
                    double amt = in.nextDouble();
                    double bal = userAccount.getBalance();
                    if (amt <= bal) {
                        userAccount.withdraw(amt);
                        System.out.println(amt + " Debited ,Current Balance " + userAccount.getBalance());
                    } else {
                        System.out.println("Insufficient balance");
                        continue;
                    }
                }

                case 3 -> {
                    System.out.println("Your balance is "+userAccount.getBalance());
                }

                case 4 -> {
                    running=false;
                }

                default -> {
                    System.out.println("Enter a valid number");
                }
            }
        }
    }
}