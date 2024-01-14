package Decorator_Pattern.Example_2;

public class MediumWeightDecorator extends WeightDecorator {
    MediumWeightDecorator(Weight weight) {
        super(weight);
    }

    @Override
    double getWeight() {
        return weight.getWeight() + 20;
    }
}
