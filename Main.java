import java.util.*;



public class Main
{
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
                    long acc_no=in.nextLong();
                    System.out.println("Enter the Pin");
                    int pin=in.nextInt();
                    
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