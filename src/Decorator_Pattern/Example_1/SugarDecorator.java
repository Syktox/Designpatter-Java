package Decorator_Pattern.Example_1;

public class SugarDecorator extends CoffeeDecorator{
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }
    public double getPrice() {
        return coffee.getPrice() + 0.25;
    }
}
