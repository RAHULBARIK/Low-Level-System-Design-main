package org.example.designPattern.StrategyDesignPattern.WithStrategyPattern;

public class Main {
    public static void main(String[] args) {

        Vehicle vehicle = new SportsVehicle();
        vehicle.drive();

        Vehicle vehicle1 = new GoodsVehicle();
        vehicle1.drive();

        Vehicle vehicle2 = new PassengerVehicle();
        vehicle2.drive();

        Vehicle vehicle3 = new OffRoadVehicle();
        vehicle3.drive();

    }
}
