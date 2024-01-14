package com.StrategyPattern.WithStrategy;

import com.StrategyPattern.WithStrategy.DriveStrategy.DriveStrategy;
import com.StrategyPattern.WithStrategy.DriveStrategy.NormalDriveStrategy;
import com.StrategyPattern.WithStrategy.Vehicle;

public class GoodsVehicle extends Vehicle {
    public GoodsVehicle() {
        super(new NormalDriveStrategy());
    }

}
