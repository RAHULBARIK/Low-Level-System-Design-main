package org.example.designPattern.StrategyDesignPattern.WithStrategyPattern;

import org.example.designPattern.StrategyDesignPattern.WithStrategyPattern.Strategy.SportsDriveStrategy;
import org.example.designPattern.StrategyDesignPattern.WithStrategyPattern.Vehicle;

public class OffRoadVehicle extends Vehicle {

    public OffRoadVehicle(){
        super(new SportsDriveStrategy());
    }
}
