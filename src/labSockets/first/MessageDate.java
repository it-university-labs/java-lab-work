package labSockets.first;

import java.util.Date;

class MessageData {
    String username;
    String messageText;
    Date sentDate;

    MessageData(String username, String messageText ){
        this(username, messageText, new Date());
    }

    public MessageData(String username, String messageText, Date sentDate) {
        this.username = username;
        this.messageText = messageText;
        this.sentDate = sentDate;
    }

    public String getUsername() {
        return username;
    }

    public String getMessageText() {
        return messageText;
    }

    public Date getSentDate() {
        return sentDate;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public void setSentDate(Date sentDate) {
        this.sentDate = sentDate;
    }

    @Override
    public String toString() {
        return messageText + "| from " + username + "| at local time" + sentDate;
    }
}
