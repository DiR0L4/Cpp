package task11;

import java.util.Random;

public class Task {
    public static void task11()
    {
        Random random = new Random();
        int arr[] = new int[12];
        int max = 0;
        for(int i = 0; i < 12; i++)
        {
            arr[i] = random.nextInt(-15, 15);
            System.out.print(arr[i] + " ");
            if(arr[max] <= arr[i]) max = i;
        }
        System.out.println();
        System.out.println("Index of the max element: " + max);
    }
    public static void main(String[] args) {
        Task.task11();
    }
}
