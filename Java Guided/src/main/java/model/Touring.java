package model;

import main.FrameColors;

public class Touring extends RoadBicycle{
    public Touring() {
        super(FrameColors.BLUE);
    }

    @Override
    public double getPrice() {
        return 499.99;
    }

    @Override
    public String getPrefix() {
        return "TB901";
    }

    @Override
    public int getStart() {
        return 951357;
    }
}
