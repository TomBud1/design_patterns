package simpleBuilder;

public class MonumentBuilder extends ConstructionBuilder {

    public void buildFoundations() {
        this.construction.foundations = "Monument foundations";
    }

    public void buildMainConstruction() {
        this.construction.mainConstruction = "Monument construction";
    }

    public void buildRoof() {
        this.construction.roof = "Monument roof";
    }
}
