package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBookMethods {



    public static void menu() {

        List allEntries = new ArrayList<>();

        ArrayList<String> entry = new ArrayList<String>();

        int option = '\0';

        int count = 0;

        Scanner scanner = new Scanner(System.in);


        System.out.println("1. Add an entry");
        System.out.println("2. Remove an entry");
        System.out.println("3. Search for a specific entry");
        System.out.println("4. Print Address Book");
        System.out.println("5. Delete Book");
        System.out.println("6. Quit");
        System.out.println();
        System.out.println("Please choose what you'd like to do with the database:");

        do {

            option = scanner.nextInt();

            switch(option) {
                case 1:

                    System.out.print("First Name: ");
                    entry.add(scanner.next());
                    System.out.print("Last Name: ");
                    entry.add(scanner.next());
                    System.out.print("Phone Number: ");
                    entry.add(scanner.next());
                    System.out.print("Email Address: ");
                    entry.add(scanner.next());

//                    allEntries.add(entry);

                    System.out.println();
                    System.out.println("Added new entry!");
                    System.out.println();
                    System.out.println("*************************************");
                    System.out.println();

                    System.out.println("1. Add, 2. Remove, 3. Search, 4. Print, 5. Delete, 6. Quit");
                    break;
                case 2:
                    System.out.print("Enter an entry's email to remove: ");
                    String emailToRemove = scanner.next();
                    if (true) {
                        System.out.println("Deleted the following entry: ");
                        System.out.println("*************************************");
                        System.out.println("First Name: ");
                        System.out.println("Last Name: ");
                        System.out.println("Phone Number: ");
                        System.out.println("Email Address: ");
                        System.out.println("*************************************");
                    }
                    else
                        System.out.println("Invalid email address.");

                    System.out.println("1. Add, 2. Remove, 3. Search, 4. Print, 5. Delete, 6. Quit");
                    break;
                case 3:
                    break;
                case 4:
                    while(count < 5) {
                        System.out.println("*************************************");
                        System.out.println("First Name: " + entry.get(0));
                        System.out.println("Last Name: " + entry.get(1));
                        System.out.println("Phone Number: " + entry.get(2));
                        System.out.println("Email Address: " + entry.get(3));
                        System.out.println("*************************************");
                        count++;
                    }
                    break;
                case 5:
                    System.out.println("Are you sure you'd like to clear your address book? Type Y for yes or N for no.");
                    scanner.next();
                    if (scanner.equals('Y'))
                        System.out.println("Address book cleared!");
                        //code to clear address book.
                    else
                        System.out.println("*************************************");
                    System.out.println("1. Add, 2. Remove, 3. Search, 4. Print, 5. Delete, 6. Quit");
                    break;
                case 6:
                    System.out.println("You have quit the program.");
                    scanner.close();
                    break;
                default:
                    System.out.println("User input invalid. Please enter a number between 1-6.");
                    break;

            }
        }
        while(option != 0);




    }

}
