import java.util.Arrays;
import java.util.Scanner;

public class NumberPrinter {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int number = input.nextInt();

//      Traditional for loop

        for(int count = 1; count <= number; count++){

        System.out.println(count);

    }
}}
