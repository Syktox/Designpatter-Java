package Decorator_Pattern.Example_2;

public class BigWeightDecorator extends WeightDecorator {
    BigWeightDecorator(Weight weight) {
        super(weight);
    }

    @Override
    double getWeight() {
        return weight.getWeight() + 50;
    }
}
