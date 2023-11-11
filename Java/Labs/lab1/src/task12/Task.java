package task12;

import java.util.Random;
import java.util.Scanner;

public class Task {
    public static void task12()
    {
        Random random = new Random();
        Scanner inp = new Scanner(System.in);
        int n = 0;
        do{
            System.out.println("Enter n > 3: ");
            if(inp.hasNextInt())
            {
                n = inp.nextInt();
            }
        }while(n <= 3);

        int arr[] = new int[n];
        int pp = 0;
        System.out.println("First array: ");
        for(int i = 0; i < n; i++)
        {
            arr[i] = random.nextInt(0, n);
            System.out.print(arr[i] + " ");
            if(arr[i] % 2 == 0) pp++;
        }
        System.out.println();
        System.out.println("Second array: ");
        int arr2[] = new int[pp];
        for(int i = 0, i2 = 0; i < n; i++)
        {
            if(arr[i] % 2 == 0)
            {
                arr2[i2] = arr[i];
                System.out.print(arr2[i2] + " ");
                i2++;
            }
        }
    }
    public static void main(String[] args) {
        Task.task12();
    }
}
