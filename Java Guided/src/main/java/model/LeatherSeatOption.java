package model;

public class LeatherSeatOption extends AbstractBikeOption{

    public LeatherSeatOption(AbstractBike bike) {
        super(bike);
    }

    @Override
    public String getOptionName() {
        return "Leather Seat Upgrade";
    }

    @Override
    public double getOptionAmount() {
        return 98.99;
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
