package Decorator;

public class Caramel extends Beverage {
    @Override
    public double cost() {
        return 0.9;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }
}
