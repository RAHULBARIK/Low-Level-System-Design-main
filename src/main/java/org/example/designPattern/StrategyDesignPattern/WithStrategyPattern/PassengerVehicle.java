package org.example.designPattern.StrategyDesignPattern.WithStrategyPattern;

import org.example.designPattern.StrategyDesignPattern.WithStrategyPattern.Strategy.NormalDriveStrategy;
import org.example.designPattern.StrategyDesignPattern.WithStrategyPattern.Vehicle;

public class PassengerVehicle extends Vehicle {

    public PassengerVehicle(){
        super(new NormalDriveStrategy());
    }

}
