package simpleFactory;

import cars.Car;
import cars.bmw.*;
import utils.CarType;

public class SimpleBmwFactory {

    private static SimpleBmwFactory simpleBmwFactory;

    public static SimpleBmwFactory getInstance() {
        if (simpleBmwFactory == null) {
            simpleBmwFactory = new SimpleBmwFactory();
        }
        return simpleBmwFactory;
    }

    public Car createCar(CarType carType) {
        if (carType.equals(CarType.SPORT)) {
            return new BmwSport();
        } else if (carType.equals(CarType.SEDAN)) {
            return new BmwSedan();
        } else if (carType.equals(CarType.SUV)) {
            return new BmwSuv();
        } else if (carType.equals(CarType.LIMOUSINE)) {
            return new BmwLimousine();
        } else if (carType.equals(CarType.HATCHBACK)) {
            return new BmwHatchBag();
        } else if (carType.equals(CarType.KOMBI)) {
            return new BmwKombi();
        } else return null;
    }
}