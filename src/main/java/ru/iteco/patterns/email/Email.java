package main.java.ru.iteco.patterns.email;

import java.util.HashSet;
import java.util.Set;

public class Email {

    private String subject;
    private Set <String> to = new HashSet <>();
    private Content content;
    private String from = "surik110@yandex.ru";
    private Set <String> copyTo = new HashSet();

    public Email() {

    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setTo(String to) {
        this.to.add(to);
    }

    public void setContent(Content content) {
        content.setFrom(from);
        this.content = content;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public void setCopyTo(String copyTo) {
        this.copyTo.add(copyTo);
    }

    @Override
    public String toString() {
        return "Email{" +
                "subject='" + subject + '\'' +
                ", to=" + to +
                ", content=" + content +
                ", copyTo=" + copyTo +
                '}';
    }
}
