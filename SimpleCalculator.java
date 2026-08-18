import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
        double Sum;
        double Difference;
        double Product;
        double Quotient;
        double Remainder;

        System.out.print("Enter first number:");
        double firstNumber = input.nextDouble();
        System.out.println("Enter second number");
        double secondNumber = input.nextDouble();

        Sum = firstNumber + secondNumber;
        System.out.println("Sum:" + Sum);

        Difference = firstNumber - secondNumber;
        System.out.println("Difference:" + Difference);

        Product = firstNumber * secondNumber;
        System.out.println("Product" + Product);

        Quotient = firstNumber / secondNumber;
        System.out.println("Quotient:" + Quotient);

        Remainder = firstNumber % secondNumber;
        System.out.println("Remainder" + Remainder);



    }

    }

