package model;

import main.FrameColors;

public abstract class AbstractBikeOption extends AbstractBike{
    protected AbstractBike decoratedBike;

    public AbstractBikeOption(AbstractBike bike) {
        super(bike.getColor());
        decoratedBike = bike;
    }

    public abstract String getOptionName();
    public abstract double getOptionAmount();

    @Override
    public String toString() {
        String price = String.format("%9s", "$" +  getPrice());
        return decoratedBike.getClass().getSimpleName() + price + " Model #" + getPrefix() + " " +
                decoratedBike.getColor() + " frame with Serial #" + getSerial();
    }
}
