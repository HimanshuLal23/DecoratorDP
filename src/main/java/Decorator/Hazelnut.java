package Decorator;

public class Hazelnut extends Beverage{
    @Override
    public double cost() {
        return 1.9;
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
