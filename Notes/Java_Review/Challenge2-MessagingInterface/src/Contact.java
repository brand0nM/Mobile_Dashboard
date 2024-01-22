public class Contact {
    // Attributes
    private String contactName;
    private String phoneNumber;


    // Constructor
    public Contact(java.lang.String contactName, java.lang.String phoneNumber) {
        this.contactName = contactName;
        this.phoneNumber = phoneNumber;
    }


    // Setter and Getters, Might Want to Edit a Contact, but messages should be static
    public java.lang.String getContactName() {
        return contactName;
    }
    public void setContactName(java.lang.String contactName) {
        this.contactName = contactName;
    }
    public java.lang.String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(java.lang.String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
