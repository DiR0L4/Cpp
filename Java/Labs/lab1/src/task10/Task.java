package task10;

import java.util.Random;

public class Task {
    public static void task10()
    {
        Random random = new Random();
        int n = random.nextInt(0, 28800);
        System.out.println(n + " секунд");
        n /= 3600;
        if(n > 4 || n == 0) System.out.println(n + " часов");
        else  if(n < 5 && n > 1) System.out.println(n + " часа");
        else System.out.println(n + " час");
    }
    public static void main(String[] args) {
        Task.task10();
    }
}
