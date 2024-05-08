
// Learning how to get user input via the terminal 

import java.util.Scanner;  

public class uinput {
    public static void main (String[] args) {

    // First Create Memory for the Object
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Name");
        String name = scanner.nextLine();
        System.out.println(name);

        System.out.println("Enter Age:");
        int age = scanner.nextInt();
        System.out.println(age);

        
    }
}