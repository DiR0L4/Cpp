package task3;

import java.io.*;

public class Files {
    public static void copy(String file1, String file2)
    {
        char[] arr = new char[25];
        //int size = 0;
        try(BufferedWriter fw = new BufferedWriter(new FileWriter(file2));
            BufferedReader fr = new BufferedReader(new FileReader(file1))){
            fr.read(arr);
            fw.write(arr);

        }catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
