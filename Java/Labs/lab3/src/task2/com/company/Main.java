package task2.com.company;

import task2.com.company.vehicles.SportCar;

public class Main {
    public static void main(String[] args)
    {
        SportCar car = new SportCar();
        System.out.println(car.toString());
        car.start();
        car.stop();
    }

}
