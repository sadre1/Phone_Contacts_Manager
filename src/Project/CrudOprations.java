package Project;

// CrudOprations interface defines the basic CRUD (Create, Read, Update, Delete) operations for contact management.
public interface CrudOprations {
    // Method to insert a new contact into the contact management system.
    String insertContact(ContactDetails contactDetails);

    // Method to remove a contact from the contact management system by name.
    String removeContacts(String name);

    // Method to search for the position of a contact by name in the contact management system.
    int SearchPosition(String name);

    // Method to search for a contact by name in the contact management system and return its details.
    String SearchByName(String name);

    // Method to search for a contact by phone number in the contact management system and return its details.
    String SearchByPhoneNumber(String phoneNumber);

    // Method to update the phone number of a contact in the contact management system by name.
    Boolean UpdatePhoneNumber(String name, String phoneNumber);

    // Method to update the name of a contact in the contact management system by name.
    Boolean UpdateContactName(String name, String phoneNumber);

    // Method to display all contacts in the contact management system.
    void showAllContacts();
}
