package task7;

public class Task {
    public static void task7()
    {
        int a = 0, b = 0;
        int rez = 0;
        for(int i = 0; i < 1000000; i++)
        {
            a = (int)(i % 10) + (int)(i / 10 % 10) + (int)(i / 100 % 10);
            b = (int)(i / 1000 % 10) + (int)(i / 10000 % 10) + (int)(i / 100000 % 10);
            if(a == b)
            {
                rez++;
                System.out.println(i);
            }

        }
        System.out.println(rez);
    }
    public static void main(String[] args) {
        Task.task7();
    }
}
