package task6;

public class Main {
    public static void main(String[] args) {

        TaskStream taskStream = new TaskStream();
        Thread t1 = new Thread(taskStream);
        t1.setName("1");
        Thread t2 = new Thread(taskStream);
        t2.setName("2");
        Thread t3 = new Thread(taskStream);
        t3.setName("3");

        t1.start();
        t2.start();
        t3.start();
    }
}
