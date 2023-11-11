package task6;

public class TaskStream implements Runnable{
    @Override
    public void run() {
        for(int i = 0; i < 100; i++)
        {
            if(i % 10 == 0) {
                System.out.println("Поток " + Thread.currentThread().getName() + ": " + i);
                try {
                    Thread.sleep(150);
                }catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("Поток " + Thread.currentThread().getName() + " завершил своё выполнение");
    }
}
