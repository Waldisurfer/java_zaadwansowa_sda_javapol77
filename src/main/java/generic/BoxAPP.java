package generic;

public class BoxAPP {
    public static void main(String[] args) {
        Box<Integer> boxInteger = new Box<>();
        boxInteger.set(23);

        Box<String> boxString = new Box<>();
        boxString.set("Tekst");
        boxString.set("nowyTekst");

        System.out.println(boxInteger.get());
        System.out.println(boxString.get());
    }
}
