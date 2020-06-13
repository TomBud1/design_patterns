package fabricMethodsFactories;

import cars.Car;
import cars.bmw.*;
import utils.CarType;

public class BmwFactory extends CarFactory {

    private static BmwFactory carFactory;

    public static BmwFactory getInstance() {
        if (carFactory == null) {
            carFactory = new BmwFactory();
        }
        return carFactory;
    }

    Car createCar(CarType carType) {
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