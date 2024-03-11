import java.util.Scanner;

public class BirthDateTime {

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        // Input year of birth (1950-2015)
        int userYear = SafeInput.getRangedInt(inputScanner, "Enter the year of birth", 1950, 2015);

        // Input month of birth (1-12)
        int userMonth = SafeInput.getRangedInt(inputScanner, "Enter the month of birth", 1, 12);

        // Input day of birth
        int maxDay; // Maximum number of days for the selected month
        switch (userMonth) {
            case 2: // February
                maxDay = 29;
                break;
            case 4: case 6: case 9: case 11: // April, June, September, November
                maxDay = 30;
                break;
            default: // All other months
                maxDay = 31;
                break;
        }
        int userDay = SafeInput.getRangedInt(inputScanner, "Enter the day of birth", 1, maxDay);

        // Input hour of birth (1-24)
        int userHour = SafeInput.getRangedInt(inputScanner, "Enter the hour of birth", 1, 24);

        // Input minute of birth (1-59)
        int userMinute = SafeInput.getRangedInt(inputScanner, "Enter the minute of birth", 1, 59);

        inputScanner.close(); // Close the Scanner

        // Display the user's birth date and time
        System.out.println("Your date and time of birth:");
        System.out.println("Year: " + userYear);
        System.out.println("Month: " + userMonth);
        System.out.println("Day: " + userDay);
        System.out.println("Hour: " + userHour);
        System.out.println("Minute: " + userMinute);
    }
}
