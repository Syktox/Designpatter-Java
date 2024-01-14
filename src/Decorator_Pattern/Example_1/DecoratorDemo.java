package Decorator_Pattern.Example_1;

public class DecoratorDemo {
    public static void main(String[] args) {
        Coffee expresso = new SugarDecorator(new MilkDecorator(new Expresso()));
        System.out.println(expresso.getPrice());
        Coffee myCoffee = new MilkDecorator(new SugarDecorator(new Expresso()));
    }
}
