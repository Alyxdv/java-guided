package model;

import main.FrameColors;

public class Downhill extends MountainBicycle{

    public Downhill() {
        super(FrameColors.BLACK);
    }

    @Override
    public double getPrice() {
        return 699.99;
    }

    @Override
    public String getPrefix() {
        return "DB505";
    }

    @Override
    public int getStart() {
        return 852654;
    }
}
