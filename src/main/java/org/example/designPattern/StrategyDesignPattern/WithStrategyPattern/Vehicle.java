package org.example.designPattern.StrategyDesignPattern.WithStrategyPattern;

import org.example.designPattern.StrategyDesignPattern.WithStrategyPattern.Strategy.DriveStrategy;

public class Vehicle {

    DriveStrategy driveStrategy;

    public  Vehicle(DriveStrategy driveStrategy){
        this.driveStrategy = driveStrategy;
    }
    public void drive() {
        //Some Code
        driveStrategy.drive();
    }
}
