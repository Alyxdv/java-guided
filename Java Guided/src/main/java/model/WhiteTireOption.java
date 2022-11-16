package model;

public class WhiteTireOption extends AbstractBikeOption{
    WhiteTireOption(AbstractBike bike) {
        super(bike);
    }

    @Override
    public double getOptionAmount() {
        return 29.99;
    }

    @Override
    public String getOptionName() {
        return "White Tire Upgrade";
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
