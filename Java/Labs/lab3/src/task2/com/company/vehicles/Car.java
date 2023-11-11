package task2.com.company.vehicles;

import task2.com.company.details.Engine;
import task2.com.company.professions.Driver;

import java.util.Scanner;

public class Car {
    private String carClass;
    private Engine engine;
    private Driver driver;
    private String marka;

    public String getCarClass() {
        return carClass;
    }

    public void setCarClass(String carClass) {
        this.carClass = carClass;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public Car(String carClass, Engine engine, Driver driver, String marka) {
        this.carClass = carClass;
        this.engine = engine;
        this.driver = driver;
        this.marka = marka;
    }
    public Car()
    {
        engine = new Engine();
        driver = new Driver();
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter car marka: ");
        marka = inp.nextLine();
        System.out.println("Enter car class: ");
        carClass = inp.nextLine();
    }

    @Override
    public String toString() {
        return "Car{" +
                "carClass='" + carClass + '\'' +
                engine.toString() +
                ", " + driver.toString() +
                ", marka='" + marka + '\'' +
                '}';
    }
    public void start()
    {
        System.out.println("Start");
    }
    public void stop()
    {
        System.out.println("Stop");
    }
    public void turnRight()
    {
        System.out.println("Turn right");
    }
    public void turnLeft()
    {
        System.out.println("Turn left");
    }

}
