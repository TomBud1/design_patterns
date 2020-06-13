package fabricMethodsFactories;

import cars.Car;
import cars.audi.*;
import utils.CarType;

public class AudiFactory extends CarFactory {

    private static AudiFactory audiFactory;

    public static AudiFactory getInstance() {
        if (audiFactory == null) {
            audiFactory = new AudiFactory();
        }
        return audiFactory;
    }

    Car createCar(CarType carType) {
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
            return new AudiKombi();
        } else return null;
    }
}