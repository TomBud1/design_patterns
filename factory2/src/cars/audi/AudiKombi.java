package cars.audi;

import cars.Car;

public class AudiKombi extends Car {
    public AudiKombi() {
        this.name = "audi";
        this.model = "A4";
        this.productionYear = 2019;
        this.gearBoxType = "automatic";
    }

    @Override
    public String toString() {
        return "AudiKombi{" +
                "name='" + name + '\'' +
                ", productionYear=" + productionYear +
                ", model='" + model + '\'' +
                ", gearBoxType='" + gearBoxType + '\'' +
                '}';
    }
}
