package Decorator_Pattern.Example_2;

abstract class WeightDecorator extends Weight {
    Weight weight;
    public WeightDecorator(Weight weight) {
        this.weight = weight;
    }
    abstract double getWeight();
}
