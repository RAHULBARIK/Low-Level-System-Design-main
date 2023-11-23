package org.example.designPattern.StrategyDesignPattern.WithStrategyPattern.Strategy;

public class SportsDriveStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("Sports Drive Strategy");
    }
}
