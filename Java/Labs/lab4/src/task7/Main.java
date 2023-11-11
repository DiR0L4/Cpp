package task7;

public class Main {
    public static void main(String[] args) {

        Task task = new Task();
        Table table = new Table(task);

        Thread t1 = new Thread(table);               // Создаём потоки, даём им имена и запускаем их
        t1.setName("1");
        Thread t2 = new Thread(table);
        t2.setName("2");
        Thread t3 = new Thread(table);
        t3.setName("3");
        Thread t4 = new Thread(table);
        t4.setName("4");
        Thread t5 = new Thread(table);
        t5.setName("5");

        t2.start();
        t1.start();
        t3.start();
        t5.start();
        t4.start();
    }

}
