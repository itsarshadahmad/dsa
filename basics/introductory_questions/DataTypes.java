package basics.introductory_questions;

import java.util.Scanner;

/*
Datatype:-
https://practice.geeksforgeeks.org/problems/data-type-1666706751/1
*/
public class DataTypes {

    static int dataTypeSize(String str) {
        return switch (str) {
            case "Integer", "Float" -> 4;
            case "Long", "Double" -> 8;
            case "Character" -> 1;
            default -> 0;
        };
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter name of datatype: ");
        String datatypeName = scan.nextLine();
        int resultSize = dataTypeSize(datatypeName);
        System.out.println("Size: " + resultSize);
    }
}
