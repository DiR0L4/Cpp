package task3;

abstract class Fruit {
    public double weight;
    final public void printManufacturerInfo(){System.out.print("Made in RB");}
    abstract public double price();
    public static void main(String[] args)
    {
        Plum plum = new Plum(0.05);
        Apple apple = new Apple(0.1);
        Pear pear = new Pear(0.13);

        System.out.println("Plum price: " + plum.price());
        System.out.println("Apple price: " + apple.price());
        System.out.println("Pear price: " + pear.price());

        double buff = plum.price() + pear.price() + apple.price();
        System.out.println("Full price: " + buff);
    }
}
