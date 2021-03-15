package zoo;

import org.w3c.dom.ls.LSOutput;

public class Duck implements FlyBehaviour {
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
}
