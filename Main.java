import java.util.*;
import java.util.Map;
import java.util.HashMap;
public class Main
{
    static Map<String,UserAccount> userAccountMap=new HashMap<>();

    public Main() {
        userAccountMap.put("123456789", new UserAccount("123456789", "0609", 500.0));
        userAccountMap.put("123456790", new UserAccount("123456790", "6090", 500.0));
    }
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        boolean running=true;
        System.out.println("Welcome to the ATM");
        while(running)
        {
            System.out.println("\nPress 1 to login");
            System.out.println("Press 2 to exit");
            int n=in.nextInt();

            switch (n)
            {
                case 1 -> {
                    System.out.println("\nEnter the Account No");
                    String acc_no=in.next();
                    if(userAccountMap.containsKey(acc_no)){
                    UserAccount userAccount= userAccountMap.get(acc_no);
                        System.out.println("Enter the Pin");
                        String pin = in.next();
                        in.nextLine();
                        if(userAccount.getPin().equals(pin)) {

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
}