package vehicles;

public class VehicleApp {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Motorcycle motorcycle = new Motorcycle();
//        vehicle.run(100);

        Car car = new Car();
//        car.run(120);
//
        car.addPassanger();
        car.addPassanger();
        car.addPassanger();
        car.addPassanger();
        car.addPassanger();


        car.removePassangers();
        car.removePassangers();
        car.removePassangers();
        car.removePassangers();
        car.removePassangers();

//
//        car.removePassangers();
//
//        ConvertibleCar convertibleCar = new ConvertibleCar();
//
//        convertibleCar.openRoof(true);
//        convertibleCar.openRoof(false);
//
//        convertibleCar.closeRoof(convertibleCar.roofStatus);

        System.out.println(car.toString());
        System.out.println(car.toString());
        System.out.println(car.toString());
        System.out.println(car.toString());
        System.out.println(car.toString());





    }
}
