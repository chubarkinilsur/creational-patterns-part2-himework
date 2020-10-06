package main.java.ru.iteco.patterns.email;

import java.util.Arrays;

public class EmailBuilder implements Subject, To, CopyTo, Contentt, From {
    private Email email = new Email();


    private EmailBuilder() {
    }

    public static Subject createBuilder() {
        return new EmailBuilder();
    }

    @Override
    public From subject(String subject) {
        email.setSubject(subject);
        return this;
    }

    @Override
    public To to(String to) {
        email.setTo(to);
        return this;
    }

    @Override
    public To toAll(String... toAll) {
        Arrays.stream(toAll).forEach(to -> email.setTo(to));
        return this;
    }

    @Override
    public CopyTo copyTo(String to) {
        email.setCopyTo(to);
        return this;
    }

    @Override
    public CopyTo copyToAll(String... toAll) {
        Arrays.stream(toAll).forEach(to -> email.setCopyTo(to));
        return this;
    }

    @Override
    public Contentt content(Content content) {
        email.setContent(content);
        return this;
    }

    public To from(String from) {
        email.setFrom(from);
        return this;
    }

    @Override
    public Email build() {
        return email;
    }

}

interface Subject  {
    From subject(String subject);
}



interface To  {
    To to(String to);

    To toAll(String... toAll);

    CopyTo copyTo(String to);

    CopyTo copyToAll(String... toAll);

    Contentt content(Content content);

}

interface CopyTo  {
    CopyTo copyTo(String to);

    CopyTo copyToAll(String... toAll);

    Contentt content(Content content);

}

interface From {
    To from(String from);
    To to(String to);

    To toAll(String... toAll);
}

interface Contentt {
    Email build();

}