import java.util.Scanner;

public class IT26102412LabQ1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int first = input.nextInt();

        System.out.print("Enter the second integer: ");
        int second = input.nextInt();

        System.out.print("Enter the third integer: ");
        int third = input.nextInt();

        int smallest = first;
        int largest = first;

        if (second < smallest) {
            smallest = second;
        }
        if (third < smallest) {
            smallest = third;
        }

        if (second > largest) {
            largest = second;
        }
        if (third > largest) {
            largest = third;
        }

        System.out.println();
        System.out.println("User entered numbers are : " + first + " " + second + " " + third);
        System.out.println("The Smallest number is: " + smallest);
        System.out.println("The Largest number is: " + largest);

        input.close();
    }
}