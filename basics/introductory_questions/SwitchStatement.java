package basics.introductory_questions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Java Switch Case statement:
https://practice.geeksforgeeks.org/problems/java-switch-case-statement3529/1
 */
public class SwitchStatement {
    static double switchCase(int choice, List<Double> arr) {
        return switch (choice) {
            case 1 -> Math.PI * arr.get(0) * arr.get(0);
            case 2 -> arr.get(0) * arr.get(1);
            default -> 0;
        };
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter choice 1 or 2: ");
        int choice = scan.nextInt();
        ArrayList<Double> list = new ArrayList<>();

        System.out.println("Enter numbers: ");
        list.add(scan.nextDouble());
        if (choice != 1) {
            list.add(scan.nextDouble());
        }

        double result = switchCase(choice, list);
        System.out.println(result);
    }
}
