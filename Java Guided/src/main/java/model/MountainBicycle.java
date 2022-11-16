package model;

import main.FrameColors;

public abstract class MountainBicycle extends AbstractBike{
    public MountainBicycle(FrameColors color) {
        super(color);
    }

    @Override
    public String getWheelType() {
        return "Wide";
    }
}
