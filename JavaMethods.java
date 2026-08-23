import java.util.Scanner;
import java.util.Arrays;
import java.util.Stack;

public class JavaMethods {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter firstNumber: ");
        int firstNumber = input.nextInt();
        System.out.print("Enter secondNumber: ");
        int secondNumber = input.nextInt();

        Add(firstNumber, secondNumber);
        Subtract(firstNumber,secondNumber  );
        Multiply(firstNumber,secondNumber);
        Divide(firstNumber,secondNumber);

    }

    public static double Add(int input1, int input2) {
        int sum = input1 + input2;
        System.out.println("The sum is " + sum);

        return sum;
    }

    public static double Subtract(int input1, int input2) {
        int difference = input1 - input2;
        System.out.println("The difference is " + difference);

        return difference;

    }

    public static double Multiply(int input1, int input2){
        int product = input1 * input2;
        System.out.println("The product is " + product);

        return product;

    }
    public static double Divide(int input1, int input2){
        int quotient = input1 / input2;
        System.out.println("The quotient is " + quotient);

        return quotient;

    }
}

