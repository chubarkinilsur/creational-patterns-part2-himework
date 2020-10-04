package main.java.ru.iteco.patterns.email;

import java.util.HashSet;
import java.util.Set;

public class EmailBuilder {

    private Set<String> to = new HashSet<String>();
    private String subject;
    private Content content;


    public EmailBuilder addRecipient(String to) {
        this.to.add(to);
        return this;
    }

    public EmailBuilder removeRecipient(String recipient) {
        this.to.remove(recipient);
        return this;
    }

    public EmailBuilder setTitle(String subject) {
        this.subject = subject;
        return this;
    }


    public Email build() {

        String message = greeting + "\n" + mainText + "\n" + closing;
        String recipientSection = commaSeparatedRecipients();

        return new Email(subject, recipientSection, message);
    }

    private String commaSeparatedRecipients() {

        StringBuilder sb = new StringBuilder();
        for (String recipient : recipients) {
            sb.append(",").append(recipient);
        }

        return sb.toString().replaceFirst(",", "");
    }

}