import java.util.Scanner;
import java.lang.Math;

/*
 * Todo List: 
 *      do other sections like login and other

/*
 * Create a Bank System via Terminal for users to:
 *  1. Create Different types of Bank accounts: Saving, ISA, Checking.
 *  2. Create A 2x customer with more than one Account 
 *  3. Bank to withdraw and deposit
 * 
 */

 // Menu for user to choose from create an account and login ect
class Mmenu {  // Creating a function for reusability, if the user wants to go back to the menu
    static int InputMenu;
    Scanner scanner = new Scanner (System.in); ///////

    public static void menu() {
        System.out.println("\n\t\t-------Bank of 5honk------"); 
        System.out.println("\n\t1. Login  2. Create Account   3. Other\n\n");
        System.out.println("Input: ");
        
    // Save user input for menu
       
    }

    public static void checkrequest() {
        System.out.println("Confirm with option(s)?   Y/N");
        Scanner scanner = new Scanner (System.in);
        String yesorno = scanner.nextLine();

        if (yesorno == "y") {
            System.out.println("Currently in " + InputMenu);
        } else if (yesorno == "n") {
            menu();
        } else {
            System.out.println("[[ERROR: Invalid option, try again...]]\n\n");
            menu();
        }
    }
}

class CreateAccountPage extends Account{
    public void creatingacc() {
        System.out.println("\n\t\t------Create Your Account------");
        System.out.println("Please enter a series of questions to create your account");

        Scanner scanner = new Scanner(System.in);
        
        int i = 0;
        while (i == 0) {
            System.out.println("Enter Day of Birth (format: 00/00/0000)");
            String DOB = scanner.nextLine();
            System.out.println("1. Day of Date of Birth\t" + DOB + "\n\n");

            System.out.println("Enter Today's Date (format: 00/00/0000) ");
            String DateOfAccountCreation = scanner.nextLine();
            System.out.println("2. Today's Date\t" + DateOfAccountCreation + "\n\n");

            System.out.println("Enter First Your Name");
            String FirstName = scanner.nextLine();
            System.out.println("3. First Name:\t" + FirstName + "\n\n");

            System.out.println("Enter Your Second Name");
            String SecondName = scanner.nextLine();
            System.out.println("4. Second Name:\t" + SecondName + "\n\n");

            // Verification of Data

            System.out.println("\n\t\t------Detail Confirmation------");
            System.out.println("1. Day of Date of Birth\t" + DOB + "\n\n");
            System.out.println("2. Today's Date\t" + DateOfAccountCreation + "\n\n");
            System.out.println("3. First Name:\t" + FirstName + "\n\n");
            System.out.println("4. Second Name:\t" + SecondName + "\n\n");

            // Login Details 
            // Creating Unique username + Password

             double username = Math.random() * (9999 - 1) + 1;
             double password = Math.random() * (9999 - 1) + 1;

            System.out.println("Your Login Details are\nUsername:" + username + "\nPassword:" + password);
    
            i = 1;
        }  
    
   
    }
}

class AccountDetails {
    String DOB;
    String DateOfAccountCreation;

    double username; 
    double password;
    int CardNumber;
    int CCV;
    
    String FullName = "FirstName + SecondName";
    String FirstName;
    String SecondName;
}


class Account extends AccountDetails {
    String DOB;
    String DateOfAccountCreation;

    public double username;
    public double password;
    int CardNumber;
    int CCV;
    
    String FullName = "FirstName + SecondName";
    String FirstName;
    String SecondName;

}

 public class BankSystem {
    public static void main (String[] args) { 
        System.out.print("\033[H\033[2J");

        Mmenu m = new Mmenu();  
        CreateAccountPage cap = new CreateAccountPage();
        m.menu();

        Scanner scanner = new Scanner (System.in);
        int InputMenu = scanner.nextInt();

        if (InputMenu == 1) {
            System.out.println("\nChoice = 1. Login");
        } else if (InputMenu == 2) {
            System.out.println("\nChoice = 2. Create Account");
            System.out.print("\033[H\033[2J");      // clears previous terminal output 
            cap.creatingacc();

        } else if (InputMenu == 3) {
            System.out.println("\nChoice = 3. Other");
        } else {
            System.out.print("\033[H\033[2J");
            System.out.println("[[ERROR: Invalid option, try again...]]\n\n");
            m.menu();
        }







    }
 }