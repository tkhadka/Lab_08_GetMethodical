import java.util.Scanner;
public class FavNumbers {

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        // Prompt the user for their favorite integer
        int userFavoriteInt = SafeInput.getInt(inputScanner, "Enter your favorite integer:");

        // Prompt the user for their favorite double
        double userFavoriteDouble = SafeInput.getDouble(inputScanner, "Enter your favorite double:");

        inputScanner.close(); // Close the Scanner

        // Print the user's favorite integer and favorite double
        System.out.println("Your favorite integer is: " + userFavoriteInt);
        System.out.println("Your favorite double is: " + userFavoriteDouble);
    }

}
