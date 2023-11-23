package org.example.designPattern.StrategyDesignPattern.WithStrategyPattern;

import org.example.designPattern.StrategyDesignPattern.WithStrategyPattern.Strategy.NormalDriveStrategy;

public class GoodsVehicle extends Vehicle{


    public GoodsVehicle(){
        super( new NormalDriveStrategy());
    }

}
