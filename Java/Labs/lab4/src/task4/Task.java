package task4;

import java.io.*;

public class Task {
    public static void serializeHorse()
    {
        Horse horse = new Horse(154, 106, "Lala");
        try(FileOutputStream fs = new FileOutputStream("C:\\LAB\\lab4\\src\\task4\\serHorse.ser");
            ObjectOutputStream os = new ObjectOutputStream(fs))
        {
            os.writeObject(horse);
        }catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
    }

    public static Horse deserializeHorse()
    {
        Horse horse = null;
        try(FileInputStream fis = new FileInputStream("C:\\LAB\\lab4\\src\\task4\\serHorse.ser");
        ObjectInputStream ois = new ObjectInputStream(fis))
        {
            horse = (Horse) ois.readObject();
        }catch(IOException | ClassNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
        return horse;
    }
}
