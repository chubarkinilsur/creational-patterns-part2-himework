package main.java.ru.iteco.patterns.email;

public class Content {
    private String body;

    private String signature;

    private String from;

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

    public void setBody(String body) {
        this.body = body;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getFrom() {
        return from;
    }

    @Override
    public String toString() {
        return "Content{" +
                "body='" + body + '\'' +
                ", signature='" + signature + from+'\''+
                '}';
    }
}
