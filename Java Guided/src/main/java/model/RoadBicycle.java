package model;

import main.FrameColors;

public abstract class RoadBicycle extends AbstractBike{

    public RoadBicycle(FrameColors color) {
        super(color);
    }

    @Override
    public String getWheelType() {
        return "Normal";
    }
}
