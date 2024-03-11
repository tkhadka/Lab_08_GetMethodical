import java.util.Scanner;

public class CheckOut {

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        double totalCost = 0.0;

        // Loop to input items until the user indicates they have no more
        do {
            // Input price of the item (.50 cents to $10.00 dollars)
            double itemPrice = SafeInput.getRangedDouble(inputScanner, "Enter the price of the item", 0.50, 10.00);
            totalCost += itemPrice; // Add the price of the current item to the total cost

            // Ask if the user has more items to input
            boolean hasMoreItems = SafeInput.getYNConfirm(inputScanner, "Do you have more items to add?");
            if (!hasMoreItems) {
                break; // Exit the loop if the user indicates they have no more items
            }
        } while (true);

        // Display the total cost of the items to 2 decimal places
        System.out.printf("Total cost of the item(s): $%.2f%n", totalCost);
    }
}
