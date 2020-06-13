package cars.audi;

import cars.Car;

public class AudiSedan extends Car {
    public AudiSedan() {
        this.name = "audi";
        this.model = "A6";
        this.productionYear = 2019;
        this.gearBoxType = "automatic";
    }

    @Override
    public String toString() {
        return "AudiSedan{" +
                "name='" + name + '\'' +
                ", productionYear=" + productionYear +
                ", model='" + model + '\'' +
                ", gearBoxType='" + gearBoxType + '\'' +
                '}';
    }
}