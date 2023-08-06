package Project;

import java.util.Scanner;

public class Main {
    // Method to display the menu options
    private static void printMenu() {
        String horizontalLine = "+-------------------------+\n";
        String titleLine = "| Phone Contact Management |\n";
        String option1 = "| 1. Add a new contact     |\n";
        String option2 = "| 2. View all contacts     |\n";
        String option3 = "| 3. Update contact name   |\n";
        String option4 = "| 4. Update contact phone number |\n";
        String option5 = "| 5. Search contact by name |\n";
        String option6 = "| 6. Search contact by phone number |\n";
        String option7 = "| 7. Remove contact from the list |\n";
        String option8 = "| 8. Exit                 |\n";
        String choicePrompt = "+-------------------------+\n\nEnter your choice: ";

        System.out.print(horizontalLine + titleLine + horizontalLine);
        System.out.print(option1 + option2 + option3 + option4);
        System.out.print(option5 + option6 + option7 + option8);
        System.out.print(choicePrompt);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean runningState = true;
        while (runningState) {
            printMenu();
            int option = sc.nextInt();
            sc.nextLine(); // Consume the newline character after reading the integer

            switch (option) {
                case 1 -> UserOptions.addContact(); // Call the method to add a new contact
                case 2 -> UserOptions.viewAllContacts(); // Call the method to view all contacts
                case 3 -> UserOptions.updateContactName(); // Call the method to update a contact's name
                case 4 -> UserOptions.updateContactPhoneNumber(); // Call the method to update a contact's phone number
                case 5 -> UserOptions.searchByName(); // Call the method to search a contact by name
                case 6 -> UserOptions.searchByPhoneNumber(); // Call the method to search a contact by phone number
                case 7 -> UserOptions.removeConts(); // Call the method to search a contact by phone number
                case 8 -> runningState = false; // Exit the loop to end the program
                default -> System.out.println("Invalid option. Please try again.");
            }
        }

        System.out.println("Exiting the application. Goodbye!");
        sc.close(); // Close the scanner when the program is done running
    }
}
