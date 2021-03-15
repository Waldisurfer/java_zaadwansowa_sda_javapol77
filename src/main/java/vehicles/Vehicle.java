package vehicles;

public class Vehicle {

    private int wheels;

    public Vehicle() {
        wheels = 4;
        System.out.println("Tworzenie vehicle");

    }

    public Vehicle(int wheels) {
        this.wheels = wheels;
        System.out.println("Tworzenie vehicle z " + wheels + " kołami");
    }

    public void run(double velocity) {
        System.out.println("Vehicle running at " + velocity);

    }
}
