package task2;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Numbers numbers = new Numbers();
        numbers.add(5);
        numbers.add(1);
        numbers.add(53);
        numbers.add(-3);

        numbers.listInfo();

        numbers.remove(53);
        numbers.remove(4);
        numbers.remove(1);

        numbers.listInfo();
        numbers.search(-20);
    }
}
