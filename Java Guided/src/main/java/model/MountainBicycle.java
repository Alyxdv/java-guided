package model;

import main.FrameColors;

public abstract class MountainBicycle extends AbstractBike{
    public MountainBicycle(FrameColors color) {
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
        return "Wide";
    }
}
