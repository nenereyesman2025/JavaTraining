import java.util.Scanner;

public class EnhancedForLoop {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        String [][] toys     = {
                {"bear", "plane", "apple"},
                {"coconut", "dog"}
        };

        for (String[] shelf:toys) {
            for (String toy:shelf) {
                System.out.println("Toy in: " +toy);
            }
        }

        };


    }

