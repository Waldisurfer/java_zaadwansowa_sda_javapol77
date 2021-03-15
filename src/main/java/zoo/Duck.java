package zoo;

import org.w3c.dom.ls.LSOutput;

public class Duck implements FlyBehaviour, RunBehavior {
    @Override

    public void fly(double height) {
        double actualHeight;
        if (height > 100) {
            actualHeight = 100;
        } else {
            actualHeight = height;
        }
        System.out.println("Duck flying at " + actualHeight);
    }
    @Override

    public String run(double speed) {
        if (speed > 20) {
            speed = 20;
        }
        System.out.println("Duck running at " + speed);
        return null;
    }
}
