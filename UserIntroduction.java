import java.util.Scanner;

public class UserIntroduction {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is your name?");
        System.out.print("User input: ");
        String name = input.next();

        System.out.println("How old are you?");
        System.out.print("User input:");
        int age = input.nextInt();

        System.out.println("What is your favorite hobby?");
        System.out.print("User input: ");
        String hobby = input.next();

        System.out.println("Nice to meet you!" + name);
        System.out.println("You are" + age + "years old and love" + hobby);



    }

    }

