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

        duck.run(12);
        duck.run(35);

        eagle.run(3);
        eagle.run(12);


        System.out.println("xxxxxx");
        Ground ground = new Ground();



        RunBehavior duckRunBehaviour = new Duck();
        duckRunBehaviour.run(123);
        System.out.println("xxxxxxxx");



        RunBehavior eagleRunBehaviour = new Eagle();
        eagleRunBehaviour.run(32);

        ground.runOnGround(eagle,234);
        ground.runOnGround(duck,233);

        RunBehavior dogRunBehaviour = new Dog();
        ground.runOnGround(dogRunBehaviour, 234);
        Dog dog2 = new Dog();

        RunBehavior gepard = new RunBehavior() {
            @Override
            public String run(double speed) {
                if (speed < 300) {
                    speed = 300;
                }
                System.out.println("Gepard runs at speed: " + speed);
                return null;
            }
        };
        ground.runOnGround(gepard, 4523);



    }
}
