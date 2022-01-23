public class Mail {

    private String header;
    private String content;
    private String sender;
    private String recipient;

    public Mail(String header, String content, String sender, String recipient) {
        this.header = header;
        this.content = content;
        this.sender = sender;
        this.recipient = recipient;
    }

    public String getHeader() {
        return header;
    }

    public String getContent() {
        return content;
    }

    public String getSender() {
        return sender;
    }

    public String getRecipient() {
        return recipient;
    }
}
