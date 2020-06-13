package cars.audi;

import cars.Car;

public class AudiSport extends Car {
    public AudiSport() {
        this.name = "audi";
        this.model = "RS7";
        this.productionYear = 2020;
        this.gearBoxType = "automatic";
    }

    @Override
    public String toString() {
        return "AudiSport{" +
                "name='" + name + '\'' +
                ", productionYear=" + productionYear +
                ", model='" + model + '\'' +
                ", gearBoxType='" + gearBoxType + '\'' +
                '}';
    }
}