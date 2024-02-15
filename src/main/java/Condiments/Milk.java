package Condiments;

import Decorator.Beverage;

public class Milk extends CondimentDecorator{
    public Milk(Beverage beverage, String description) {
        this.beverage = beverage;
        this.description = description;
    }

    @Override
    public double cost() {
        return beverage.cost()+3.7;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() +"," + description;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }
}
