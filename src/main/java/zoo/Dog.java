package zoo;

public class Dog extends Animal implements RunBehavior {

    @Override
    void eat(String something) {
    }

    @Override
    public String run(double speed) {

        return null;
    }

    @Override
    public String toString() {
        return "Dog";
    }
}
