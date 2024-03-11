import java.util.Scanner;

public class Reggie {

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        // Get Social Security Number (SSN) from the user
        String userSSN = SafeInput.getRegExString(inputScanner, "Enter your Social Security Number (XXX-XX-XXXX)", "^\\d{3}-\\d{2}-\\d{4}$");

        // Get UC Student M number from the user
        String userMNumber = SafeInput.getRegExString(inputScanner, "Enter your UC Student M number", "^(M|m)\\d{5}$");

        // Get menu choice from the user
        String userMenuChoice = SafeInput.getRegExString(inputScanner, "Enter your menu choice (O for Open, S for Save, V for View, Q for Quit)", "^[OoSsVvQq]$");


        System.out.println("Your Social Security Number: " + userSSN);
        System.out.println("Your UC Student M number: " + userMNumber);
        System.out.println("Your menu choice: " + userMenuChoice.toUpperCase()); // Convert to uppercase for consistency
    }
}
