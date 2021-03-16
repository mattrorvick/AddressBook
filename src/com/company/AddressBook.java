package com.company;

public class AddressBook {

    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String emailAddress;

    public AddressBook() {}

    public AddressBook(String firstName, String lastName, String phoneNumber, String emailAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

//    @Override
//    public String toString() {
//        return "AddressBook{" +
//                "firstName='" + firstName + '\'' +
//                ", lastName='" + lastName + '\'' +
//                ", phoneNumber=" + phoneNumber +
//                ", emailAddress='" + emailAddress + '\'' +
//                '}';
//    }

    @Override
    public String toString() {
        return "*************************************" + '\n' + "First Name = " + firstName + '\n' + "Last Name = " + lastName + '\n' + "Phone Number = " + phoneNumber + '\n' + "Email Address = " + emailAddress + '\n';
    }
}
