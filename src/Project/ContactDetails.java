package Project;

// ContactDetails class represents the details of a contact.
public class ContactDetails {
    private String Name; // The name of the contact.
    private String PhoneNumber; // The phone number of the contact.
    private int Position; // The position of the contact in the list.
    private static int pos = 0; // Static variable to track the position of each new contact.

    // Constructor to create a new ContactDetails object with the given name and phone number.
    public ContactDetails(String name, String phoneNumber) {
        Position = pos++; // Assign the position and increment the static variable pos for the next contact.
        Name = name;
        PhoneNumber = phoneNumber;
    }

    // Method to get the position of the contact in the list.
    public int getPosition() {
        return Position;
    }

    // Method to get the name of the contact.
    public String getName() {
        return Name;
    }

    // Method to set the name of the contact.
    public void setName(String name) {
        Name = name;
    }

    // Method to get the phone number of the contact.
    public String getPhoneNumber() {
        return PhoneNumber;
    }

    // Method to set the phone number of the contact.
    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        // Method to convert the ContactDetails object to a string representation.
        // The contact details will be displayed inside a box-like border with proper formatting.
        String horizontalLine = "+-----------------------+\n";
        String nameLine = "| Name: " + String.format("%-15s", Name) + "|\n";
        String phoneNumberLine = "| Phone Number: " + String.format("%-8s", PhoneNumber) + "|\n";
        return horizontalLine + nameLine + phoneNumberLine + horizontalLine;
    }
}
