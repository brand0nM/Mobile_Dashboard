import java.util.*;
public class UI {
    // Attributes
    private java.lang.String user = "Brandon";
    private ArrayList<Message> messages;
    private ArrayList<Contact> contacts;


    // Constructor
    public UI(java.lang.String user,
            java.util.ArrayList<Message> messages,
            java.util.ArrayList<Contact> contacts) {
        this.user = user;
        this.messages = messages;
        this.contacts = contacts;
    }


    // Methods
    /**
     * Turns on the UI
     */
    public void on() {
        System.out.println("Hello "+user);
        homePage();
    }
    /**
     * Reactive User Home Page:
     * Takes the User to the Contacts Page, Message Page, or Quits the Application
     */
    protected void homePage() {
        System.out.println("\n\t1) Manage Contacts\n\t2) Messages\n\t3) Quit\n");
        Scanner scanner = new Scanner(System.in);
        try {
            switch (scanner.nextInt()) {
                case 1:
                    contactsPage();
                    break;
                case 2:
                    messagePage();
                    break;
                case 3:
                    System.out.println("Have a Great Day!");
                    break;
                default:
                    System.out.println("Type 1, 2, or 3 then press enter");
                    homePage();
            }
        } catch (InputMismatchException e) {
            System.out.println("Type 1, 2, or 3 then press enter");
            homePage();
        }
    }
    /**
     * Reactive User Contacts Page:
     */
    protected void contactsPage() {
        System.out.println("""
            
            1) Show all contacts
            2) Add a new contact
            3) Search for a contact
            4) Delete a contact
            5) Go back to the previous menu
                    
                """);
        Scanner scanner = new Scanner(System.in);
        try {
            ArrayList<String> names = getContactNames();
            switch (scanner.nextInt()) {
                // Show all Contacts
                case 1:
                    System.out.println("All Contacts:");
                    for (Contact contact : contacts) {
                        System.out.println(contact.getContactName());
                    }
                    contactsPage();
                    break;
                // Add a new Contact if he doesn't already exist
                case 2:
                    System.out.println("Name: ");
                    String contactName = scanner.next();
                    System.out.println("Phone Number: ");
                    String phoneNumber = scanner.next();
                    if (!names.contains(contactName)) {
                        contacts.add(new Contact(contactName, phoneNumber));
                    } else {
                        System.out.println("Already Have a Contact Named "+contactName);
                    }
                    contactsPage();
                    break;
                // Find a Contact if he exists
                case 3:
                    System.out.println("Find which Contact?");
                    String search = scanner.next();
                    System.out.println("Searching for contact...");
                    if (names.contains(search)){
                        int c = names.indexOf(search);
                        System.out.println("Name: "+contacts.get(c).getContactName()+
                                "\nNumber: "+contacts.get(c).getPhoneNumber()+"\n");
                    } else {
                        System.out.println("Contact was not found");
                    }
                    contactsPage();
                    break;
                // Delete Contact if he exists
                case 4:
                    System.out.println("Delete which contacts?");
                    String del = scanner.next();
                    System.out.println("Deleting contact...");
                    if (names.contains(del)){
                        int c = names.indexOf(del);
                        System.out.println("Deleted\nName: "+contacts.get(c).getContactName()
                                +"\nNumber: "+contacts.get(c).getPhoneNumber()+"\n");
                        contacts.remove(contacts.get(c));
                    } else {
                        System.out.println("Contact was not found");
                    }
                    contactsPage();
                    break;
                // Home
                case 5:
                    homePage();
                    break;
                // Improper input
                default:
                    System.out.println("Type 1, 2, or 3 then press enter");
                    contactsPage();
            }
        } catch (InputMismatchException e) {
            // Improper Input
            System.out.println("Type 1, 2, or 3 then press enter");
            contactsPage();
        }
    }
    /**
     * Reactive Message Page
     */
    protected void messagePage() {
        System.out.println("""
                    
                    1) See the list of all messages
                    2) Send a new message
                    3) Go back to the previous menu
                    
                """);
        Scanner scanner = new Scanner(System.in);
        try {
            ArrayList<String> names = getContactNames();
            switch (scanner.nextInt()) {
                // Display All Messages Sent
                case 1:
                    System.out.println("All Messages:");
                    for (Message message : messages) {
                        System.out.println(message.getDetails());
                    }
                    messagePage();
                    break;
                // Send New Message if Contact exists
                case 2:
                    System.out.println("Message: ");
                    String text = scanner.next();
                    System.out.println("Contact: ");
                    String recp = scanner.next();
                    // If Recipient is in our Contacts
                    if (names.contains(recp)) {
                        messages.add(new Message(text, recp, messages.size()));
                    } else {
                        System.out.println("Add "+recp+" to Contacts");
                    }
                    messagePage();
                    break;
                // Go to the Home Page
                case 3:
                    homePage();
                    break;
                // Improper input
                default:
                    System.out.println("Type 1, 2, or 3 then press enter");
                    messagePage();
            }
        } catch (InputMismatchException e) {
            // Improper input
            System.out.println("Type 1, 2, or 3 then press enter");
            messagePage();
        }
    }


    // Getters
    public java.util.ArrayList<String> getContactNames() {
        ArrayList<String> names = new ArrayList<>();
        for (Contact c : contacts) {
            names.add(c.getContactName());
        }
        return names;
    }
    public java.util.ArrayList<Contact> getContacts() {
        return contacts;
    }
    public java.util.ArrayList<Message> getMessages() {
        return messages;
    }
}
