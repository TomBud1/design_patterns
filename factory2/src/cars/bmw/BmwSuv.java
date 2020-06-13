package cars.bmw;

import cars.Car;

public class BmwSuv extends Car {
    public BmwSuv() {
        this.name = "bmw";
        this.model = "x5 G05";
        this.productionYear = 2019;
        this.gearBoxType = "automatic";
    }
    @Override
    public String toString() {
        return "BmwSuv{" +
                "name='" + name + '\'' +
                ", productionYear=" + productionYear +
                ", model='" + model + '\'' +
                ", gearBoxType='" + gearBoxType + '\'' +
                '}';
    }
}