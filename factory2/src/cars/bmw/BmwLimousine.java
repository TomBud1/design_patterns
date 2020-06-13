package cars.bmw;

import cars.Car;

public class BmwLimousine extends Car {
    public BmwLimousine() {
        this.name = "bmw";
        this.model = "G11";
        this.productionYear = 2020;
        this.gearBoxType = "automatic";
    }
    @Override
    public String toString() {
        return "BmwLimousine{" +
                "name='" + name + '\'' +
                ", productionYear=" + productionYear +
                ", model='" + model + '\'' +
                ", gearBoxType='" + gearBoxType + '\'' +
                '}';
    }
}