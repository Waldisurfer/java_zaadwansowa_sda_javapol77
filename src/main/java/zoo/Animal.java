package zoo;

public abstract class Animal implements RunBehavior {

    private boolean eatsMeat;

    abstract void eat(String something);

    boolean doYouEatMeat() {
        return eatsMeat;
    }
}
