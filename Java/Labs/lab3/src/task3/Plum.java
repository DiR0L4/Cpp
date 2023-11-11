package task3;

public class Plum extends Fruit{
    public double price()
    {
        return weight * 3.9;
    }
    public Plum(double weight) {
        this.weight = weight;
    }
}
