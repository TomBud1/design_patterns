package builderOrFactory.cars.factory.bmw;

import builderOrFactory.cars.Car;

public class BmwKombi extends Car {
    public BmwKombi() {
        this.name = "BMW";
        this.model = "F11";
        this.productionYear = 2018;
        this.gearBoxType = "automatic";
    }
}
