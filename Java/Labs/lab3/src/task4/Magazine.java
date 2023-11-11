package task4;

public class Magazine implements Printable{
    public String name;

    public Magazine(String name) {
        this.name = name;
    }

    public void print()
    {
        System.out.println("Magazine name: " + name);
    }
}
