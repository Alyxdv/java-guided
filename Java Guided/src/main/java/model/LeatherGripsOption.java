package model;

public class LeatherGripsOption extends AbstractBikeOption{

    public LeatherGripsOption(AbstractBike bike) {
        super(bike);
    }

    @Override
    public String getOptionName() {
        return "Leather Grips Upgrade";
    }

    @Override
    public double getOptionAmount() {
        return 49.99;
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
