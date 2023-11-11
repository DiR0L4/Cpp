package task3;

public class Apple extends Fruit{
    public double price()
    {
        return weight * 2.8;
    }

    public Apple(double weight) {
        this.weight = weight;
    }
}
