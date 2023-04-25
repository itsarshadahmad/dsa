package src.basics.introductory_questions;

import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scan.nextLine();
        System.out.println("Hi! " + name + ". Welcome to introductory coding section.");
    }
}
