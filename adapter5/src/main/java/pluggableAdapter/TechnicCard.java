package pluggableAdapter;

public class TechnicCard implements ITechnicCard {

    private String model;
    private double height;
    private double weight;
    private double length;
    private double width;

    public TechnicCard(String model, double height, double length, double width, double weight) {
        this.model = model;
        this.height = height;
        this.length = length;
        this.width = width;
        this.weight = weight;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public double getHeightInInches() {
        return height;
    }

    @Override
    public double getWeightInPounds() {
        return weight;
    }

    @Override
    public double getLengthInInches() {
        return length;
    }

    @Override
    public double getWidthInInches() {
        return width;
    }

    @Override
    public void display() {
        System.out.println(
                "TECHNICS CARD" + "\n"
                        + "Model: " + model + "\n"
                        + "Height: " + height + "\n"
                        + "Width: " + width + "\n"
                        + "Length: " + length + "\n"
                        + "Weight: " + weight
        );
    }

}

