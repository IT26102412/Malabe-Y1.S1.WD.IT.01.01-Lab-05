import java.util.Scanner;

public class IT26102412LabQ3{
    public static void main(String[] args) {
        // Constants for fixed values
        final double ROOM_CHARGE_PER_DAY = 48000.00;
        final double NO_DISCOUNT = 0.0;
        final double DISCOUNT_3_TO_4_DAYS = 10.0;
        final double DISCOUNT_5_OR_MORE_DAYS = 20.0;
        final int MIN_DATE = 1;
        final int MAX_DATE = 31;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Start Date (1-31): ");
        int startDate = input.nextInt();

        System.out.print("Enter End Date (1-31): ");
        int endDate = input.nextInt();

        // Validation 1: dates must be between 1 and 31
        if (startDate < MIN_DATE || startDate > MAX_DATE ||
            endDate < MIN_DATE || endDate > MAX_DATE) {
            System.out.println("Error: Days must be between 1 and 31");
            input.close();
            return;
        }

        // Validation 2: start date must be less than end date
        if (startDate >= endDate) {
            System.out.println("Error: Start Date must be less than End Date");
            input.close();
            return;
        }

        int daysReserved = endDate - startDate;
        double totalAmount = daysReserved * ROOM_CHARGE_PER_DAY;

        double discountRate;
        if (daysReserved >= 5) {
            discountRate = DISCOUNT_5_OR_MORE_DAYS;
        } else if (daysReserved >= 3) {
            discountRate = DISCOUNT_3_TO_4_DAYS;
        } else {
            discountRate = NO_DISCOUNT;
        }

        totalAmount = totalAmount - (totalAmount * discountRate / 100);

        System.out.println();
        System.out.println("Room Charge Per Day: Rs. " + ROOM_CHARGE_PER_DAY + "/=");
        System.out.println("Number of Days Reserved: " + daysReserved);
        System.out.println("Total Amount to be Paid: " + totalAmount);

        input.close();
    }
}