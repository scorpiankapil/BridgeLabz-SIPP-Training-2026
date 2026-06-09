import java.util.*;

public class TaxBracket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your income: ");
        double income = sc.nextDouble();
        double tax;
        String tax_bracket;
        tax = 0;
        tax_bracket = "No tax";
        if (income <= 5000) {
            tax = income * 0.05;
            tax_bracket = "tax of 5%";
        } else if (income <= 10000) {
            tax = income * 0.10;
            tax_bracket = "tax of 10%";
        }
        System.out.println("Your tax is: " + tax);
        System.out.println("Your tax bracket is: " + tax_bracket);
    }
}