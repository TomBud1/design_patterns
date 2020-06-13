package builderOrFactory.cars.builder;

public class BmwCarBuilder {

    private BmwCar bmwCar;

    public BmwCarBuilder() {
        this.bmwCar = new BmwCar();
    }

    public BmwCarBuilder withProductionYear(int productionYear) {
        this.bmwCar.productionYear = productionYear;
        return this;
    }

    public BmwCarBuilder withName(String name) {
        this.bmwCar.name = name;
        return this;
    }

    public BmwCarBuilder withModel(String model) {
        this.bmwCar.model = model;
        return this;
    }

    public BmwCarBuilder withGearboxType(String gearBoxType) {
        this.bmwCar.gearBoxType = gearBoxType;
        return this;
    }

    public synchronized BmwCar buildBmwCar() {
        return this.bmwCar;
    }
}
