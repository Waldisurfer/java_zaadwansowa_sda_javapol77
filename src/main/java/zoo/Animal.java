package zoo;

public abstract class Animal {

    private boolean eatsMeat;

    abstract void eat(String something);

    boolean doYouEatMeat() {
        return eatsMeat;
    }
}
