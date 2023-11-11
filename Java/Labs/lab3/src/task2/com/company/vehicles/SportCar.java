package task2.com.company.vehicles;

import task2.com.company.details.Engine;
import task2.com.company.professions.Driver;

import java.util.Scanner;

public class SportCar extends Car{
    private double  speed;

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public SportCar(String carClass, Engine engine, Driver driver, String marka, double speed) {
        super(carClass, engine, driver, marka);
        this.speed = speed;
    }

    public SportCar() {
        super();
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter max speed: ");
        speed = inp.nextDouble();
    }

    @Override
    public String toString() {
        return "SportCar{" +
                "speed=" + speed +
                ", carClass='" + this.getCarClass() + '\'' +
                this.getEngine().toString() +
                ", " + this.getDriver().toString() +
                ", marka='" + this.getMarka() + '\'' +
                '}';
    }
}
