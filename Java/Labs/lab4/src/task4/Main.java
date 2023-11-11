package task4;

public class Main {
    public static void main(String[] args) {

        Task.serializeHorse();
        Horse horse = Task.deserializeHorse();
        System.out.println(horse.toString());
    }
}
