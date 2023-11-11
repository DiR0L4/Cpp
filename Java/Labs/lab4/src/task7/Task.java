package task7;

public class Task {                 // Класс Task отвечает за все действия
    public boolean[] spoons;     // Массив для мониторинга состояния вилок

    public Task() {
        spoons = new boolean[5];
        for(int i = 0; i < 5; i++)
        {
            spoons[i] = true;
        }
    }          // По дефолту заполняем массив вилок состояними true, т.е. все вилки доступны
    public void action(String action)
    {
        System.out.println("Человек " + Thread.currentThread().getName() + action);
            try {
                Thread.sleep(18);
            }catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        if(action == " ест.") System.out.println("Человек " + Thread.currentThread().getName() + " поел.");
    }

    public synchronized void spoon1()                 // Методы для изменения состояния вилок, для каждой по методу
    {
        if(spoons[0] == true)
        {
            //System.out.println("Человек " + Thread.currentThread().getName() + " взял вилку 1");
            spoons[0] = false;
        }
        else {
            //System.out.println("Человек " + Thread.currentThread().getName() + " положил вилку 1");
            spoons[0] = true;
        }
    }
    public synchronized void spoon2()
    {
        if(spoons[1] == true)
        {
            //System.out.println("Человек " + Thread.currentThread().getName() + " взял вилку 2");
            spoons[1] = false;
        }
        else {
            //System.out.println("Человек " + Thread.currentThread().getName() + " положил вилку 2");
            spoons[1] = true;
        }
    }
    public synchronized void spoon3()
    {
        if(spoons[2] == true)
        {
            //System.out.println("Человек " + Thread.currentThread().getName() + " взял вилку 3");
            spoons[2] = false;
        }
        else {
            //System.out.println("Человек " + Thread.currentThread().getName() + " положил вилку 3");
            spoons[2] = true;
        }
    }
    public synchronized void spoon4()
    {
        if(spoons[3] == true)
        {
            //System.out.println("Человек " + Thread.currentThread().getName() + " взял вилку 4");
            spoons[3] = false;
        }
        else {
            //System.out.println("Человек " + Thread.currentThread().getName() + " положил вилку 4");
            spoons[3] = true;
        }
    }
    public synchronized void spoon5()
    {
        if(spoons[4] == true)
        {
            //System.out.println("Человек " + Thread.currentThread().getName() + " взял вилку 5");
            spoons[4] = false;
        }
        else {
            //System.out.println("Человек " + Thread.currentThread().getName() + " положил вилку 5");
            spoons[4] = true;
        }
    }
    public void eat()                                       // Ключевой метод, в котором каждый поток пытается заполучить обе вилки
    {
        switch (Thread.currentThread().getName())
        {
            case "1": if(spoons[0] == true){
                spoon1();
                if(spoons[1] == true)
                {
                    spoon2();
                    action(" ест.");
                    spoon1();
                    spoon2();
                    try {
                        Thread.sleep(20);
                    }catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                    break;
                }
                spoon1();
                action(" разговаривает.");
                break;
            }
                action(" разговаривает.");
            break;

            case "2": if(spoons[1] == true){
                spoon2();
                if(spoons[2] == true)
                {
                    spoon3();
                    action(" ест.");
                    spoon2();
                    spoon3();
                    try {
                        Thread.sleep(20);
                    }catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                    break;
                }
                spoon2();
                action(" разговаривает.");
                break;
            }
                action(" разговаривает.");
                break;

            case "3": if(spoons[2] == true){
                spoon3();
                if(spoons[3] == true)
                {
                    spoon4();
                    action(" ест.");
                    spoon3();
                    spoon4();
                    try {
                        Thread.sleep(20);
                    }catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                    break;
                }
                spoon3();
                action(" разговаривает.");
                break;
            }
                action(" разговаривает.");
                break;

            case "4": if(spoons[3] == true){
                spoon4();
                if(spoons[4] == true)
                {
                    spoon5();
                    action(" ест.");
                    spoon4();
                    spoon5();
                    try {
                        Thread.sleep(20);
                    }catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                    break;
                }
                spoon4();
                action(" разговаривает.");
                break;
            }
                action(" разговаривает.");
                break;

            case "5": if(spoons[4] == true){
                spoon5();
                if(spoons[0] == true)
                {
                    spoon1();
                    action(" ест.");
                    spoon5();
                    spoon1();
                    try {
                        Thread.sleep(20);
                    }catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                    break;
                }
                spoon5();
                action(" разговаривает.");
                break;
            }
                action(" разговаривает.");
                break;

        }
    }
}
