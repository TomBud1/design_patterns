package fabricMethodsFactories;

import cars.Car;
import cars.mercedes.*;
import utils.CarType;

public class MercedesFactory extends CarFactory {

    private static MercedesFactory mercedesFactory;

    public static MercedesFactory getInstance() {
        if (mercedesFactory == null) {
            mercedesFactory = new MercedesFactory();
        }
        return mercedesFactory;
    }

    Car createCar(CarType carType) {
        if (carType.equals(CarType.SPORT)) {
            return new MercedesSport();
        } else if (carType.equals(CarType.SEDAN)) {
            return new MercedesSedan();
        } else if (carType.equals(CarType.SUV)) {
            return new MercedesSuv();
        } else if (carType.equals(CarType.LIMOUSINE)) {
            return new MercedesLimousine();
        } else if (carType.equals(CarType.HATCHBACK)) {
            return new MercedesHatchBag();
        } else if (carType.equals(CarType.KOMBI)) {
            return new MercedesKombi();
        } else return null;
    }

}