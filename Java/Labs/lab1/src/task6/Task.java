package task6;

public class Task {
    public static void task6()
    {
        int a1 = 1, a2 = 1;
        int i = 0;
        while(i < 5) {
            System.out.println(a1);
            System.out.println(a2);
            a1 = a2 + a1;
            a2 += a1;
            i++;
        }
        System.out.println(a1);
    }
    public static void main(String[] args) {
        Task.task6();
    }
}
