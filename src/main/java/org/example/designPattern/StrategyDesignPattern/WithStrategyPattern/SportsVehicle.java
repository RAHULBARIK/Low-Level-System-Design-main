package org.example.designPattern.StrategyDesignPattern.WithStrategyPattern;

import org.example.designPattern.StrategyDesignPattern.WithStrategyPattern.Strategy.SportsDriveStrategy;
import org.example.designPattern.StrategyDesignPattern.WithStrategyPattern.Vehicle;

public class SportsVehicle extends Vehicle {

    public SportsVehicle(){
        super(new SportsDriveStrategy());
    }
}
