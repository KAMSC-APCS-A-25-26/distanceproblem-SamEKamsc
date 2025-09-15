// NAME                  :   Sam Edmonds
// GROUP                 :   APCS-A
// LAST MODIFIED         :   9/9/25
// PROBLEM ID            :   Lewis 2.8
// PROBLEM DESCRIPTION   :   This program runs an inputted number of
//                       :   times and reads in two (x,y) coords and
//                       :   computes and outputs their distance
// SOURCES I USED        :   Mr. Houtrouw, Mr. Afsal
// PEOPLE I HELPED       :   n/a
// PEOPLE WHO HELPED ME  :   Mr. Houtrouw, Mr. Afsal

import java.util.Scanner;

public class DistanceMultiple {
    public static void main(String[] args) {
        // Creates Scanner
        Scanner sc = new Scanner(System.in).useDelimiter("[,()\\s]+");

        // Signature
        System.out.println("Sam Edmonds\nAPCS-A\nLewis 2.8\n\n");

        // Prompts, reads, and runs an inputted amount
        System.out.print("How many times would you like to run the program?  ");
        int numRuns = sc.nextInt();
        System.out.println("\n");
        for (int i = 0; i < numRuns; i++) {
            // Asks for, defines, and inputs two sets of (x, y) coords
            System.out.print("Enter two sets of (x, y) coordinates:  ");
            double x1 = sc.nextDouble(), y1 = sc.nextDouble(), x2 = sc.nextDouble(), y2 = sc.nextDouble();
            System.out.println();

            // Computes and outputs the distance between the points
            System.out.println("distance: " + Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2)) + "\n");
        }
    }
}