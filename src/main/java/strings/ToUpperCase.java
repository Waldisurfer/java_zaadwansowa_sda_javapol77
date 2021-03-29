package strings;

public class ToUpperCase implements StringOperation {
    @Override
    public String modify(String text) {
        return text.toUpperCase();
    }
}
