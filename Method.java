import java.util.Scanner;

public class Method {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int inputA = 10;
        int inputB = 5;
        Add(inputA, inputB);
    }

    public static double Add(int inputA, int inputB) {
        int sum = inputA + inputB;

        System.out.println("The sum is: " + sum);

        return 0;
    }
}