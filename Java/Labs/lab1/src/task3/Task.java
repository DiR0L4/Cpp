package task3;
import java.util.Scanner;

public class Task {
    public static void task3()
    {
        Scanner inp = new Scanner(System.in);
        double n;
        do {
            System.out.println("Enter n: ");
            n = inp.nextInt();
        }while(n > 4 || n < 1);
        n = Math.pow(10, n);
        int sum = 0;
        for(int i = 0; i < n; i++)
        {
            sum += i;
            System.out.println(i);
        }
        System.out.println("Sum: " + sum);
    }
    public static void main(String[] args) {
        Task.task3();
    }
}
