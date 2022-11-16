package model;

import main.FrameColors;

public class CrossCountry extends MountainBicycle{

    public CrossCountry() {
        super(FrameColors.GREEN);
    }

    @Override
    public double getPrice() {
        return 599.99;
    }

    @Override
    public int getStart() {
        return 258456;
    }

    @Override
    public String getPrefix() {
        return "MB605";
    }
}
