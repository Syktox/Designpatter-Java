package Decorator_Pattern.Example_2;

public class SmallWeightDecorator extends WeightDecorator {
    SmallWeightDecorator(Weight weight) {
        super(weight);
    }

    @Override
    double getWeight() {
        return weight.getWeight() + 10;
    }
}
