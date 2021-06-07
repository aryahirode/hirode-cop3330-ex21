/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Arya Hirode
 */
package base;

import java.util.Scanner;

public class MonthNumber {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        MonthNumber myApp = new MonthNumber();
        myApp.output();
    }

    private int numPrompt() {
        System.out.print("Please enter the number of the month: ");
        return Integer.parseInt(in.nextLine());
    }

    private String monthList(int num) {
        return switch (num) {
            case 1 -> "The name of the month is January.";
            case 2 -> "The name of the month is February.";
            case 3 -> "The name of the month is March.";
            case 4 -> "The name of the month is April.";
            case 5 -> "The name of the month is May.";
            case 6 -> "The name of the month is June.";
            case 7 -> "The name of the month is July.";
            case 8 -> "The name of the month is August.";
            case 9 -> "The name of the month is September.";
            case 10 -> "The name of the month is October.";
            case 11 -> "The name of the month is November.";
            case 12 -> "The name of the month is December.";
            default -> "Invalid number.";
        };
    }

    private void output() {
        System.out.println(monthList(numPrompt()));
    }
}
