package builderOrFactory.cars.factory.bmw;

import builderOrFactory.cars.Car;

public class BmwSuv extends Car {
    public BmwSuv() {
        this.name = "BMW";
        this.model = "X5";
        this.productionYear = 2019;
        this.gearBoxType = "automatic";
    }
}
