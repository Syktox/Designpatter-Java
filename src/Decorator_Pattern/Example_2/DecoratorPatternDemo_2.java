package Decorator_Pattern.Example_2;

public class DecoratorPatternDemo_2 {
    public static void main(String[] args) {
        Weight banchPress = new BigWeightDecorator(new MediumWeightDecorator(new SmallWeightDecorator(new StartWeight())));
        System.out.println(banchPress.getWeight());
    }
}
