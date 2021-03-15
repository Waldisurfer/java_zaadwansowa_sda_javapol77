package vehicles;

public class Car extends Vehicle {
    private int passangers;

    public Car() {
        System.out.println("Tworzenie car");
    }

    @Override
    public void run(double velocity) {
        System.out.println("Car with " + passangers + " running at " + velocity);

    }

    public void addPassanger() {
        if (passangers < 4) {
            passangers += 1;
            System.out.println("Aktualnie zwiekszono liczbe pasazerow do: " + passangers);
        }
        else {
            System.out.println("Nie moze byc wiecej niz 4");
        }
    }

    public void removePassangers() {
        if (passangers > 0) {
            passangers -= 1;
            System.out.println("Aktualnie liczbe pasazerow zmniejszono do " + passangers);
        }
        else {
            System.out.println("Nie moze by mniej niz 0");
        }

    }

    @Override
    public String toString() {
        return "Car, " +
                "passangers = " + passangers;
    }
    //    @Override
//    public String toString() {
//        System.out.println("Car" +
//                "passangers= " + passangers);
//        return null;
//    }
}
