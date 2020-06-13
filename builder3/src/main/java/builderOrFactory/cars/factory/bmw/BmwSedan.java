package builderOrFactory.cars.factory.bmw;

import builderOrFactory.cars.Car;

public class BmwSedan extends Car {
    public BmwSedan() {
        this.name = "BMW";
        this.model = "F10";
        this.productionYear = 2017;
        this.gearBoxType = "automatic";
    }
}
