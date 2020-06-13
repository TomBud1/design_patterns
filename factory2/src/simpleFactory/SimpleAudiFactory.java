package simpleFactory;

import cars.Car;
import cars.audi.*;
import utils.CarType;

public class SimpleAudiFactory {

    private static SimpleAudiFactory simpleAudiFactory;

    public static SimpleAudiFactory getInstance() {
        if (simpleAudiFactory == null) {
            simpleAudiFactory = new SimpleAudiFactory();
        }
        return simpleAudiFactory;
    }

    public Car createCar(CarType carType) {
        if (carType.equals(CarType.SPORT)) {
            return new AudiSport();
        } else if (carType.equals(CarType.SEDAN)) {
            return new AudiSedan();
        } else if (carType.equals(CarType.SUV)) {
            return new AudiSuv();
        } else if (carType.equals(CarType.LIMOUSINE)) {
            return new AudiLimousine();
        } else if (carType.equals(CarType.HATCHBACK)) {
            return new AudiHatchBag();
        } else if (carType.equals(CarType.KOMBI)) {
            return new AudiHatchBag();
        } else return null;
    }
}