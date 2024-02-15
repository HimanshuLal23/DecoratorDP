package Condiments;

import Decorator.Beverage;

public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage,String description) {
        this.beverage = beverage;
        this.description = description;
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.3;
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
