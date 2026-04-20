package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Provide first name: ");
        String firstName = input.nextLine();
        System.out.println("Provide last name: ");
        String lastName = input.nextLine();
        System.out.println("Provide middle name (if N/A, then skip): ");
        String middleInitial = input.nextLine();
        System.out.println("Provide suffix (if N/A, then skip): ");
        String suffix = input.nextLine();
        String fullName = "";
        fullName = firstName;

        if (!middleInitial.isEmpty()) {
            fullName = fullName + " " + middleInitial;
        }
        if (!lastName.isEmpty()) {
            fullName = fullName + " " + lastName;
        }
        if (!suffix.isEmpty()) {
            fullName = fullName + ", " + suffix;
        }
        System.out.print(fullName);

    }


}
