package builderOrFactory.cars.factory;

import builderOrFactory.cars.Car;
import builderOrFactory.cars.CarType;
import builderOrFactory.cars.factory.bmw.*;


public class SimpleBmwFactory {

    private static SimpleBmwFactory simpleBmwFactory;

    public static SimpleBmwFactory getInstance() {
        if (simpleBmwFactory == null) {
            simpleBmwFactory = new SimpleBmwFactory();
        }
        return simpleBmwFactory;
    }

    public Car createCar(CarType carType) {
        if (carType.equals(CarType.KOMBI)) {
            return new BmwKombi();
        } else if (carType.equals(CarType.SEDAN)) {
            return new BmwSedan();
        } else if (carType.equals(CarType.SUV)) {
            return new BmwSuv();
        } else return null;
    }
}

