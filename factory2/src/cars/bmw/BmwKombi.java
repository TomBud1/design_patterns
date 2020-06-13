package cars.bmw;

import cars.Car;

public class BmwKombi extends Car {
    public BmwKombi() {
        this.name = "bmw";
        this.model = "f11";
        this.productionYear = 2020;
        this.gearBoxType = "automatic";
    }
    @Override
    public String toString() {
        return "BmwKombi{" +
                "name='" + name + '\'' +
                ", productionYear=" + productionYear +
                ", model='" + model + '\'' +
                ", gearBoxType='" + gearBoxType + '\'' +
                '}';
    }
}