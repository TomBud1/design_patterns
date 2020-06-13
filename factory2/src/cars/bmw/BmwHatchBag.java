package cars.bmw;

import cars.Car;

public class BmwHatchBag extends Car {
    public BmwHatchBag() {
        this.name = "bmw";
        this.model = "f20";
        this.productionYear = 2019;
        this.gearBoxType = "manual";
    }
    @Override
    public String toString() {
        return "BmwHatchBag{" +
                "name='" + name + '\'' +
                ", productionYear=" + productionYear +
                ", model='" + model + '\'' +
                ", gearBoxType='" + gearBoxType + '\'' +
                '}';
    }
}
