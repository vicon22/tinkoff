package com.eveiled.ex00;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberFirstGroupTasks = scanner.nextInt();
        int numberSecondGroupTasks = scanner.nextInt();
        int numberTasks = scanner.nextInt();

        boolean ans = numberFirstGroupTasks > Math.ceil((double) numberSecondGroupTasks / numberTasks);
        if (ans) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
