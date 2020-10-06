package main.java.ru.iteco.patterns.email;


public class Main {
    public static void main(String[] args) {
        Subject builder = EmailBuilder.createBuilder();
        Contentt content = builder.subject("subject").to("he").toAll("1", "2", "3").copyTo("4").copyTo("12").content(new Content("body", "C уважением: "));
        System.out.println(content.build());

    }
}
