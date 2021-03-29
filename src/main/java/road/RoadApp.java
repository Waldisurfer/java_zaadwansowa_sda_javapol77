package road;

import vehicles.Car;
import vehicles.Motorcycle;
import vehicles.Vehicle;

public class RoadApp {
    public static void main(String[] args) {

        Road<Car> carRoad = new Road<>(new Car());
        carRoad.setItem(new Car());
        carRoad.getItem();
        carRoad.runThisVehicle(123);

        Road<Motorcycle> motorcycleRoad = new Road<>(new Motorcycle());
        motorcycleRoad.setItem(new Motorcycle());
        motorcycleRoad.getItem();
        motorcycleRoad.runThisVehicle(232);
    }
}
