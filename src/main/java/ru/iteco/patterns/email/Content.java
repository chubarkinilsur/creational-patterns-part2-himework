package main.java.ru.iteco.patterns.email;

public class Content {
    private final String body;
    private final String signature;

    public Content(String body, String signature) {
        this.body = body;
        this.signature = signature;
    }

    public String getBody() {
        return body;
    }

    public String getSignature() {
        return signature;
    }
}
