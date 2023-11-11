package task7;

public class Table implements Runnable{
    private Task task;
    public Table(Task task) {
        this.task = task;
    }

    @Override
    public void run() {
        for(int i = 0; i < 20; i++)        // Определяем количество попыток поесть для каждого человека
        {
            task.eat();
        }
    }
}
