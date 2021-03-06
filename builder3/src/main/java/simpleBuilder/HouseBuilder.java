package simpleBuilder;

public class HouseBuilder extends ConstructionBuilder {

    public void buildFoundations() {
        this.construction.foundations = "House foundations";
    }

    public void buildMainConstruction() {
        this.construction.mainConstruction = "House construction";
    }

    public void buildRoof() {
        this.construction.roof = "House roof";
    }
}
