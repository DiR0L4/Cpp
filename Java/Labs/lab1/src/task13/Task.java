package task13;

import java.util.Random;

public class Task {
    public static void task13()
    {
        Random random = new Random();
        int n, m;
        int arr[][] = new int[8][8];
        for(int i = 0; i < 8; i++)
        {
            for(int j = 0; j < 8; j++)
            {
                arr[i][j] = (i + 2) * (j + 2);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int buff = 0;
        while(buff < 15)
        {
            n = random.nextInt(2, 9);
            m = random.nextInt(2, 9);
            if(arr[m - 2][n - 2] != 0)
            {
                System.out.println(m + " * " + n + " = " + arr[m - 2][n - 2]);
                arr[m - 2][n - 2] = 0;
                arr[n - 2][m - 2] = 0;
                buff++;
            }
        }
    }
    public static void main(String[] args) {
        Task.task13();
    }
}
