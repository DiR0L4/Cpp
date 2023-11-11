package task9;

import java.util.Random;

public class Task {
    public static void task9()
    {
        Random random = new Random();
        int n = random.nextInt(5, 155);
        if(n > 25 && n < 100) System.out.println("25 < " + n + " < 100");
        else System.out.println(n + " ∉ (25, 100)");
    }
    public static void main(String[] args) {
        Task.task9();
    }
}
