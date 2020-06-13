package simpleBuilder;

public abstract class ConstructionBuilder {

    protected Construction construction;

    protected ConstructionBuilder() {
        this.construction = new Construction();
    }

    public abstract void buildFoundations();

    public abstract void buildMainConstruction();

    public abstract void buildRoof();

    public Construction getConstruction() {
        return construction;
    }


}
