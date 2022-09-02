import java.util.Scanner;
public class TestAccounts2 {
    public static void main(String[] args) {

        // Variables
        Account account1, account2, account3;
        Scanner scan = new Scanner(System.in);
        String[] names = new String[3];

        // Loop that takes in the next three names and stores into the array.
        System.out.println("Please enter three names: ");
        for(int i = 0; i < 3; i++)
            names[i] = scan.next();

        // Creation of the three accounts & closes the first one. Then prints number of accounts.
        account1 = new Account(100, names[0]);
        account2 = new Account(100, names[1]);
        account3 = new Account(100, names[2]);
        System.out.println(account1 + "\n" + account2 + "\n" + account3);
        account1.close();
        System.out.println(account1); // Shows the updated account after being closed.
        System.out.println("Account 1 is now closed." + "\n" + Account.getNumAccounts() + " accounts remain.");
    }
}
