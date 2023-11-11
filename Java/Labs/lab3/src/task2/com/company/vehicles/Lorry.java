package task2.com.company.vehicles;

import task2.com.company.details.Engine;
import task2.com.company.professions.Driver;

import java.util.Scanner;

public class Lorry extends Car{
    private int  carrying;

    public int getCarrying() {
        return carrying;
    }

    public void setCarrying(int carrying) {
        this.carrying = carrying;
    }

    public Lorry(String carClass, Engine engine, Driver driver, String marka, int carrying) {
        super(carClass, engine, driver, marka);
        this.carrying = carrying;
    }

    public Lorry() {
        super();
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter carrying: ");
        carrying = inp.nextInt();
    }

    @Override
    public String toString() {
        return "SportCar{" +
                "carrying=" + carrying +
                ", carClass='" + this.getCarClass() + '\'' +
                this.getEngine().toString() +
                ", " + this.getDriver().toString() +
                ", marka='" + this.getMarka() + '\'' +
                '}';
    }
}
