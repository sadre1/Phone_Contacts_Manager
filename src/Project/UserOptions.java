package Project;

import java.util.Scanner;

public class UserOptions {
    private static DoubleLinkListImplementation does = new DoubleLinkListImplementation();
    private static Scanner scanner = new Scanner(System.in);

    // Method to add a new contact
    static void addContact() {
        System.out.print("Enter contact name: ");
        String name = scanner.nextLine();
        System.out.print("Enter contact phone number: ");
        String phoneNumber = scanner.nextLine();

        // Create a new Contact object and add it to the double linked list
        does.insertContact(new ContactDetails(name, phoneNumber));
        System.out.println("Contact added successfully!");
    }

    // Method to view all contacts
    static void viewAllContacts() {
        System.out.println("All Contacts:");
        does.showAllContacts();
    }

    // Method to update contact name
    static void updateContactName() {
        System.out.print("Enter the old contact name: ");
        String oldName = scanner.nextLine();
        System.out.print("Enter the new contact name: ");
        String newName = scanner.nextLine();

        if (does.UpdateContactName(oldName, newName)) {
            System.out.println("Contact name updated successfully!");
        } else {
            System.out.println("Contact not found with the given name: " + oldName);
        }
    }

    // Method to update contact phone number
    static void updateContactPhoneNumber() {
        System.out.print("Enter the contact name: ");
        String name = scanner.nextLine();
        System.out.print("Enter the new phone number: ");
        String newPhoneNumber = scanner.nextLine();

        if (does.UpdatePhoneNumber(name, newPhoneNumber)) {
            System.out.println("Contact phone number updated successfully!");
        } else {
            System.out.println("Contact not found with the given name: " + name);
        }
    }

    // Method to search a contact by name
    static void searchByName() {
        System.out.print("Enter the contact name to search: ");
        String name = scanner.nextLine();
        System.out.println(does.SearchByName(name));
    }

    // Method to search a contact by phone number
    static void searchByPhoneNumber() {
        System.out.print("Enter the phone number to search: ");
        String phoneNumber = scanner.nextLine();
        System.out.println(does.SearchByPhoneNumber(phoneNumber));
    }

    // Method to remove a contact from the list
    public static void removeConts() {
        System.out.print("Enter the contact name to Remove: ");
        String name = scanner.nextLine();
        System.out.println(does.removeContacts(name));
    }
}
