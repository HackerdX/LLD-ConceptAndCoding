package com.StrategyPattern.WithStrategy.DriveStrategy;

public class SportyDriveStrategy implements DriveStrategy{

    @Override
    public void drive() {
        System.out.println("sporty drive strategy");
    }
}
