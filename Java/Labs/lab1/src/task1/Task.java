package task1;
import java.util.Scanner;


public class Task {
    public static void task1()
    {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = inp.nextInt();
        int buff = n;
        for(int i = 0; i < 4; i++)
        {
            System.out .println("1) " + buff);
            buff *= n;
        }
    }

    public static void main(String[] args) {
        Task.task1();
    }
}
