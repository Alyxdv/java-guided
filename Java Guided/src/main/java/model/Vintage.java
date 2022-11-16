package model;

import main.FrameColors;

public class Vintage extends RoadBicycle{

    public Vintage() {
        super(FrameColors.RED);
    }

    @Override
    public double getPrice() {
        return 299.99;
    }

    @Override
    public String getPrefix() {
        return "VB801";
    }

    @Override
    public int getStart() {
        return 753159;
    }
}
