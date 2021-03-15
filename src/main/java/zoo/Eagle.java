package zoo;

public class Eagle extends Animal implements  FlyBehaviour{

    @Override
    public void fly(double height) {
        System.out.println("Eagle fly at " + height);
    }

    @Override
    void eat(String something) {

    }
}
