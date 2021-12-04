package lesson10;

public class AbstractPrinter {

    private String source;

    public AbstractPrinter(String intro) {

        this.source = intro;
    }

    public String getSource() {
        return source;
    }
}