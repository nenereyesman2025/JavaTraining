import java.util.Scanner;

public class ArrayLoopPractice  {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        //Array of boxes

        String [][] students = {
                {"ME", "her", "him"},//grp1
                {"mel", "Lyt", "Wes"}, //grp2
        };

        //nested for loop
            for(int row = 0; row < students.length; row++) {
            for (int column = 0; column < students[row].length; column++ ) {

                System.out.println("Student at group " + row + ", section " + column + " is "+ students[row][column]);
            }


        }



        }
    }

