package zoo;

public class Eagle extends Animal implements  FlyBehaviour, RunBehavior{

    @Override
    public void fly(double height) {
        System.out.println("Eagle fly at " + height);
    }

    @Override
    void eat(String something) {

    }

    @Override
    public String run(double speed) {
        if (speed > 5) {
            speed = 5;
        }
        System.out.println("Eagle running at " + speed);
        return null;
    }
}
