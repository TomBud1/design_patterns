package cars.bmw;

import cars.Car;

public class BmwSedan extends Car {
    public BmwSedan() {
        this.name = "bmw";
        this.model = "f10";
        this.productionYear = 2020;
        this.gearBoxType = "automatic";
    }
    @Override
    public String toString() {
        return "BmwSedan{" +
                "name='" + name + '\'' +
                ", productionYear=" + productionYear +
                ", model='" + model + '\'' +
                ", gearBoxType='" + gearBoxType + '\'' +
                '}';
    }
}