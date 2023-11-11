package task3;

public class Pear extends Fruit{
    public double price()
    {
        return weight * 3.3;
    }
    public Pear(double weight) {
        this.weight = weight;
    }
}
