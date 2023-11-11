import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean flag = true;
        int buff = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter task number:");
            buff = scanner.nextInt();
            switch (buff)
            {
                case 1:
                    Circle aa = new Circle(3, 1, 2);
                    aa.show();
                    System.out.println("Square: " + aa.square());
                    System.out.println("Length: " + aa.length());
                    break;
                case 2:
                    Warehouse milk = new Warehouse(11, 4);
                    Warehouse coffee = new Warehouse(5, 10);
                    milk.priceDiff(coffee);
                    System.out.println("Coffee income: " + coffee.fullPrice());
                    System.out.println("Total: " + milk.count(coffee));
                    break;
                case 3:
                    Book book1 = new Book();
                    Book book2 = new Book("Jack London", "Martin Eden", "1909", 289);
                    book1.setAuthor(); // Jack London
                    book1.setName();  // White fang
                    book1.setYear();  // 1906
                    book1.setPages();  // 151
                    Book[] library = {book1, book2};
                    Book.bookShow(library, "White fang");
                    break;
                case 4:
                    Fraction f1 = new Fraction(1, 2);
                    Fraction f2 = new Fraction(1, 4);
                    Fraction f3 = new Fraction(1, 3);

                    System.out.println("Sum: ");
                    Fraction.sum(f1, f2, f3).show();
                    System.out.println("Mult: ");
                    Fraction.mult(f1, f2, f3).show();
                    System.out.println("Diff: ");
                    Fraction.diff(f1, f2).show();
                    Fraction[] arr = {f1, f2, f3};
                    Fraction.task(arr);
                    break;
                case 5:
                    Double d1 = Double.valueOf(3);
                    Double d2 = Double.valueOf("3.14");

                    double d3 = Double.parseDouble("1.2");
                    boolean b = Boolean.valueOf(d1.toString());
                    System.out.println(b);
                    byte bt = d2.byteValue();
                    System.out.println(bt);
                    short s = d2.shortValue();
                    System.out.println(s);
                    int i = d2.intValue();
                    System.out.println(i);
                    long l = d2.longValue();
                    System.out.println(l);
                    float f = d2.floatValue();
                    System.out.println(f);
                    char c = d2.toString().charAt(0);
                    System.out.println(c);
                    break;
                case 6:
                    Bebra.task("I like Java!!!");
                    break;
            }

        }while(flag);

    }
}