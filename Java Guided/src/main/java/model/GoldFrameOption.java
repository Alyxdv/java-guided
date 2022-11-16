package model;

import main.FrameColors;

public class GoldFrameOption extends AbstractBikeOption{

    public GoldFrameOption(AbstractBike bike) {
        super(bike);
        setColor();
        //paintFrame(FrameColors.GOLD);
    }

    @Override
    public double getOptionAmount() {
        return 299.99;
    }

    @Override
    public String getOptionName() {
        return "Gold Frame Upgrade";
    }

    @Override
    public FrameColors getColor() {
        return FrameColors.GOLD;
    }

    private void setColor() {
        decoratedBike.paintFrame(FrameColors.GOLD);
    }

    @Override
    public double getPrice() {
        return decoratedBike.getPrice();
    }

    @Override
    public int getStart() {
        return decoratedBike.getStart();
    }

    @Override
    public String getPrefix() {
        return decoratedBike.getPrefix();
    }

    @Override
    public String getWheelType() {
        return decoratedBike.getWheelType();
    }
}
