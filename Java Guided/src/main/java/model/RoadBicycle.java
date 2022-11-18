package model;

import main.FrameColors;

public abstract class RoadBicycle extends AbstractBike{

    public RoadBicycle(FrameColors color) {
        super(color);
    }

    @Override
    public double getOptionAmount() {
        return 0;
    }

    @Override
    public String getOptionName() {
        return null;
    }

    @Override
    public String getWheelType() {
        return "Normal";
    }
}
