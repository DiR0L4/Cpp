package task4;
import java.util.Random;
import java.util.Scanner;

public class Task {
    public static void task4()
    {
        Random random = new Random();
        Scanner inp = new Scanner(System.in);
        int n = random.nextInt(1,10);
        int i;
        do {
            System.out.println("Enter value: ");
            i = inp.nextInt();
            if(i < n) System.out.println(" > ");
            else if(i > n) System.out.println(" < ");
        }while(i != n);
        System.out.println("Well done !!!");
    }
    public static void main(String[] args) {
        Task.task4();
    }
}
