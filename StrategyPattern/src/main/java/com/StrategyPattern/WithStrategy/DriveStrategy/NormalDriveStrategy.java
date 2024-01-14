package com.StrategyPattern.WithStrategy.DriveStrategy;

public class NormalDriveStrategy implements DriveStrategy{

    @Override
    public void drive() {
        System.out.println("normal drive strategy");
    }
}
