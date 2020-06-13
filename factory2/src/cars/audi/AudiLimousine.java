package cars.audi;

import cars.Car;

public class AudiLimousine extends Car {
    public AudiLimousine() {
        this.name = "audi";
        this.model = "A8";
        this.productionYear = 2020;
        this.gearBoxType = "automatic";
    }

    @Override
    public String toString() {
        return "AudiLimousine{" +
                "name='" + name + '\'' +
                ", productionYear=" + productionYear +
                ", model='" + model + '\'' +
                ", gearBoxType='" + gearBoxType + '\'' +
                '}';
    }
}