package week_4_writing_homework;

import java.util.Scanner;

/**
 * Read the numbers from the console entered by the user and print the minimum and maximum number
 * the user has entered.
 * -Before the user enters the number, print the message Enter number:
 * -If the user enters an invalid number, break out of the loop and print the minimum and maximum number.
 * Hint:
 * -Use an endless while loop.
 * -Create a class with the name MinAndMaxInputChallenge.
 */
public class Programme_2_MinAndMaxInputChallenge {
    public static void findMinAndMAxNumbers() {
        //Scanner declaration for reading input from console
        Scanner s = new Scanner(System.in);
        int min = 0;
        int max = 0;
        boolean first = true;
        //while loop
        while (true){
            System.out.println("Enter number :");
            boolean isAnInt = s.hasNextInt();
            if (isAnInt){
                int number = s.nextInt();
                if (first){
                    first = false;
                    min = number;
                    max = number;
                }
                if (number > max){
                    max = number;
                }
                if (number < min){
                    min = number;
                }

            }else{
                break;
            }
            s.nextLine(); //handle input
        }
        System.out.println("Min = "+min+ " , Max = "+max);
        s.close();
    }

    public static void main(String[] args) {
        findMinAndMAxNumbers();
    }
}
