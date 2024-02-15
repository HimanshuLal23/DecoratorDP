import Condiments.Milk;
import Condiments.Mocha;
import Decorator.Beverage;
import Decorator.Caramel;
import Decorator.Espresso;

public class Main {
    public static void main(String []args) {
        Beverage beverage = new Mocha(new Milk(new Espresso(),"Caramel Mocha"),"Milk");
        System.out.println(beverage.cost());
        System.out.println(beverage.getDescription());
    }
}
