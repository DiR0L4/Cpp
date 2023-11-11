package task2.com.company.details;

import java.util.Scanner;

public class Engine {
    private int power;
    private String company;

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Engine(int power, String company) {
        this.power = power;
        this.company = company;
    }

    public Engine() {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter engine power: ");
        power = inp.nextInt();
        inp.nextLine();
        System.out.println("Enter engine company: ");
        company = inp.nextLine();
    }

    @Override
    public String toString() {
        return "Engine{" +
                "power=" + power +
                ", company='" + company + '\'' +
                '}';
    }
}
