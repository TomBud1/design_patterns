package cars.bmw;

import cars.Car;

public class BmwSport extends Car {
    public BmwSport() {
        this.name = "bmw";
        this.model = "440i";
        this.productionYear = 2020;
        this.gearBoxType = "manual";
    }
    @Override
    public String toString() {
        return "BmwSport{" +
                "name='" + name + '\'' +
                ", productionYear=" + productionYear +
                ", model='" + model + '\'' +
                ", gearBoxType='" + gearBoxType + '\'' +
                '}';
    }
}