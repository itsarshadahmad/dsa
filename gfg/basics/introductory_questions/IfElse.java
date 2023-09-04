package basics.introductory_questions;

/*
if-else (Decision Making):
https://practice.geeksforgeeks.org/problems/java-if-else-decision-making0924/0
*/

import java.util.Scanner;

public class IfElse {
    static String compareNM(int n, int m) {
        if (n < m) {
            return "lesser";
        } else if (n == m) {
            return "equal";
        } else {
            return "greater";
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num1 = scan.nextInt();
        System.out.print("Enter a number that you want to compare: ");
        int num2 = scan.nextInt();
        String resultComparison = compareNM(num1, num2);
        System.out.println(resultComparison);
    }
}
