public class Message {
    private String text;
    private String recipient;
    private int id;


    // Constructor
    public Message(java.lang.String text, java.lang.String recipient, int id) {
        this.text = text;
        this.recipient = recipient;
        this.id = id;
    }


    // Only need Getters since want messages to be static
    public java.lang.String getDetails() {
        return "Message "+(id+1)+":\nTo: "+recipient+"\nMessage: "+text+"\n*********";
    }
    public java.lang.String getText() {
        return text;
    }
    public java.lang.String getRecipient() {
        return recipient;
    }
    public int getId() {
        return id;
    }
}
