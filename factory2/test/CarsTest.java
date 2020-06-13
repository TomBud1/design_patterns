import abstractFactory.*;
import abstractFactory.audi.AudiServiceFactory;
import abstractFactory.mercedes.MercedesServiceFactory;
import cars.Car;
import fabricMethodsFactories.CarFactory;
import fabricMethodsFactories.AudiFactory;
import fabricMethodsFactories.BmwFactory;
import fabricMethodsFactories.MercedesFactory;
import org.junit.Test;
import simpleFactory.SimpleBmwFactory;
import utils.CarType;

public class CarsTest {

    @Test
    public void create_bmw_by_simple_factory(){
        SimpleBmwFactory simpleBmwFactory = SimpleBmwFactory.getInstance();
        Car sportCar = simpleBmwFactory.createCar(CarType.SPORT);
        Car hatchbackCar = simpleBmwFactory.createCar(CarType.HATCHBACK);
        Car kombiCar = simpleBmwFactory.createCar(CarType.KOMBI);
        Car sedanCar = simpleBmwFactory.createCar(CarType.SEDAN);
        Car suvCar = simpleBmwFactory.createCar(CarType.SUV);
        Car limousineCar = simpleBmwFactory.createCar(CarType.LIMOUSINE);

        System.out.println(sportCar.toString());
        System.out.println(hatchbackCar.toString());
        System.out.println(kombiCar.toString());
        System.out.println(sedanCar.toString());
        System.out.println(suvCar.toString());
        System.out.println(limousineCar.toString());
    }

    @Test
    public void create_all_mercedes_cars_by_fabric_methods_factory() {
        CarFactory mercedesFactory = MercedesFactory.getInstance();
        mercedesFactory.orderCar(CarType.SPORT);
        mercedesFactory.orderCar(CarType.SUV);
        mercedesFactory.orderCar(CarType.KOMBI);
        mercedesFactory.orderCar(CarType.SEDAN);
        mercedesFactory.orderCar(CarType.LIMOUSINE);
        mercedesFactory.orderCar(CarType.HATCHBACK);
    }

    @Test
    public void create_all_audi_cars_by_fabric_methods_factory() {
        CarFactory audiFactory = AudiFactory.getInstance();
        audiFactory.orderCar(CarType.SPORT);
        audiFactory.orderCar(CarType.SUV);
        audiFactory.orderCar(CarType.KOMBI);
        audiFactory.orderCar(CarType.SEDAN);
        audiFactory.orderCar(CarType.LIMOUSINE);
        audiFactory.orderCar(CarType.HATCHBACK);
    }

    @Test
    public void create_all_bmw_cars_by_fabric_methods_factory() {
        CarFactory bmwFactory = BmwFactory.getInstance();
        bmwFactory.orderCar(CarType.SPORT);
        bmwFactory.orderCar(CarType.SUV);
        bmwFactory.orderCar(CarType.KOMBI);
        bmwFactory.orderCar(CarType.SEDAN);
        bmwFactory.orderCar(CarType.LIMOUSINE);
        bmwFactory.orderCar(CarType.HATCHBACK);
    }

    @Test
    public void create_abstract_audi_service_factory() {
        CarServiceFactory audiServiceFactory = AudiServiceFactory.getInstance();
        CarChecker carChecker = audiServiceFactory.getCarChecker();
        CarCleaner carCleaner = audiServiceFactory.getCarCleaner();

        carChecker.checkGearBox();
        carChecker.checkEngine();
        carCleaner.cleanCar();
    }

    @Test
    public void create_abstract_mercedes_service_factory() {
        CarServiceFactory mercedesServiceFactory = MercedesServiceFactory.getInstance();
        CarChecker carChecker = mercedesServiceFactory.getCarChecker();
        CarCleaner carCleaner = mercedesServiceFactory.getCarCleaner();

        carChecker.checkGearBox();
        carChecker.checkEngine();
        carCleaner.cleanCar();
    }
}