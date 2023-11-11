package task2.com.company.professions;

import java.util.Scanner;

public class Driver extends Person{
    private int experience;

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public Driver(int age, String fullName, int experience) {
        super(age, fullName);
        this.experience = experience;
    }

    public Driver() {
        super();
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter driver experience: ");
        experience = inp.nextInt();
    }

    @Override
    public String toString() {
        return "Driver{" +
                "experience=" + experience +
                ", fullName='" + this.getFullName() + '\'' +
                '}';
    }
}
