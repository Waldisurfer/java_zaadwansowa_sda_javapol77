package zoo;

public class Robot implements RunBehavior {

    @Override
    public String run(double speed) {
        System.out.println("Robot running at " + speed);
        return null;
    }

    @Override
    public String toString() {
        return "Robot";
    }
}
