package task2;
import java.util.Scanner;
public class Task {
    public static void task2()
    {
        Scanner inp = new Scanner(System.in);
        int n;
        do {
            System.out.println("Enter password: "); // 1233
            n = inp.nextInt();
        }while(n != 1233);

        System.out.println("Success !");
    }
    public static void main(String[] args) {
        Task.task2();
    }
}
