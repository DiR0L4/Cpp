package task2;

import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;

import static java.lang.Math.abs;

public class Numbers {
    List<Integer> list;

    public Numbers() {
        list = new ArrayList<>();
    }
    public void listInfo()
    {
        list.forEach(System.out::println);
    }
    public void add(Integer a)
    {
        list.add(a);
    }
    public void remove(Integer a)
    {
        list.remove(a);
    }

    public void search(Integer a)
    {
        ListIterator<Integer> iterator = list.listIterator();
        int min = list.get(0);
        if(!list.isEmpty())
        {
            while(iterator.hasNext())
            {
                Integer el = iterator.next();
                if(abs(a - el) < abs(a - min)) min = el;
            }
        }
        System.out.println("Nearest number to " + a + ": " + min);
    }
}
