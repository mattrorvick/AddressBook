package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Entries {

    public static void menu() {

//        ArrayList<Integer> arrlist = new ArrayList<Integer>();
//        arrlist.add(14);
//        arrlist.add(7);
//        arrlist.add(39);
//        arrlist.add(40);
//
//        /* For Loop for iterating ArrayList */
//        System.out.println("For Loop");
//        for (int counter = 0; counter < arrlist.size(); counter++) {
//            System.out.println(arrlist.get(counter));
//        }

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
//                    System.out.print("Enter an entry's email to remove: ");

                    System.out.print("Enter an entry's id number to remove: ");

                    int otherInput = scanner.nextInt();

                    //consider a while loop instead?


                    //allEntries.toArray().length
                    for (int i = 0; i < allEntries.size(); i++) {
//                        for (int j = 1 + allEntries.size(); j > allEntries.indexOf(j); j--) {
//
//                        }

                        if (otherInput == i ) {
                            System.out.println();
                            System.out.println("Deleted the following entry: ");
                            System.out.println(allEntries.remove(i));
                            break;
                        }
//                        if (input.contains("@")) {
//
//                            System.out.println();
//                            System.out.println("Deleted the following entry: ");
//                            System.out.println(allEntries.remove(i));
//                        }
//                        else {
//                            System.out.println("*************************************");
////                            System.out.println("Email address not found.");
//
//                        }

                    }

                    System.out.println("*************************************");
                    System.out.println();
                    System.out.println("1. Add, 2. Remove, 3. Search, 4. Print, 5. Delete, 6. Quit");
                    break;
                case 3:
//                    System.out.println("1. First Name");
//                    System.out.println("2. Last Name");
//                    System.out.println("3. Phone Number");
//                    System.out.println("4. Email Address");
//                    System.out.println();
                    System.out.print("Search by id number: ");
                    otherInput = scanner.nextInt();
                    for (int i = 0; i < allEntries.size(); i++) {

                        if (otherInput == i ) {
                            System.out.println();
                            System.out.println("Search results for : " + i);
                            System.out.println(allEntries.get(i));
                            break;
                        }
//                        else
//                            System.out.println("Not found.");;
                    }
                    System.out.println("*************************************");
                    System.out.println();
                    System.out.println("1. Add, 2. Remove, 3. Search, 4. Print, 5. Delete, 6. Quit");
                    break;
                case 4:
                    //either or methods work below...

//                    System.out.println(allEntries.toString());
                    for (int i = 0; i < allEntries.size(); i++) {

                        System.out.println(allEntries.get(i));
                        System.out.println(i);
                    }
                    System.out.println("*************************************");
                    System.out.println();
                    System.out.println("1. Add, 2. Remove, 3. Search, 4. Print, 5. Delete, 6. Quit");
                    break;
                case 5:
                    System.out.println("Are you sure you'd like to clear your address book? Type Y for yes or N for no.");
                    String input = scanner.next();
                    if (input.equals("Y")) {
                        allEntries.clear();
                        System.out.println("*************************************");
                        System.out.println("Address book cleared!");
                        System.out.println("*************************************");
                        System.out.println();
                        System.out.println("1. Add, 2. Remove, 3. Search, 4. Print, 5. Delete, 6. Quit");
                        break;
                    }
                    else {
                        System.out.println("*************************************");
                        System.out.println("Okay, choose another option.");
                        System.out.println("*************************************");
                        System.out.println("1. Add, 2. Remove, 3. Search, 4. Print, 5. Delete, 6. Quit");
                        break;
                    }
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
