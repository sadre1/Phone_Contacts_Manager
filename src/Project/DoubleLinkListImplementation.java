package Project;
// DoubleLinkedList class represents a node in the doubly linked list.
class DoubleLinkedList {
    ContactDetails contactDetails; // The contact details stored in the node.
    DoubleLinkedList prev; // Reference to the previous node in the list.
    DoubleLinkedList next; // Reference to the next node in the list.

    // Constructor to create a new node with the given contact details.
    public DoubleLinkedList(ContactDetails contactDetails) {
        this.contactDetails = contactDetails;
        prev = null;
        next = null;
    }
}

public class DoubleLinkListImplementation implements  CrudOprations{
    // The head node of the doubly linked list.

    private  DoubleLinkedList head = new DoubleLinkedList(new ContactDetails("Sadrealam Ahmed","9044290471"));



    @Override

    public String insertContact(ContactDetails contactDetails) {
        // Method to insert a new contact into the doubly linked list.
        DoubleLinkedList temp = new DoubleLinkedList(contactDetails);
        DoubleLinkedList last = head;
        if (head == null) {
            temp.prev = null;
            head = temp;
            return "Contact Added Successfully";
        }

        while (last.next!=null)
            last=last.next;

        last.next=temp;
        temp.prev=last;
        return "Contact Added Successfully";
    }

    @Override
    public String removeContacts(String name) {
        // Method to remove a contact from the doubly linked list by name.
        int position=SearchPosition(name);
        if(head == null || position<=0)
            return "Contact not found";
        DoubleLinkedList curr = head;
        for(int i=0 ; curr!=null && i< position ;i++){
            curr=curr.next;
        }
        if(curr == null )
            return "Contact not found";

        return deleteContact(curr);

    }

    private String deleteContact(DoubleLinkedList curr) {

        if(head == null  || curr==null )
            return "Contact not found";

        if(head == curr)
            head = curr.next;

        if(curr.next!=null)
            curr.next.prev=curr.prev;

        if(curr.prev!=null)
            curr.prev.next = curr.next;
        curr=null;

        return "Contact removed Successfully!";

    }

    @Override
    public int SearchPosition(String name) {
        // Method to search for the position of a contact by name.
        DoubleLinkedList curr=head;
        while(curr!=null){
            if(curr.contactDetails.getName().trim().equals(name.trim())){
                return curr.contactDetails.getPosition();
            }
            curr=curr.next;
        }
        return -1;
    }

    @Override
    public String SearchByName(String name) {
        // Method to search for a contact by name and return its details.
        DoubleLinkedList curr = head;
        while(curr!=null){
            if(curr.contactDetails.getName().equals(name)){
                return curr.contactDetails.toString();
            }
            curr=curr.next;

        }
        return "Contact not Found ";

    }

    @Override
    public String SearchByPhoneNumber(String phoneNumber) {
        // Method to search for a contact by phone number and return its details.
        DoubleLinkedList curr = head;
        while(curr!=null){
            if(curr.contactDetails.getPhoneNumber().equals(phoneNumber)){
                return curr.contactDetails.toString();
            }
            curr = curr.next;
        }
        return "Phone Number Not Found";
    }

    @Override
    public Boolean UpdatePhoneNumber(String name , String newphoneNumber) {
        // Method to update the phone number of a contact by name.
        DoubleLinkedList curr = head ;
        while(curr!=null){
            if(curr.contactDetails.getName().equals(name)){
                curr.contactDetails.setPhoneNumber(newphoneNumber);
                return true;
            }
            curr=curr.next;
        }

        return false;

    }

    @Override
    public Boolean UpdateContactName(String oldName , String newName) {
        // Method to update the name of a contact by name.

        DoubleLinkedList curr = head ;
        while(curr!=null){
            if(curr.contactDetails.getName().equals(oldName)){
                curr.contactDetails.setName(newName);
                return true;
            }
            curr=curr.next;
        }

        return false;

    }

    @Override
    public void showAllContacts() {
        // Method to display all contacts in the doubly linked list
        DoubleLinkedList curr = head;
        while(curr!=null){
            System.out.println(curr.contactDetails.toString());
            curr=curr.next;
        }
    }
}
