/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MSII
 */
import java.util.Scanner;
//The condition if (x > 100) only checks the upper limit but misses the lower bound (x < 1).
//If a user enters an invalid number, the code still increments the index, so it doesn’t retry to get a valid input for that index.
//The error message says “between 0-100” but it should say “between 1-100
public class homework3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] marks = new double[6];
        double x;

        System.out.println("Give me the values between 1 and 100 inclusive:");

        for (int index = 0; index < marks.length; ) {
            System.out.print("index " + index + " --> ");
            x = input.nextDouble();

            if (x < 1 || x > 100) {
                System.out.println("Number should be between 1-100 inclusive");
            } else {
                marks[index] = x;
                index++;  // only increment if valid input
            }
        }

        input.close();
    }
}