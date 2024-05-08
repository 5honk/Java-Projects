import java.util.Scanner;
// Programme: Continutiue the programme untill told not to 

public class UserInputLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter 'exit' to terminate the program:");
        
        while (true) {
            String input = scanner.nextLine();
            
            if (input.equals("exit")) {
                System.out.println("Exiting the program...");
                System.exit(0); 
            }
            
            // Do other operations here if needed
            System.out.println("You entered: " + input);
        }

        if (input == 1) {
            System.out.println("lol");
        }
    }
        
      

    }
