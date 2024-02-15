package Decorator;

public class Espresso extends Beverage{
    @Override
    public double cost() {
        return 0.5;
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