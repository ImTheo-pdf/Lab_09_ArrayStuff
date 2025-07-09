import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner in = new Scanner(System.in);
        int[] dataPoints = new int[100];

        // Task 2
        for (int i = 0; i < dataPoints.length; i++) { // fill array
            dataPoints[i] = rnd.nextInt(100) + 1; // 1 to 100
        }

        // Task 3
        for (int i = 0; i < dataPoints.length; i++) { // print array
            System.out.print(dataPoints[i]);
            if (i < dataPoints.length - 1) {
                System.out.print(" | ");
            }
        }
        System.out.println(); // new line

        // Task 4
        int sum = 0;
        for (int value : dataPoints) {
            sum += value;
        }
        double average = (double) sum / dataPoints.length;
        System.out.println("\nThe sum of all values in dataPoints is: " + sum);
        System.out.println("The average of all values in dataPoints is: " + average);

        // task 5
        int userValue = SafeInput.getRangedInt(in, "Enter an integer between 1 and 100", 1, 100);

        // task 6
        int count = 0;
        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == userValue) {
                count++;
            }
        }


        System.out.println("\nThe value " + userValue + " was found " + count + " time(s) in the dataPoints array."); // Result

        // task 7
        int searchValue = SafeInput.getRangedInt(in, "Enter another integer between 1 and 100 to find its first position", 1, 100);
        boolean found = false;
        int position = -1;
        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == searchValue) {
                found = true;
                position = i;
                break;
            }
        }
        if (found) {
            System.out.println("The value " + searchValue + " was found at array index " + position + ".");
        } else {
            System.out.println("The value " + searchValue + " was not found in the dataPoints array.");
        }

        // Task 8
        int min = dataPoints[0];
        int max = dataPoints[0];

        for (int i = 1; i < dataPoints.length; i++) {
            if (dataPoints[i] < min) {
                min = dataPoints[i];
            }
            if (dataPoints[i] > max) {
                max = dataPoints[i];
            }
        }

        System.out.println("\nThe minimum value in dataPoints is: " + min);
        System.out.println("The maximum value in dataPoints is: " + max);

        System.out.println("\nAverage of dataPoints using static method is: " + getAverage(dataPoints));
    }
    public static double getAverage(int values[]) {
        int sum = 0;
        for (int val : values) {
            sum += val;
        }
        return (double) sum / values.length;
    }
}
