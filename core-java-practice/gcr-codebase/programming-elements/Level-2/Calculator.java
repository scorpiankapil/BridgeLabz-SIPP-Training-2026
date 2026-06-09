import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        float number1 = sc.nextFloat();

        System.out.print("Enter second number: ");
        float number2 = sc.nextFloat();

        float addition = number1 + number2;
        float subtraction = number1 - number2;
        float multiplication = number1 * number2;
        float division = number1 / number2;

        System.out.println("Addition = " + addition);
        System.out.println("Subtraction = " + subtraction);
        System.out.println("Multiplication = " + multiplication);
        System.out.println("Division = " + division);

        sc.close();
    }
}