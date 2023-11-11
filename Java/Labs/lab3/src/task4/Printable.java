package task4;

public interface Printable {
    public void print();
    public static void printMagazines(Printable[] printable)
    {
        for(Printable x : printable) if(x instanceof Magazine) x.print();
    }
    public static void printBooks(Printable[] printable)
    {
        for(Printable x : printable) if(x instanceof Book) x.print();
    }

    public static void main(String[] args)
    {
        Printable[] arr = new Printable[3];
        arr[0] = new Book("Bebra");
        arr[1] = new Magazine("Cats");
        arr[2] = new Book("Nikita");
        Printable.printMagazines(arr);
        Printable.printBooks(arr);
    }

}
