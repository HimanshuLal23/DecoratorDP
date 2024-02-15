package Decorator;

public abstract class Beverage {
    protected String description = "Default Beverage";

    public abstract double cost();

    public abstract String getDescription();

    public abstract void setDescription(String description);
}
