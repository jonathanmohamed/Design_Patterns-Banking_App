package BankingApp.message;

public class Message {

    private String message;
    private boolean isRead;

    public Message(String message) {
        this.message = message;
        this.isRead = false;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isRead() {
        return isRead;
    }

    public void setRead(boolean read) {
        isRead = read;
    }

    public void openMessage() {
        this.setRead(true);
    }
}
