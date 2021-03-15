package zoo;

public class ZooApp {
    public static void main(String[] args) {
        Eagle eagle = new Eagle();
        eagle.fly(120);

        Duck duck = new Duck();
        duck.fly(200);

        FlyBehaviour plane = new FlyBehaviour() {
            @Override
            public void fly(double height) {
                if (height >= 3000) {
                    System.out.println("Latam na wysokosci" + height);
                }
                else {
                    System.out.println("Zwieksz wysokosc do 3000");
                }
            }
        };
        plane.fly(200);
        Greeter greeter = new Greeter();
        greeter.greet();
        greeter.greet("Michal");
        greeter.greet("Hello", "Michal");
    }
}
