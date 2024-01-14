package com.StrategyPattern.WithStrategy;

import com.StrategyPattern.WithStrategy.DriveStrategy.DriveStrategy;
import com.StrategyPattern.WithStrategy.DriveStrategy.SportyDriveStrategy;
import com.StrategyPattern.WithStrategy.Vehicle;

public class SportsVehicle extends Vehicle {
    public SportsVehicle() {
        super(new SportyDriveStrategy());
    }

}
