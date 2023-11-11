package task14;

import java.util.Random;
import java.util.Scanner;

public class Task {
    public static void task14()
    {
        Random random = new Random();
        Scanner inp = new Scanner(System.in);
        int n, m;
        System.out.println("Matrix A[m][n]");
        System.out.println("Enter n: ");
        n = inp.nextInt();
        System.out.println("Enter m: ");
        m = inp.nextInt();
        int arr[][] = new int[m][n];
        int maxJ = 0, minJ = n - 1;
        int buff = 0;
        System.out.println("First matrix: ");
        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < n; j++)
            {
                arr[i][j] = random.nextInt(-15, 15);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < n; j++)
            {
                if(arr[i][minJ] > arr[i][j]) minJ = j;
            }
            buff = arr[i][0];
            arr[i][0] = arr[i][minJ];
            arr[i][minJ] = buff;
            for(int j = 0; j < n; j++)
            {
                if(arr[i][maxJ] < arr[i][j]) maxJ = j;
            }
            buff = arr[i][n - 1];
            arr[i][n - 1] = arr[i][maxJ];
            arr[i][maxJ] = buff;
        }
        System.out.println("Second matrix: ");
        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < n; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Task.task14();
    }
}
