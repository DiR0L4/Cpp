package task4;

public class Book implements Printable{
    public String name;

    public Book(String name) {
        this.name = name;
    }

    public void print()
    {
        System.out.println("Book name: " + name);
    }
}
