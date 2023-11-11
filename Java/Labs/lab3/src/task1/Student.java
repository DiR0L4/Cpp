package task1;

import java.util.Scanner;

public class Student {
    String firstName, lastName, group;
    double averageMark;

    public Student(String firstName, String lastName, String group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    public Student() {
    }

    public String getScholarship()
    {
        if(averageMark < 8) return "80 rub";
        return "100 rub";
    }
    public static void main(String[] args)
    {
        Student arr[] = new Student[3];
        arr[0] = new Student("Nikita", "Sobakov", "163103", 7);
        arr[1] = new Magistracy("Stas", "Smok", "163104", 10, "Bebra");
        arr[2] = new Magistracy("Mark", "Petrov", "163102", 5, "Java");
        for(Student x : arr)
        {
            System.out.println(x.firstName + " " + x.lastName + " has scholarship " + x.getScholarship());
        }
    }
}
