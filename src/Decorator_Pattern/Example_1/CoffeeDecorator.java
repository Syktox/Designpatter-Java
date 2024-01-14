package Decorator_Pattern.Example_1;

abstract class CoffeeDecorator extends Coffee{
    protected Coffee coffee;

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    public abstract double getPrice();
}

