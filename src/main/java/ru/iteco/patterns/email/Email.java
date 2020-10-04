package main.java.ru.iteco.patterns.email;

public class Email {

    private final String subject;
    private final String to;
    private final Content content;
    private final String from;
    private final String copyTo;

    public Email(String subject, String to, Content content, String from, String copyTo) {
        this.subject = subject;
        this.to = to;
        this.content = content;
        this.from = from;
        this.copyTo = copyTo;
    }


    public String getSubject() {
        return subject;
    }

    public String getTo() {
        return to;
    }

    public Content getContent() {
        return content;
    }

    public String getFrom() {
        return from;
    }

    public String getCopyTo() {
        return copyTo;
    }

    public void send() {

    }



}
