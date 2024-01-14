package com.StrategyPattern.WithStrategy;

import com.StrategyPattern.WithStrategy.DriveStrategy.DriveStrategy;
import com.StrategyPattern.WithStrategy.DriveStrategy.SportyDriveStrategy;
import com.StrategyPattern.WithStrategy.Vehicle;

public class OffRoadVehicle extends Vehicle {
    public OffRoadVehicle() {
        super(new SportyDriveStrategy());
    }

}
