import java.util.Scanner;

public class MetroSmartCard {
    public static void main(String[] args) {
        double balance = 600.00;
        Scanner scanner = new Scanner(System.in);

        while (balance > 0) {
            System.out.print("Enter Distance in KM or Type -1 to exit: ");
            double distance = scanner.nextDouble();

            if (distance == -1) {
                System.out.println("Thank you for using Metro Smart Card!");
                break;
            }

            // Fare Calculation
            double fare = (distance <= 5) ? 10
                        : (distance <= 10) ? 20
                        : (distance <= 20) ? 30
                        : 50;

            // Balance Calculation
            if (balance >= fare) {
                balance -= fare;
                System.out.println("Fare deducted: " + fare);
                System.out.println("Available Balance: " + balance);
            } else {
                System.out.println("Insufficient Balance! Available Balance: " + balance);
                break;
            }
        }

        if (balance <= 0) {
            System.out.println("Card balance exhausted.");
        }

        scanner.close();
    }
}