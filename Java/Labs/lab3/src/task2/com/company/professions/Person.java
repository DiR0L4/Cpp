package task2.com.company.professions;

import java.util.Scanner;

public class Person {
    private int age;
    private String fullName;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Person(int age, String fullName) {
        this.age = age;
        this.fullName = fullName;
    }

    public Person() {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter person age: ");
        age = inp.nextInt();
        inp.nextLine();
        System.out.println("Enter person full name: ");
        fullName = inp.nextLine();
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", fullName='" + fullName + '\'' +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
