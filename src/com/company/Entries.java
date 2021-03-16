package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Entries {

    public static void menu() {

        AddressBook addressBook = new AddressBook();

        ArrayList<String> allEntries = new ArrayList<String>();


        int option = '\0';

        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Add an entry");
        System.out.println("2. Remove an entry");
        System.out.println("3. Search for a specific entry");
        System.out.println("4. Print Address Book");
        System.out.println("5. Delete Book");
        System.out.println("6. Quit");
        System.out.println();
        System.out.println("Please choose what you'd like to do with the database by entering 1-6:");

        do {

            option = scanner.nextInt();

            switch(option) {
                case 1:

                    System.out.print("First Name: ");
                    addressBook.setFirstName(scanner.next());
                    System.out.print("Last Name: ");
                    addressBook.setLastName(scanner.next());
                    System.out.print("Phone Number: ");
                    addressBook.setPhoneNumber(scanner.next());
                    System.out.print("Email Address: ");
                    addressBook.setEmailAddress(scanner.next());
                    System.out.println();

                    String entries = addressBook.toString();
                    allEntries.add(entries);

                    System.out.println("Added new entry!");
                    System.out.println();
                    System.out.println("*************************************");
                    System.out.println();
                    System.out.println("1. Add, 2. Remove, 3. Search, 4. Print, 5. Delete, 6. Quit");
                    break;
                case 2:
                    System.out.println("Enter an entry's email to remove: ");
                    String input = scanner.next();

                    for (String singleEntry : allEntries) {
                        if (singleEntry.contains(input)) {

                            //delete single entry from all entries somehow.....

                            System.out.println("Deleted the following entry: ");

                            // print out entry that was detected with specific email address
                            System.out.println(singleEntry);

                            //cannot remove from list if browsing it with a for:each loop
                            // allEntries.remove(singleEntry);
                        }
                        else
                            System.out.println("Email doesn't exist in address book.");
                    }

                    System.out.println("*************************************");
                    System.out.println();
                    System.out.println("1. Add, 2. Remove, 3. Search, 4. Print, 5. Delete, 6. Quit");
                    break;
                case 3:
                    break;
                case 4:
//                    System.out.println(addressBook.toString());
                    System.out.println(allEntries.toString());
                    System.out.println("*************************************");
                    System.out.println();
                    System.out.println("1. Add, 2. Remove, 3. Search, 4. Print, 5. Delete, 6. Quit");
                    break;
                case 5:
                    System.out.println("Are you sure you'd like to clear your address book? Type Y for yes or N for no.");
                    scanner.next();
                    if (scanner.equals('Y'))
                        System.out.println("Address book cleared!");
                        //code to clear address book.
                    else
                        System.out.println("*************************************");
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
