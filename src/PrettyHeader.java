import java.util.Scanner;

public class PrettyHeader {

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        // Prompt the user for the message to be centered in the pretty header
        System.out.print("Enter the message to be centered in the pretty header: ");
        String userMessage = inputScanner.nextLine();

        // Print the pretty header with the centered message
        SafeInput.prettyHeader(userMessage);
    }
}
