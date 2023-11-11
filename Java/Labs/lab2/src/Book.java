import java.util.Scanner;

public class Book {
    public String author;
    public String name;
    public String year;
    public int pages;

    public Book()
    {
        author = "-";
        name = "-";
        year = "-";
        pages = 0;
    }
    public Book(String author, String name, String year, int pages)
    {
        this.author = author;
        this.name = name;
        this.year = year;
        this.pages = pages;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public static void bookShow(Book[] library, String name)
    {
        boolean flag = true;
        for(Book x : library)
        {
            if(x.name.equals(name))
            {
                System.out.println("Author: " + x.author + " Year: " + x.year + " Pages: " + x.pages);
                flag = false;
                break;
            }
        }
        if(flag) System.out.println("Book not found");
    }
    public void setAuthor() {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter author:");
        String author = inp.nextLine();
        this.author = author;
    }

    public void setName() {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter name:");
        String name = inp.nextLine();
        this.name = name;
    }

    public void setYear() {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter year:");
        String year = inp.nextLine();
        this.year = year;
    }

    public void setPages() {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter pages:");
        int pages = inp.nextInt();
        this.pages = pages;
    }
}
